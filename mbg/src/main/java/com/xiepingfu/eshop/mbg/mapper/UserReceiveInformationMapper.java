package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.UserReceiveInformation;
import java.util.List;

public interface UserReceiveInformationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserReceiveInformation record);

    UserReceiveInformation selectByPrimaryKey(Long id);

    List<UserReceiveInformation> selectAll();

    int updateByPrimaryKey(UserReceiveInformation record);
}