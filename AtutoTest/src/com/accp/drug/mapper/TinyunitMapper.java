package com.accp.drug.mapper;

import com.accp.drug.pojo.Tinyunit;

public interface TinyunitMapper {
    int deleteByPrimaryKey(Integer tinyUnitId);

    int insert(Tinyunit record);

    int insertSelective(Tinyunit record);

    Tinyunit selectByPrimaryKey(Integer tinyUnitId);

    int updateByPrimaryKeySelective(Tinyunit record);

    int updateByPrimaryKey(Tinyunit record);
}