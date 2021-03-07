package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.CouponCategoryRelation;
import java.util.List;

public interface CouponCategoryRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CouponCategoryRelation record);

    CouponCategoryRelation selectByPrimaryKey(Long id);

    List<CouponCategoryRelation> selectAll();

    int updateByPrimaryKey(CouponCategoryRelation record);
}