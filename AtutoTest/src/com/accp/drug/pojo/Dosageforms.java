package com.accp.drug.pojo;

public class Dosageforms {
    private Integer dosageFormsID;

    private String dosageFormsName;

    private Integer isdel;

    public Integer getDosageFormsID() {
        return dosageFormsID;
    }

    public void setDosageFormsID(Integer dosageFormsID) {
        this.dosageFormsID = dosageFormsID;
    }

    public String getDosageFormsName() {
        return dosageFormsName;
    }

    public void setDosageFormsName(String dosageFormsName) {
        this.dosageFormsName = dosageFormsName == null ? null : dosageFormsName.trim();
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}