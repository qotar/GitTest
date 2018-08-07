package com.accp.drug.mapper;

import com.accp.drug.pojo.Medicine;

public interface MedicineMapper {
    int deleteByPrimaryKey(Integer medicineID);

    int insert(Medicine record);

    int insertSelective(Medicine record);

    Medicine selectByPrimaryKey(Integer medicineID);

    int updateByPrimaryKeySelective(Medicine record);

    int updateByPrimaryKey(Medicine record);
}