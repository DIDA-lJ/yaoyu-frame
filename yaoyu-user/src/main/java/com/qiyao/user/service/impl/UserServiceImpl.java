package com.qiyao.user.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.qiyao.config.MybatisConfiguration;
import com.qiyao.entity.PageResult;
import com.qiyao.user.entity.dto.UserDto;
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

    @Autowired
    private MybatisConfiguration mybatisConfiguration;

    @Override
    public int addUser(UserDto userDto) {
        UserPO userPO = new UserPO();
        BeanUtils.copyProperties(userDto, userPO);
        int count = userMapper.insert(userPO);
        return count;
    }

    @Override
    public int delete(Integer id) {
        return userMapper.deleteById(id);
    }

    @Override
    public PageResult<UserPO> getUserPage(UserDto userDto) {
        IPage<UserPO> userPOPage = new Page<UserPO>(userDto.getPageIndex(),userDto.getPageSize());
        IPage<UserPO> userPage = userMapper.getUserPage(userPOPage);
        PageResult<UserPO> pageResult = new PageResult<UserPO>();
        pageResult.loadData(userPage);
        return pageResult;

    }
}
