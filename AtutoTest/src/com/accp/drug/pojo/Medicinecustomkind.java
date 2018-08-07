package com.accp.drug.pojo;

public class Medicinecustomkind {
    private Integer MCKID;

    private String MCKName;

    private Integer isdel;

    public Integer getMCKID() {
        return MCKID;
    }

    public void setMCKID(Integer MCKID) {
        this.MCKID = MCKID;
    }

    public String getMCKName() {
        return MCKName;
    }

    public void setMCKName(String MCKName) {
        this.MCKName = MCKName == null ? null : MCKName.trim();
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}