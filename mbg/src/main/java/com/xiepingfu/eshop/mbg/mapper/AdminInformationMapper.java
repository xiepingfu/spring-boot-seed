package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.AdminInformation;
import java.util.List;

public interface AdminInformationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdminInformation record);

    AdminInformation selectByPrimaryKey(Long id);

    List<AdminInformation> selectAll();

    int updateByPrimaryKey(AdminInformation record);
}