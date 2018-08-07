package com.accp.drug.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Shift {
    private Integer shiftID;

    private String UID;

    private Date shiftTime;

    private BigDecimal money;

    private String comment;

    private Integer isdel;

    public Integer getShiftID() {
        return shiftID;
    }

    public void setShiftID(Integer shiftID) {
        this.shiftID = shiftID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID == null ? null : UID.trim();
    }

    public Date getShiftTime() {
        return shiftTime;
    }

    public void setShiftTime(Date shiftTime) {
        this.shiftTime = shiftTime;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}