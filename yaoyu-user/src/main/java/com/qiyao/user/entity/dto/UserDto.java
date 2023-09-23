package com.qiyao.user.entity.dto;

import lombok.Data;

/**
 * @ClassName UserDTO
 * @Description 用户 DTO 封装
 * @Version 1.0.0
 * @Date 2023/08/27
 * @Author LinQi
 */
@Data
public class UserDto {

    private String name;

    private Integer age;

    private Integer pageIndex;

    private Integer pageSize;
}
