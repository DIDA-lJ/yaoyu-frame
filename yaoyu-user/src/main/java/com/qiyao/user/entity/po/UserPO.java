package com.qiyao.user.entity.po;

import com.baomidou.mybatisplus.annotation.IdType;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.sql.Date;

/**
 * @ClassName UserPO
 * @Description
 * @Version 1.0.0
 * @Date 2023/08/27
 * @Author LinQi
 */
@Data
@TableName("user")
public class UserPO {

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Long id;

    private String name;

    private Integer age;

    private String createBy;

    private Date createTime;

    private String updateBy;

    private Date updateTime;

    private Integer deleteFlag;

    private Integer version;

}
