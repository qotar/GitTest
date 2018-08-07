package com.accp.drug.mapper;

import com.accp.drug.pojo.Storageaccount;

public interface StorageaccountMapper {
    int deleteByPrimaryKey(String storageAccountId);

    int insert(Storageaccount record);

    int insertSelective(Storageaccount record);

    Storageaccount selectByPrimaryKey(String storageAccountId);

    int updateByPrimaryKeySelective(Storageaccount record);

    int updateByPrimaryKey(Storageaccount record);
}