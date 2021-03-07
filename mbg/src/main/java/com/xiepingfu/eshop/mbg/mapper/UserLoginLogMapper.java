package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.UserLoginLog;
import java.util.List;

public interface UserLoginLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserLoginLog record);

    UserLoginLog selectByPrimaryKey(Long id);

    List<UserLoginLog> selectAll();

    int updateByPrimaryKey(UserLoginLog record);
}