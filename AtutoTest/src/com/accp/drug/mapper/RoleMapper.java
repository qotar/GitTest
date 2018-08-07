package com.accp.drug.mapper;

import com.accp.drug.pojo.Role;

public interface RoleMapper {
    int deleteByPrimaryKey(String RID);

    int insert(Role record);

    int insertSelective(Role record);

    Role selectByPrimaryKey(String RID);

    int updateByPrimaryKeySelective(Role record);

    int updateByPrimaryKey(Role record);
}