package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.OrderReturnInformation;
import java.util.List;

public interface OrderReturnInformationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderReturnInformation record);

    OrderReturnInformation selectByPrimaryKey(Long id);

    List<OrderReturnInformation> selectAll();

    int updateByPrimaryKey(OrderReturnInformation record);
}