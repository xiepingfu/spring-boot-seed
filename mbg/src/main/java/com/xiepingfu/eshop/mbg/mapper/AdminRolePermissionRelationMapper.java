package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.AdminRolePermissionRelation;
import java.util.List;

public interface AdminRolePermissionRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdminRolePermissionRelation record);

    AdminRolePermissionRelation selectByPrimaryKey(Long id);

    List<AdminRolePermissionRelation> selectAll();

    int updateByPrimaryKey(AdminRolePermissionRelation record);
}