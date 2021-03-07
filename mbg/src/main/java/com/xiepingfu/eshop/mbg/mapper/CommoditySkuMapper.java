package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.CommoditySku;
import java.util.List;

public interface CommoditySkuMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommoditySku record);

    CommoditySku selectByPrimaryKey(Long id);

    List<CommoditySku> selectAll();

    int updateByPrimaryKey(CommoditySku record);
}