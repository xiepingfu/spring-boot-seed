package com.xiepingfu.eshop.mbg.model;

import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;

public class AdminPermission implements Serializable {
    private Long id;

    @ApiModelProperty(value = "简述许可")
    private String description;

    @ApiModelProperty(value = "许可值，半角字符")
    private String value;

    @ApiModelProperty(value = "该许可允许访问的uri")
    private String uri;

    @ApiModelProperty(value = "是否启用")
    private Boolean isEnable;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public Boolean getIsEnable() {
        return isEnable;
    }

    public void setIsEnable(Boolean isEnable) {
        this.isEnable = isEnable;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", description=").append(description);
        sb.append(", value=").append(value);
        sb.append(", uri=").append(uri);
        sb.append(", isEnable=").append(isEnable);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}