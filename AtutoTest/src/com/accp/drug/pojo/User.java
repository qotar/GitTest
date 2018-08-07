package com.accp.drug.pojo;

import java.util.Date;

public class User {
    private String UID;

    private String UName;

    private String loginPwd;

    private Integer sex;

    private String RID;

    private String phone;

    private String address;

    private String photo;

    private Date bortDate;

    private Integer isdel;

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID == null ? null : UID.trim();
    }

    public String getUName() {
        return UName;
    }

    public void setUName(String UName) {
        this.UName = UName == null ? null : UName.trim();
    }

    public String getLoginPwd() {
        return loginPwd;
    }

    public void setLoginPwd(String loginPwd) {
        this.loginPwd = loginPwd == null ? null : loginPwd.trim();
    }

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public String getRID() {
        return RID;
    }

    public void setRID(String RID) {
        this.RID = RID == null ? null : RID.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address == null ? null : address.trim();
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo == null ? null : photo.trim();
    }

    public Date getBortDate() {
        return bortDate;
    }

    public void setBortDate(Date bortDate) {
        this.bortDate = bortDate;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}