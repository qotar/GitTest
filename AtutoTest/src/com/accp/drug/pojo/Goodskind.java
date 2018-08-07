package com.accp.drug.pojo;

public class Goodskind {
    private Integer goodsKindID;

    private String goodsKindName;

    private Integer isdel;

    public Integer getGoodsKindID() {
        return goodsKindID;
    }

    public void setGoodsKindID(Integer goodsKindID) {
        this.goodsKindID = goodsKindID;
    }

    public String getGoodsKindName() {
        return goodsKindName;
    }

    public void setGoodsKindName(String goodsKindName) {
        this.goodsKindName = goodsKindName == null ? null : goodsKindName.trim();
    }

    public Integer getIsdel() {
        return isdel;
    }

    public void setIsdel(Integer isdel) {
        this.isdel = isdel;
    }
}