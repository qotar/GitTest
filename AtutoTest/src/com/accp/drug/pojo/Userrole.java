package com.accp.drug.pojo;

public class Userrole {
    private Integer URID;

    private String UID;

    private String RID;

    private Integer isdel;

    public Integer getURID() {
        return URID;
    }

    public void setURID(Integer URID) {
        this.URID = URID;
    }

    public String getUID() {
        return UID;
    }

    public void setUID(String UID) {
        this.UID = UID == null ? null : UID.trim();
    }

    public String getRID() {
        return RID;
    }

    public void setRID(String RID) {
        this.RID = RID == null ? null : RID.trim();
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}