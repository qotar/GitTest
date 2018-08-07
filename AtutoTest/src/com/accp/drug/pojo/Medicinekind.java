package com.accp.drug.pojo;

public class Medicinekind {
    private Integer medicineKindID;

    private String medicineKindName;

    private Integer isdel;

    public Integer getMedicineKindID() {
        return medicineKindID;
    }

    public void setMedicineKindID(Integer medicineKindID) {
        this.medicineKindID = medicineKindID;
    }

    public String getMedicineKindName() {
        return medicineKindName;
    }

    public void setMedicineKindName(String medicineKindName) {
        this.medicineKindName = medicineKindName == null ? null : medicineKindName.trim();
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}