package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.CommodityLabel;
import java.util.List;

public interface CommodityLabelMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommodityLabel record);

    CommodityLabel selectByPrimaryKey(Long id);

    List<CommodityLabel> selectAll();

    int updateByPrimaryKey(CommodityLabel record);
}