package com.accp.drug.mapper;

import com.accp.drug.pojo.Medicinecustomkind;

public interface MedicinecustomkindMapper {
    int deleteByPrimaryKey(Integer MCKID);

    int insert(Medicinecustomkind record);

    int insertSelective(Medicinecustomkind record);

    Medicinecustomkind selectByPrimaryKey(Integer MCKID);

    int updateByPrimaryKeySelective(Medicinecustomkind record);

    int updateByPrimaryKey(Medicinecustomkind record);
}