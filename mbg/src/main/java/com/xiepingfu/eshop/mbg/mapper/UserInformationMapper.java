package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.UserInformation;
import java.util.List;

public interface UserInformationMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserInformation record);

    UserInformation selectByPrimaryKey(Long id);

    List<UserInformation> selectAll();

    int updateByPrimaryKey(UserInformation record);
}