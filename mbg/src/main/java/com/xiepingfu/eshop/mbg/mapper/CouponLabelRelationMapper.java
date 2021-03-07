package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.CouponLabelRelation;
import java.util.List;

public interface CouponLabelRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CouponLabelRelation record);

    CouponLabelRelation selectByPrimaryKey(Long id);

    List<CouponLabelRelation> selectAll();

    int updateByPrimaryKey(CouponLabelRelation record);
}