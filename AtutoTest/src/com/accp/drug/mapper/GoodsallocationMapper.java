package com.accp.drug.mapper;

import com.accp.drug.pojo.Goodsallocation;

public interface GoodsallocationMapper {
    int deleteByPrimaryKey(Integer GAID);

    int insert(Goodsallocation record);

    int insertSelective(Goodsallocation record);

    Goodsallocation selectByPrimaryKey(Integer GAID);

    int updateByPrimaryKeySelective(Goodsallocation record);

    int updateByPrimaryKey(Goodsallocation record);
}