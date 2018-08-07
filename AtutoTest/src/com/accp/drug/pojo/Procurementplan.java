package com.accp.drug.pojo;

public class Procurementplan {
    private Integer PPID;

    private Integer medicineID;

    private Integer lower;

    private Integer PPNumber;

    private String PPOrganization;

    private Integer isdel;

    public Integer getPPID() {
        return PPID;
    }

    public void setPPID(Integer PPID) {
        this.PPID = PPID;
    }

    public Integer getMedicineID() {
        return medicineID;
    }

    public void setMedicineID(Integer medicineID) {
        this.medicineID = medicineID;
    }

    public Integer getLower() {
        return lower;
    }

    public void setLower(Integer lower) {
        this.lower = lower;
    }

    public Integer getPPNumber() {
        return PPNumber;
    }

    public void setPPNumber(Integer PPNumber) {
        this.PPNumber = PPNumber;
    }

    public String getPPOrganization() {
        return PPOrganization;
    }

    public void setPPOrganization(String PPOrganization) {
        this.PPOrganization = PPOrganization == null ? null : PPOrganization.trim();
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}