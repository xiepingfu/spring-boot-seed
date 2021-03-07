package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.CommodityCategory;
import java.util.List;

public interface CommodityCategoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommodityCategory record);

    CommodityCategory selectByPrimaryKey(Long id);

    List<CommodityCategory> selectAll();

    int updateByPrimaryKey(CommodityCategory record);
}