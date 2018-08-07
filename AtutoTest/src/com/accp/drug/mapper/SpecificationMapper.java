package com.accp.drug.mapper;

import com.accp.drug.pojo.Specification;

public interface SpecificationMapper {
    int deleteByPrimaryKey(Integer specificationID);

    int insert(Specification record);

    int insertSelective(Specification record);

    Specification selectByPrimaryKey(Integer specificationID);

    int updateByPrimaryKeySelective(Specification record);

    int updateByPrimaryKey(Specification record);
}