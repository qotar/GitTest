package com.accp.drug.mapper;

import com.accp.drug.pojo.Mtiny;

public interface MtinyMapper {
    int deleteByPrimaryKey(Integer MTID);

    int insert(Mtiny record);

    int insertSelective(Mtiny record);

    Mtiny selectByPrimaryKey(Integer MTID);

    int updateByPrimaryKeySelective(Mtiny record);

    int updateByPrimaryKey(Mtiny record);
}