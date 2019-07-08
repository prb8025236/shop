package com.mini.entity;

import java.util.Date;

/**
 * Created by Wesley on 2019/7/8
 *
 * @Author Wesley
 * @Date 2019/7/8 23:11
 **/
public class EmailEnclosureDTO {
    private String eId;

    private String emailId;

    private String encName;

    private String enclosure;

    private String paramStr;

    private String paramStr1;

    private Boolean isDeleted;

    private Date createTime;

    private Date updateTime;

    public String geteId() {
        return eId;
    }

    public void seteId(String eId) {
        this.eId = eId;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public String getEncName() {
        return encName;
    }

    public void setEncName(String encName) {
        this.encName = encName;
    }

    public String getEnclosure() {
        return enclosure;
    }

    public void setEnclosure(String enclosure) {
        this.enclosure = enclosure;
    }

    public String getParamStr() {
        return paramStr;
    }

    public void setParamStr(String paramStr) {
        this.paramStr = paramStr;
    }

    public String getParamStr1() {
        return paramStr1;
    }

    public void setParamStr1(String paramStr1) {
        this.paramStr1 = paramStr1;
    }

    public Boolean getDeleted() {
        return isDeleted;
    }

    public void setDeleted(Boolean deleted) {
        isDeleted = deleted;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}
