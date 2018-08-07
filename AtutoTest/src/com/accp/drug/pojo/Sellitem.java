package com.accp.drug.pojo;

public class Sellitem {
    private Integer sellItem;

    private String sellAccountId;

    private Integer medicineID;

    private Integer number;

    private Integer isdel;

    public Integer getSellItem() {
        return sellItem;
    }

    public void setSellItem(Integer sellItem) {
        this.sellItem = sellItem;
    }

    public String getSellAccountId() {
        return sellAccountId;
    }

    public void setSellAccountId(String sellAccountId) {
        this.sellAccountId = sellAccountId == null ? null : sellAccountId.trim();
    }

    public Integer getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(Integer medicineID) {
        this.medicineID = medicineID;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}