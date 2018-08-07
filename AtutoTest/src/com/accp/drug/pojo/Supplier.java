package com.accp.drug.pojo;

public class Supplier {
    private Integer supplierId;

    private String supplierName;

    private String phone;

    private String contact;

    private String explain;

    private String state;

    private String GSPGMP;

    private String charter;

    private String operatingPermit;

    private Integer isdel;

    public Integer getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(Integer supplierId) {
        this.supplierId = supplierId;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName == null ? null : supplierName.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact == null ? null : contact.trim();
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain == null ? null : explain.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    public String getGSPGMP() {
        return GSPGMP;
    }

    public void setGSPGMP(String GSPGMP) {
        this.GSPGMP = GSPGMP == null ? null : GSPGMP.trim();
    }

    public String getCharter() {
        return charter;
    }

    public void setCharter(String charter) {
        this.charter = charter == null ? null : charter.trim();
    }

    public String getOperatingPermit() {
        return operatingPermit;
    }

    public void setOperatingPermit(String operatingPermit) {
        this.operatingPermit = operatingPermit == null ? null : operatingPermit.trim();
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}