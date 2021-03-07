package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.FlashSection;
import java.util.List;

public interface FlashSectionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FlashSection record);

    FlashSection selectByPrimaryKey(Long id);

    List<FlashSection> selectAll();

    int updateByPrimaryKey(FlashSection record);
}