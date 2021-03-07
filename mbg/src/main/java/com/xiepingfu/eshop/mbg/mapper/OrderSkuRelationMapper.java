package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.OrderSkuRelation;
import java.util.List;

public interface OrderSkuRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderSkuRelation record);

    OrderSkuRelation selectByPrimaryKey(Long id);

    List<OrderSkuRelation> selectAll();

    int updateByPrimaryKey(OrderSkuRelation record);
}