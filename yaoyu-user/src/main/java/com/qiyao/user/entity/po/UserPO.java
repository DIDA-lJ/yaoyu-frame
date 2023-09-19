package com.qiyao.user.entity.po;

import com.baomidou.mybatisplus.annotation.*;

import com.qiyao.entity.BaseEntity;
import lombok.Data;


/**
 * @ClassName UserPO
 * @Description
 * @Version 1.0.0
 * @Date 2023/08/27
 * @Author LinQi
 */
@Data
@TableName("user")
public class UserPO extends BaseEntity {

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String name;

    private Integer age;




}


