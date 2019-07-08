package com.mini.shop.utils;

import com.google.gson.Gson;
import com.mini.entity.EmailContentEntity;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Properties;

public class MailUtils {

    private static Logger logger = LoggerFactory.getLogger(MailUtils.class);

    //发送邮件
    public static boolean sendEmail(EmailContentEntity upEntity) throws Exception {

        // 获取系统属性
        Properties properties = null;
        System.clearProperty("mail.smtp.starttls.enable");
        System.clearProperty("mail.smtp.ssl.enable");
        System.clearProperty("mail.host");
        System.clearProperty("mail.transport.protocol");
        System.clearProperty("mail.smtp.host");
        properties = System.getProperties();
        // 设置邮件服务器
//        添加properties信息
        properties.put("mail.smtp.auth", "true");
        // 发送邮件协议名称
        properties.setProperty("mail.smtp.port", String.valueOf(upEntity.getPort()));
        if (upEntity.getAgreement() != null) {
            if (upEntity.getAgreement().equalsIgnoreCase("STARTTLS")) {
                properties.setProperty("mail.host", upEntity.getHost());
                properties.setProperty("mail.transport.protocol", "smtp");
                properties.put("mail.smtp.starttls.enable", "true");
            } else if (upEntity.getAgreement().equalsIgnoreCase("SSL")) {
                properties.setProperty("mail.smtp.host", upEntity.getHost());
                properties.put("mail.smtp.ssl.enable", "true");
            }
        } else {
            //TODO 待添加
        }

        // 获取默认session对象
        Session session = Session.getInstance(properties);
//        try {
        // 创建默认的 MimeMessage 对象
        MimeMessage message = new MimeMessage(session);

        message.setFrom(new InternetAddress(upEntity.getUsername()));
        List<String> emails = upEntity.getEmails();
        InternetAddress[] internetAddressTo = new InternetAddress[emails.size()];
        InternetAddress Address;
        for (int i = 0; i < emails.size(); i++) {
            Address = new InternetAddress();
            Address.setAddress(emails.get(i).replace(" ", ""));
            internetAddressTo[i] = Address;
        }
        message.addRecipients(Message.RecipientType.TO, internetAddressTo);
        // set cc ：抄送
        List<String> ccEmail = upEntity.getCcEmail();
        if (ccEmail != null && ccEmail.size() > 0) {

            InternetAddress[] internetAddressTCC = new InternetAddress[ccEmail.size()];
            InternetAddress internetAddress;
            if (ccEmail.size() > 0) {
                for (int i = 0; i < ccEmail.size(); i++) {
                    internetAddress = new InternetAddress();
                    internetAddress.setAddress(ccEmail.get(i).replace(" ", ""));
                    internetAddressTCC[i] = internetAddress;
                }
            }
            message.addRecipients(Message.RecipientType.CC, internetAddressTCC);
        }
        message.setSubject(upEntity.getTitle());

        //正文
        MimeBodyPart text = new MimeBodyPart();
        text.setContent(upEntity.getContent(), "text/html;charset=UTF-8");
        //添加附件
        List<CloudEmailEnclosureDTO> enclosureList = upEntity.getEnclosureList();
        Multipart multipart = new MimeMultipart();//向multipart对象中添加邮件的各个部分内容，包括文本内容和附件
        multipart.addBodyPart(text);
        try {
            for (CloudEmailEnclosureDTO cloudEmailEnclosureDTO : enclosureList) {
                //添加附件
                BodyPart messageBodyPart = new MimeBodyPart();
                String p = StringUtils.replace(cloudEmailEnclosureDTO.getEnclosure(), "\\", "/");
                DataSource source = new FileDataSource(p);
                messageBodyPart.setDataHandler(new DataHandler(source));
                //添加附件的内容
                messageBodyPart.setFileName(MimeUtility.encodeWord(cloudEmailEnclosureDTO.getEncName()));
                multipart.addBodyPart(messageBodyPart);
            }
        } catch (Exception e) {
            logger.error("SEND_EMAIL>>addBodyPart::MSG:" + e.getMessage() + "***CAE:" + e.getCause());
        }
        message.setContent(multipart);//将multipart对象放到message中
        message.setSentDate(new Date());
        Transport.send(message, upEntity.getUsername(), DESUtil.getDecryptString(upEntity.getPassword()));
        properties.clear();
        logger.info(new Gson().toJson(upEntity.getTitle()+upEntity.getEmails()));
        return true;
    }


    /**
     * 格式化时间
     *
     * @param date
     * @return
     */
    public static String formatTime(Date date) {
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.format(date);
    }


}
