package com.accp.drug.mapper;

import com.accp.drug.pojo.Unit;

public interface UnitMapper {
    int deleteByPrimaryKey(Integer unitID);

    int insert(Unit record);

    int insertSelective(Unit record);

    Unit selectByPrimaryKey(Integer unitID);

    int updateByPrimaryKeySelective(Unit record);

    int updateByPrimaryKey(Unit record);
}