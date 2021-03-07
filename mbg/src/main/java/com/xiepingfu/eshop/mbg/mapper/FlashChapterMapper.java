package com.xiepingfu.eshop.mbg.mapper;

import com.xiepingfu.eshop.mbg.model.FlashChapter;
import java.util.List;

public interface FlashChapterMapper {
    int deleteByPrimaryKey(Long id);

    int insert(FlashChapter record);

    FlashChapter selectByPrimaryKey(Long id);

    List<FlashChapter> selectAll();

    int updateByPrimaryKey(FlashChapter record);
}