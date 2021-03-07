package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.FlashSku;
import java.util.List;

public interface FlashSkuMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(FlashSku record);

    FlashSku selectByPrimaryKey(Integer id);

    List<FlashSku> selectAll();

    int updateByPrimaryKey(FlashSku record);
}