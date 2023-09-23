package com.qiyao.user.entity.req;

import lombok.Data;

/**
 * @ClassName UserReq
 * @Description
 * @Version 1.0.0
 * @Date 2023/08/27
 * @Author LinQi
 */
@Data
public class UserListReq {

    private Integer pageIndex;

    private Integer pageSize;
}
