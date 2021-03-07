package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.AdminRole;
import java.util.List;

public interface AdminRoleMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdminRole record);

    AdminRole selectByPrimaryKey(Long id);

    List<AdminRole> selectAll();

    int updateByPrimaryKey(AdminRole record);
}