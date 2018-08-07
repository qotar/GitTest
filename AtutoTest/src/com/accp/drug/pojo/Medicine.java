package com.accp.drug.pojo;

import java.math.BigDecimal;

public class Medicine {
    private Integer medicineID;

    private String medicineName;

    private String commonName;

    private String specification;

    private Integer manufacturerID;

    private Integer unitID;

    private Integer dosageFormsID;

    private Integer goodsKindID;

    private Integer MCKID;

    private Integer tinyUnitId;

    private String modifierId;

    private Integer medicineKindID;

    private Integer tinyNumber;

    private String tinySpecification;

    private String barCode;

    private BigDecimal retailStdPrice;

    private BigDecimal purchasePrice;

    private Integer isPrescription;

    private BigDecimal salePrice;

    private String comment;

    private String standardCode;

    private Integer isHealthCare;

    private Integer isdel;

    public Integer getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(Integer medicineID) {
        this.medicineID = medicineID;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName == null ? null : medicineName.trim();
    }

    public String getCommonName() {
        return commonName;
    }

    public void setCommonName(String commonName) {
        this.commonName = commonName == null ? null : commonName.trim();
    }

    public String getSpecification() {
        return specification;
    }

    public void setSpecification(String specification) {
        this.specification = specification == null ? null : specification.trim();
    }

    public Integer getManufacturerID() {
        return manufacturerID;
    }

    public void setManufacturerID(Integer manufacturerID) {
        this.manufacturerID = manufacturerID;
    }

    public Integer getUnitID() {
        return unitID;
    }

    public void setUnitID(Integer unitID) {
        this.unitID = unitID;
    }

    public Integer getDosageFormsID() {
        return dosageFormsID;
    }

    public void setDosageFormsID(Integer dosageFormsID) {
        this.dosageFormsID = dosageFormsID;
    }

    public Integer getGoodsKindID() {
        return goodsKindID;
    }

    public void setGoodsKindID(Integer goodsKindID) {
        this.goodsKindID = goodsKindID;
    }

    public Integer getMCKID() {
        return MCKID;
    }

    public void setMCKID(Integer MCKID) {
        this.MCKID = MCKID;
    }

    public Integer getTinyUnitId() {
        return tinyUnitId;
    }

    public void setTinyUnitId(Integer tinyUnitId) {
        this.tinyUnitId = tinyUnitId;
    }

    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId == null ? null : modifierId.trim();
    }

    public Integer getMedicineKindID() {
        return medicineKindID;
    }

    public void setMedicineKindID(Integer medicineKindID) {
        this.medicineKindID = medicineKindID;
    }

    public Integer getTinyNumber() {
        return tinyNumber;
    }

    public void setTinyNumber(Integer tinyNumber) {
        this.tinyNumber = tinyNumber;
    }

    public String getTinySpecification() {
        return tinySpecification;
    }

    public void setTinySpecification(String tinySpecification) {
        this.tinySpecification = tinySpecification == null ? null : tinySpecification.trim();
    }

    public String getBarCode() {
        return barCode;
    }

    public void setBarCode(String barCode) {
        this.barCode = barCode == null ? null : barCode.trim();
    }

    public BigDecimal getRetailStdPrice() {
        return retailStdPrice;
    }

    public void setRetailStdPrice(BigDecimal retailStdPrice) {
        this.retailStdPrice = retailStdPrice;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public Integer getIsPrescription() {
        return isPrescription;
    }

    public void setIsPrescription(Integer isPrescription) {
        this.isPrescription = isPrescription;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment == null ? null : comment.trim();
    }

    public String getStandardCode() {
        return standardCode;
    }

    public void setStandardCode(String standardCode) {
        this.standardCode = standardCode == null ? null : standardCode.trim();
    }

    public Integer getIsHealthCare() {
        return isHealthCare;
    }

    public void setIsHealthCare(Integer isHealthCare) {
        this.isHealthCare = isHealthCare;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}