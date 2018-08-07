package com.accp.drug.mapper;

import com.accp.drug.pojo.Menu;

public interface MenuMapper {
    int deleteByPrimaryKey(Integer MID);

    int insert(Menu record);

    int insertSelective(Menu record);

    Menu selectByPrimaryKey(Integer MID);

    int updateByPrimaryKeySelective(Menu record);

    int updateByPrimaryKey(Menu record);
}