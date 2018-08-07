package com.accp.drug.mapper;

import com.accp.drug.pojo.Sellitem;

public interface SellitemMapper {
    int deleteByPrimaryKey(Integer sellItem);

    int insert(Sellitem record);

    int insertSelective(Sellitem record);

    Sellitem selectByPrimaryKey(Integer sellItem);

    int updateByPrimaryKeySelective(Sellitem record);

    int updateByPrimaryKey(Sellitem record);
}