package com.accp.drug.mapper;

import com.accp.drug.pojo.Medicinekind;

public interface MedicinekindMapper {
    int deleteByPrimaryKey(Integer medicineKindID);

    int insert(Medicinekind record);

    int insertSelective(Medicinekind record);

    Medicinekind selectByPrimaryKey(Integer medicineKindID);

    int updateByPrimaryKeySelective(Medicinekind record);

    int updateByPrimaryKey(Medicinekind record);
}