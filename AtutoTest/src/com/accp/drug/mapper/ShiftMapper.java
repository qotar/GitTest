package com.accp.drug.mapper;

import com.accp.drug.pojo.Shift;

public interface ShiftMapper {
    int deleteByPrimaryKey(Integer shiftID);

    int insert(Shift record);

    int insertSelective(Shift record);

    Shift selectByPrimaryKey(Integer shiftID);

    int updateByPrimaryKeySelective(Shift record);

    int updateByPrimaryKey(Shift record);
}