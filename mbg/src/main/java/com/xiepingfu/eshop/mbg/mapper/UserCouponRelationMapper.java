package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.UserCouponRelation;
import java.util.List;

public interface UserCouponRelationMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCouponRelation record);

    UserCouponRelation selectByPrimaryKey(Integer id);

    List<UserCouponRelation> selectAll();

    int updateByPrimaryKey(UserCouponRelation record);
}