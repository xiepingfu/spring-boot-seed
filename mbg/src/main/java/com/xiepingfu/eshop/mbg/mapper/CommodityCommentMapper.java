package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.CommodityComment;
import java.util.List;

public interface CommodityCommentMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CommodityComment record);

    CommodityComment selectByPrimaryKey(Long id);

    List<CommodityComment> selectAll();

    int updateByPrimaryKey(CommodityComment record);
}