package com.accp.drug.mapper;

import com.accp.drug.pojo.Userrole;

public interface UserroleMapper {
    int deleteByPrimaryKey(Integer URID);

    int insert(Userrole record);

    int insertSelective(Userrole record);

    Userrole selectByPrimaryKey(Integer URID);

    int updateByPrimaryKeySelective(Userrole record);

    int updateByPrimaryKey(Userrole record);
}