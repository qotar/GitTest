package com.accp.drug.mapper;

import com.accp.drug.pojo.Counter;

public interface CounterMapper {
    int deleteByPrimaryKey(Integer counterID);

    int insert(Counter record);

    int insertSelective(Counter record);

    Counter selectByPrimaryKey(Integer counterID);

    int updateByPrimaryKeySelective(Counter record);

    int updateByPrimaryKey(Counter record);
}