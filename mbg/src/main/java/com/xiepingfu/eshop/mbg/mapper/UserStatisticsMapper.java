package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.UserStatistics;
import java.util.List;

public interface UserStatisticsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(UserStatistics record);

    UserStatistics selectByPrimaryKey(Long id);

    List<UserStatistics> selectAll();

    int updateByPrimaryKey(UserStatistics record);
}