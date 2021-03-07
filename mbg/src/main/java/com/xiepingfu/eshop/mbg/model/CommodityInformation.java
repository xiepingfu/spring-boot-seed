package com.xiepingfu.eshop.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class CommodityInformation implements Serializable {
    private Long id;

    @ApiModelProperty(value = "品牌id")
    private Long brandId;

    @ApiModelProperty(value = "标题")
    private String title;

    @ApiModelProperty(value = "首图")
    private String picture;

    @ApiModelProperty(value = "更多介绍图")
    private String morePicture;

    @ApiModelProperty(value = "序列号")
    private String serialNumber;

    @ApiModelProperty(value = "是否删除")
    private Byte isDelete;

    @ApiModelProperty(value = "是否上架")
    private Byte isOnShelf;

    @ApiModelProperty(value = "是否新品")
    private Byte isNew;

    @ApiModelProperty(value = "是否推荐")
    private Byte isRecommand;

    @ApiModelProperty(value = "是否验证")
    private Byte isVerify;

    @ApiModelProperty(value = "排序")
    private Integer rank;

    @ApiModelProperty(value = "销量")
    private Integer sales;

    @ApiModelProperty(value = "副标题")
    private String subtitle;

    @ApiModelProperty(value = "可用优惠券id")
    private Long couponId;

    @ApiModelProperty(value = "详细介绍")
    private String description;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getBrandId() {
        return brandId;
    }

    public void setBrandId(Long brandId) {
        this.brandId = brandId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getMorePicture() {
        return morePicture;
    }

    public void setMorePicture(String morePicture) {
        this.morePicture = morePicture;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Byte getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Byte isDelete) {
        this.isDelete = isDelete;
    }

    public Byte getIsOnShelf() {
        return isOnShelf;
    }

    public void setIsOnShelf(Byte isOnShelf) {
        this.isOnShelf = isOnShelf;
    }

    public Byte getIsNew() {
        return isNew;
    }

    public void setIsNew(Byte isNew) {
        this.isNew = isNew;
    }

    public Byte getIsRecommand() {
        return isRecommand;
    }

    public void setIsRecommand(Byte isRecommand) {
        this.isRecommand = isRecommand;
    }

    public Byte getIsVerify() {
        return isVerify;
    }

    public void setIsVerify(Byte isVerify) {
        this.isVerify = isVerify;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Integer getSales() {
        return sales;
    }

    public void setSales(Integer sales) {
        this.sales = sales;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public Long getCouponId() {
        return couponId;
    }

    public void setCouponId(Long couponId) {
        this.couponId = couponId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", brandId=").append(brandId);
        sb.append(", title=").append(title);
        sb.append(", picture=").append(picture);
        sb.append(", morePicture=").append(morePicture);
        sb.append(", serialNumber=").append(serialNumber);
        sb.append(", isDelete=").append(isDelete);
        sb.append(", isOnShelf=").append(isOnShelf);
        sb.append(", isNew=").append(isNew);
        sb.append(", isRecommand=").append(isRecommand);
        sb.append(", isVerify=").append(isVerify);
        sb.append(", rank=").append(rank);
        sb.append(", sales=").append(sales);
        sb.append(", subtitle=").append(subtitle);
        sb.append(", couponId=").append(couponId);
        sb.append(", description=").append(description);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}