package com.xiepingfu.eshop.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;

public class CouponInformation implements Serializable {
    private Long id;

    @ApiModelProperty(value = "优惠卷名")
    private String name;

    @ApiModelProperty(value = "满多少钱可用")
    private BigDecimal overPrice;

    @ApiModelProperty(value = "折扣")
    private BigDecimal discount;

    @ApiModelProperty(value = "或买多少件可用")
    private Integer overCount;

    @ApiModelProperty(value = "或减少价格")
    private BigDecimal reduceAmount;

    @ApiModelProperty(value = "优惠卷描述")
    private String description;

    @ApiModelProperty(value = "是否自动使用")
    private Boolean isAutoUsage;

    @ApiModelProperty(value = "优惠卷库存")
    private Integer stock;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getOverPrice() {
        return overPrice;
    }

    public void setOverPrice(BigDecimal overPrice) {
        this.overPrice = overPrice;
    }

    public BigDecimal getDiscount() {
        return discount;
    }

    public void setDiscount(BigDecimal discount) {
        this.discount = discount;
    }

    public Integer getOverCount() {
        return overCount;
    }

    public void setOverCount(Integer overCount) {
        this.overCount = overCount;
    }

    public BigDecimal getReduceAmount() {
        return reduceAmount;
    }

    public void setReduceAmount(BigDecimal reduceAmount) {
        this.reduceAmount = reduceAmount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getIsAutoUsage() {
        return isAutoUsage;
    }

    public void setIsAutoUsage(Boolean isAutoUsage) {
        this.isAutoUsage = isAutoUsage;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", overPrice=").append(overPrice);
        sb.append(", discount=").append(discount);
        sb.append(", overCount=").append(overCount);
        sb.append(", reduceAmount=").append(reduceAmount);
        sb.append(", description=").append(description);
        sb.append(", isAutoUsage=").append(isAutoUsage);
        sb.append(", stock=").append(stock);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}