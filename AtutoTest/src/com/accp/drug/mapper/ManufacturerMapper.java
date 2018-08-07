package com.accp.drug.mapper;

import com.accp.drug.pojo.Manufacturer;

public interface ManufacturerMapper {
    int deleteByPrimaryKey(Integer manufacturerId);

    int insert(Manufacturer record);

    int insertSelective(Manufacturer record);

    Manufacturer selectByPrimaryKey(Integer manufacturerId);

    int updateByPrimaryKeySelective(Manufacturer record);

    int updateByPrimaryKey(Manufacturer record);
}