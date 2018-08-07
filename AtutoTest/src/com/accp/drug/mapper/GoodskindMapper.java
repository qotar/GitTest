package com.accp.drug.mapper;

import com.accp.drug.pojo.Goodskind;

public interface GoodskindMapper {
    int deleteByPrimaryKey(Integer goodsKindID);

    int insert(Goodskind record);

    int insertSelective(Goodskind record);

    Goodskind selectByPrimaryKey(Integer goodsKindID);

    int updateByPrimaryKeySelective(Goodskind record);

    int updateByPrimaryKey(Goodskind record);
}