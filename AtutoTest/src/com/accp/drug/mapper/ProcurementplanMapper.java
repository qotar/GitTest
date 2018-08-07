package com.accp.drug.mapper;

import com.accp.drug.pojo.Procurementplan;

public interface ProcurementplanMapper {
    int deleteByPrimaryKey(Integer PPID);

    int insert(Procurementplan record);

    int insertSelective(Procurementplan record);

    Procurementplan selectByPrimaryKey(Integer PPID);

    int updateByPrimaryKeySelective(Procurementplan record);

    int updateByPrimaryKey(Procurementplan record);
}