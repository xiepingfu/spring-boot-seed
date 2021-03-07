package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.CommodityBrand;
import java.util.List;

public interface CommodityBrandMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommodityBrand record);

    CommodityBrand selectByPrimaryKey(Long id);

    List<CommodityBrand> selectAll();

    int updateByPrimaryKey(CommodityBrand record);
}