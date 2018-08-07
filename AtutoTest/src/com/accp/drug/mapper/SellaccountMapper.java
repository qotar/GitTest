package com.accp.drug.mapper;

import com.accp.drug.pojo.Sellaccount;

public interface SellaccountMapper {
    int deleteByPrimaryKey(String sellAccountId);

    int insert(Sellaccount record);

    int insertSelective(Sellaccount record);

    Sellaccount selectByPrimaryKey(String sellAccountId);

    int updateByPrimaryKeySelective(Sellaccount record);

    int updateByPrimaryKey(Sellaccount record);
}