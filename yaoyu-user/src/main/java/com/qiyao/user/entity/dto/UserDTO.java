package com.qiyao.user.entity.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;

import java.sql.Date;

/**
 * @ClassName UserDTO
 * @Description 用户 DTO 封装
 * @Version 1.0.0
 * @Date 2023/08/27
 * @Author LinQi
 */
@Data
public class UserDTO {

    private String name;

    private Integer age;

}
