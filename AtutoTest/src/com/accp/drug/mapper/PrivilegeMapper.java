package com.accp.drug.mapper;

import com.accp.drug.pojo.Privilege;

public interface PrivilegeMapper {
    int deleteByPrimaryKey(Integer PID);

    int insert(Privilege record);

    int insertSelective(Privilege record);

    Privilege selectByPrimaryKey(Integer PID);

    int updateByPrimaryKeySelective(Privilege record);

    int updateByPrimaryKey(Privilege record);
}