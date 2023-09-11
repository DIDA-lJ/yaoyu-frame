package com.qiyao.user.service.impl;

import com.qiyao.user.entity.dto.UserDTO;
import com.qiyao.user.entity.po.UserPO;
import com.qiyao.user.mapper.UserMapper;
import com.qiyao.user.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @ClassName UserServiceImpl
 * @Description
 * @Version 1.0.0
 * @Date 2023/08/27
 * @Author LinQi
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public int addUser(UserDTO userDto) {
        UserPO userPO = new UserPO();
        BeanUtils.copyProperties(userDto,userPO);
        int count = userMapper.insert(userPO);
        return count;
    }
}
