package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.AdminPermission;
import java.util.List;

public interface AdminPermissionMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdminPermission record);

    AdminPermission selectByPrimaryKey(Long id);

    List<AdminPermission> selectAll();

    int updateByPrimaryKey(AdminPermission record);
}