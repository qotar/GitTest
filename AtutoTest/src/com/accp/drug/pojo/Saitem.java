package com.accp.drug.pojo;

import java.util.Date;

public class Saitem {
    private Integer SAItemId;

    private String storageAccountId;

    private Integer medicineID;

    private Integer supplierId;

    private String batchNumber;

    private Integer number;

    private Date validity;

    private Integer respectively;

    private Integer isdel;

    public Integer getSAItemId() {
        return SAItemId;
    }

    public void setSAItemId(Integer SAItemId) {
        this.SAItemId = SAItemId;
    }

    public String getStorageAccountId() {
        return storageAccountId;
    }

    public void setStorageAccountId(String storageAccountId) {
        this.storageAccountId = storageAccountId == null ? null : storageAccountId.trim();
    }

    public Integer getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(Integer medicineID) {
        this.medicineID = medicineID;
    }

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getBatchNumber() {
        return batchNumber;
    }

    public void setBatchNumber(String batchNumber) {
        this.batchNumber = batchNumber == null ? null : batchNumber.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getValidity() {
        return validity;
    }

    public void setValidity(Date validity) {
        this.validity = validity;
    }

    public Integer getRespectively() {
        return respectively;
    }

    public void setRespectively(Integer respectively) {
        this.respectively = respectively;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}