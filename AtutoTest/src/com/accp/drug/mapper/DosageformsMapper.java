package com.accp.drug.mapper;

import com.accp.drug.pojo.Dosageforms;

public interface DosageformsMapper {
    int deleteByPrimaryKey(Integer dosageFormsID);

    int insert(Dosageforms record);

    int insertSelective(Dosageforms record);

    Dosageforms selectByPrimaryKey(Integer dosageFormsID);

    int updateByPrimaryKeySelective(Dosageforms record);

    int updateByPrimaryKey(Dosageforms record);
}