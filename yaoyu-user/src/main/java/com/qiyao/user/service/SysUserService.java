package com.qiyao.user.service;

import com.qiyao.bean.PageResponse;
import com.qiyao.user.entity.po.SysUser;
import com.qiyao.user.entity.req.SysUserReq;


/**
 * (SysUser)表服务接口
 *
 * @author makejava
 * @since 2023-09-19 16:25:35
 */
public interface SysUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    SysUser queryById(Long id);

    /**
     * 分页查询
     *
     * @return 查询结果
     */
    PageResponse<SysUser> queryByPage(SysUserReq sysUserReq);

    /**
     * 新增数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    SysUser insert(SysUser sysUser);

    /**
     * 修改数据
     *
     * @param sysUser 实例对象
     * @return 实例对象
     */
    SysUser update(SysUser sysUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}
