package com.qiyao.user.convert;

import com.qiyao.user.entity.po.SysUser;
import com.qiyao.user.entity.req.SysUserReq;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * @InterfaceName SysUserConverter
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/19
 */
@Mapper
public interface SysUserConverter {

    SysUserConverter INSTANCE = Mappers.getMapper(SysUserConverter.class);

    SysUser convertReqToSysUser(SysUserReq sysUserReq);

}
