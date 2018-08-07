package com.accp.drug.pojo;

import java.math.BigDecimal;
import java.util.Date;

public class Mtiny {
    private Integer MTID;

    private Integer SAItemId;

    private Integer unitID;

    private String tinySpecification;

    private Integer number;

    private BigDecimal costPrice;

    private BigDecimal salePrice;

    private Date tinyDate;

    private String comment;

    private Integer isdel;

    public Integer getMTID() {
        return MTID;
    }

    public void setMTID(Integer MTID) {
        this.MTID = MTID;
    }

    public Integer getSAItemId() {
        return SAItemId;
    }

    public void setSAItemId(Integer SAItemId) {
        this.SAItemId = SAItemId;
    }

    public Integer getUnitID() {
        return unitID;
    }

    public void setUnitID(Integer unitID) {
        this.unitID = unitID;
    }

    public String getTinySpecification() {
        return tinySpecification;
    }

    public void setTinySpecification(String tinySpecification) {
        this.tinySpecification = tinySpecification == null ? null : tinySpecification.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public BigDecimal getCostPrice() {
        return costPrice;
    }

    public void setCostPrice(BigDecimal costPrice) {
        this.costPrice = costPrice;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public Date getTinyDate() {
        return tinyDate;
    }

    public void setTinyDate(Date tinyDate) {
        this.tinyDate = tinyDate;
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