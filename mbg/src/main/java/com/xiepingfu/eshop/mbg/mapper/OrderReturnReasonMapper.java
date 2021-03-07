package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.OrderReturnReason;
import java.util.List;

public interface OrderReturnReasonMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderReturnReason record);

    OrderReturnReason selectByPrimaryKey(Long id);

    List<OrderReturnReason> selectAll();

    int updateByPrimaryKey(OrderReturnReason record);
}