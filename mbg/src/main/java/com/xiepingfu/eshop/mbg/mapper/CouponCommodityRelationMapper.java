package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.CouponCommodityRelation;
import java.util.List;

public interface CouponCommodityRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CouponCommodityRelation record);

    CouponCommodityRelation selectByPrimaryKey(Long id);

    List<CouponCommodityRelation> selectAll();

    int updateByPrimaryKey(CouponCommodityRelation record);
}