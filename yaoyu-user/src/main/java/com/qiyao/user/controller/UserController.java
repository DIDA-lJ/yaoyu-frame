package com.qiyao.user.controller;

import com.qiyao.user.entity.dto.UserDTO;
import com.qiyao.user.entity.req.UserReq;
import com.qiyao.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName UserController
 * @Description
 * @Version 1.0.0
 * @Date 2023/08/27
 * @Author LinQi
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Integer addUser(@RequestBody UserReq userReq) {
        UserDTO userDTO = new UserDTO();
        BeanUtils.copyProperties(userReq, userDTO);
        int count = userService.addUser(userDTO);
        return count;
    }
}
