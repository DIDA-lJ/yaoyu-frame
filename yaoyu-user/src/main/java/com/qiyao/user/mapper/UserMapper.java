package com.qiyao.user.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.qiyao.user.entity.po.UserPO;
import org.springframework.stereotype.Repository;

/**
 * @ClassName UserMapper
 * @Description
 * @Version 1.0.0
 * @Date 2023/08/27
 * @Author LinQi
 */
@Repository
public interface UserMapper extends BaseMapper<UserPO> {
    IPage<UserPO> getUserPage(IPage<UserPO> userPOPage);
}
