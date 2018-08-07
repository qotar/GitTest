package com.accp.drug.pojo;

public class Warehouse {
    private Integer warehouseId;

    private Integer SAItemId;

    private Integer GAID;

    private Integer inventoryFloor;

    private String handling;

    private Integer isdel;

    public Integer getWarehouseId() {
        return warehouseId;
    }

    public void setWarehouseId(Integer warehouseId) {
        this.warehouseId = warehouseId;
    }

    public Integer getSAItemId() {
        return SAItemId;
    }

    public void setSAItemId(Integer SAItemId) {
        this.SAItemId = SAItemId;
    }

    public Integer getGAID() {
        return GAID;
    }

    public void setGAID(Integer GAID) {
        this.GAID = GAID;
    }

    public Integer getInventoryFloor() {
        return inventoryFloor;
    }

    public void setInventoryFloor(Integer inventoryFloor) {
        this.inventoryFloor = inventoryFloor;
    }

    public String getHandling() {
        return handling;
    }

    public void setHandling(String handling) {
        this.handling = handling == null ? null : handling.trim();
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}