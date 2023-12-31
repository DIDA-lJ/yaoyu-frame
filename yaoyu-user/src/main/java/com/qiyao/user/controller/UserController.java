package com.qiyao.user.controller;

import com.qiyao.bean.Result;
import com.qiyao.user.entity.dto.UserDto;
import com.qiyao.user.entity.req.UserListReq;
import com.qiyao.user.entity.req.UserReq;
import com.qiyao.user.service.UserService;
import io.swagger.annotations.Api;
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
@Api(tags = "用户 controller ")
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public Result addUser(@RequestBody UserReq userReq) {
        UserDto userDTO = new UserDto();
        BeanUtils.copyProperties(userReq, userDTO);
        return Result.ok(userService.addUser(userDTO));
    }

    @DeleteMapping("/{id}")
    public Result delete(@PathVariable Integer id) {
        id = Integer.parseInt("" + id);
        return Result.ok(userService.delete(id));
    }

    @GetMapping
    public Result getPage(@RequestBody UserListReq userListReq){
        UserDto userDto = new UserDto();
        BeanUtils.copyProperties(userListReq,userDto);
        return Result.ok(userService.getUserPage(userDto));
    }
}
