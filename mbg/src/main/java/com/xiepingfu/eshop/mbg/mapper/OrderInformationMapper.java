package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.OrderInformation;
import java.util.List;

public interface OrderInformationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(OrderInformation record);

    OrderInformation selectByPrimaryKey(Long id);

    List<OrderInformation> selectAll();

    int updateByPrimaryKey(OrderInformation record);
}