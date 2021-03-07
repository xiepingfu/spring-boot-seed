package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.CommodityCategoryRelation;
import java.util.List;

public interface CommodityCategoryRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommodityCategoryRelation record);

    CommodityCategoryRelation selectByPrimaryKey(Long id);

    List<CommodityCategoryRelation> selectAll();

    int updateByPrimaryKey(CommodityCategoryRelation record);
}