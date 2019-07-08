package com.mini.entity;

import java.util.List;

/**
 * Created by Wesley on 2019/7/8
 *
 * @Author Wesley
 * @Date 2019/7/8 23:11
 **/
public class EmailContentEntity extends EmailServerDTO {
    private List<String> emails;
    private List<String> ccEmail;
    private String title;
    private String content;
    private List<EmailEnclosureDTO> enclosureList;

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public List<String> getCcEmail() {
        return ccEmail;
    }

    public void setCcEmail(List<String> ccEmail) {
        this.ccEmail = ccEmail;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<EmailEnclosureDTO> getEnclosureList() {
        return enclosureList;
    }

    public void setEnclosureList(List<EmailEnclosureDTO> enclosureList) {
        this.enclosureList = enclosureList;
    }
}
