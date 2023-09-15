package com.qiyao.entity;

import lombok.Data;

import java.io.Serializable;
import java.sql.Date;

/**
 * @ClassName BaseEntity
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/15
 */
@Data
public class BaseEntity implements Serializable {

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private Integer deleteFlag;

    private Integer version;
}
