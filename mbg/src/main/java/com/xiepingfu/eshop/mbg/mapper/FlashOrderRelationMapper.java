package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.FlashOrderRelation;
import java.util.List;

public interface FlashOrderRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FlashOrderRelation record);

    FlashOrderRelation selectByPrimaryKey(Long id);

    List<FlashOrderRelation> selectAll();

    int updateByPrimaryKey(FlashOrderRelation record);
}