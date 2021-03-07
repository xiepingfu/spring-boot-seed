package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.CouponInformation;
import java.util.List;

public interface CouponInformationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CouponInformation record);

    CouponInformation selectByPrimaryKey(Long id);

    List<CouponInformation> selectAll();

    int updateByPrimaryKey(CouponInformation record);
}