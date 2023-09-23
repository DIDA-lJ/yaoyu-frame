package com.qiyao.entity;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableLogic;
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
    @TableField(fill = FieldFill.INSERT)
    private String create_by;

    @TableField(fill = FieldFill.INSERT)
    private Date create_time;

    @TableField(fill = FieldFill.UPDATE)
    private String update_by;

    @TableField(fill = FieldFill.UPDATE)
    private Date update_time;

    @TableField(fill = FieldFill.INSERT)
    @TableLogic
    private Integer delete_flag;

    @TableField(fill = FieldFill.INSERT)
    private Integer version;
}
