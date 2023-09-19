package com.qiyao.user.service;

import com.qiyao.entity.PageResult;
import com.qiyao.user.entity.dto.UserDto;
import com.qiyao.user.entity.po.UserPO;

/**
 * controller 与 service 交互 dto
 * service 与 mapper 交互 po
 */
public interface UserService {

    int addUser(UserDto userDto);


    int delete(Integer id);


    PageResult<UserPO> getUserPage(UserDto userDto);
}
