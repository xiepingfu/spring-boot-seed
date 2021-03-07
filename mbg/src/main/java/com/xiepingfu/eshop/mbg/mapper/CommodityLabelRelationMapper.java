package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.CommodityLabelRelation;
import java.util.List;

public interface CommodityLabelRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommodityLabelRelation record);

    CommodityLabelRelation selectByPrimaryKey(Long id);

    List<CommodityLabelRelation> selectAll();

    int updateByPrimaryKey(CommodityLabelRelation record);
}