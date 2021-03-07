package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.CommodityInformation;
import java.util.List;

public interface CommodityInformationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommodityInformation record);

    CommodityInformation selectByPrimaryKey(Long id);

    List<CommodityInformation> selectAll();

    int updateByPrimaryKey(CommodityInformation record);
}