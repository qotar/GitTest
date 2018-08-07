package com.accp.drug.mapper;

import com.accp.drug.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(String UID);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String UID);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);
}