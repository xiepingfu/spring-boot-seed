package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.AdminRoleRelation;
import java.util.List;

public interface AdminRoleRelationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(AdminRoleRelation record);

    AdminRoleRelation selectByPrimaryKey(Long id);

    List<AdminRoleRelation> selectAll();

    int updateByPrimaryKey(AdminRoleRelation record);
}