package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.AdminLoginLog;
import java.util.List;

public interface AdminLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdminLoginLog record);

    AdminLoginLog selectByPrimaryKey(Long id);

    List<AdminLoginLog> selectAll();

    int updateByPrimaryKey(AdminLoginLog record);
}