package com.accp.drug.mapper;

import com.accp.drug.pojo.Saitem;

public interface SaitemMapper {
    int deleteByPrimaryKey(Integer SAItemId);

    int insert(Saitem record);

    int insertSelective(Saitem record);

    Saitem selectByPrimaryKey(Integer SAItemId);

    int updateByPrimaryKeySelective(Saitem record);

    int updateByPrimaryKey(Saitem record);
}