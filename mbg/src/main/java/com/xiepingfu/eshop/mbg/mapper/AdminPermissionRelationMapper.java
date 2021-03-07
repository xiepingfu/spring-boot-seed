package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.AdminPermissionRelation;
import java.util.List;

public interface AdminPermissionRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdminPermissionRelation record);

    AdminPermissionRelation selectByPrimaryKey(Long id);

    List<AdminPermissionRelation> selectAll();

    int updateByPrimaryKey(AdminPermissionRelation record);
}