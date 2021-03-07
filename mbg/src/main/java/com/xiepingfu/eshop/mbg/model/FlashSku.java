package com.xiepingfu.eshop.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class FlashSku implements Serializable {
    private Integer id;

    @ApiModelProperty(value = "闪购活动id")
    private Integer chapterId;

    @ApiModelProperty(value = "闪购场次id")
    private Integer sectionId;

    @ApiModelProperty(value = "商品sku id")
    private Integer skuId;

    @ApiModelProperty(value = "原价")
    private Integer originPrice;

    @ApiModelProperty(value = "闪购价")
    private Integer sellingPrice;

    @ApiModelProperty(value = "数量")
    private Integer count;

    @ApiModelProperty(value = "限购数量")
    private Integer limitCount;

    @ApiModelProperty(value = "排序")
    private Integer rank;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getChapterId() {
        return chapterId;
    }

    public void setChapterId(Integer chapterId) {
        this.chapterId = chapterId;
    }

    public Integer getSectionId() {
        return sectionId;
    }

    public void setSectionId(Integer sectionId) {
        this.sectionId = sectionId;
    }

    public Integer getSkuId() {
        return skuId;
    }

    public void setSkuId(Integer skuId) {
        this.skuId = skuId;
    }

    public Integer getOriginPrice() {
        return originPrice;
    }

    public void setOriginPrice(Integer originPrice) {
        this.originPrice = originPrice;
    }

    public Integer getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Integer sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Integer getLimitCount() {
        return limitCount;
    }

    public void setLimitCount(Integer limitCount) {
        this.limitCount = limitCount;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", chapterId=").append(chapterId);
        sb.append(", sectionId=").append(sectionId);
        sb.append(", skuId=").append(skuId);
        sb.append(", originPrice=").append(originPrice);
        sb.append(", sellingPrice=").append(sellingPrice);
        sb.append(", count=").append(count);
        sb.append(", limitCount=").append(limitCount);
        sb.append(", rank=").append(rank);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}