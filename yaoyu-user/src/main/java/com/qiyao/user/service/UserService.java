package com.qiyao.user.service;

import com.qiyao.user.entity.dto.UserDTO;
import org.springframework.stereotype.Service;

/**
 * controller 与 service 交互 dto
 * service 与 mapper 交互 po
 */
public interface UserService {

    int addUser(UserDTO userDto);
}
