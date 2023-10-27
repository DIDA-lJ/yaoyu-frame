package com.qiyao.user.convert;

import com.qiyao.user.entity.po.SysUser;
import com.qiyao.user.entity.req.SysUserReq;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-10-26T17:31:59+0800",
    comments = "version: 1.4.2.Final, compiler: javac, environment: Java 19.0.1 (Oracle Corporation)"
)
public class SysUserConverterImpl implements SysUserConverter {

    @Override
    public SysUser convertReqToSysUser(SysUserReq sysUserReq) {
        if ( sysUserReq == null ) {
            return null;
        }

        SysUser sysUser = new SysUser();

        sysUser.setId( sysUserReq.getId() );
        sysUser.setName( sysUserReq.getName() );
        sysUser.setAge( sysUserReq.getAge() );
        sysUser.setCreateBy( sysUserReq.getCreateBy() );
        sysUser.setCreateTime( sysUserReq.getCreateTime() );
        sysUser.setUpdateBy( sysUserReq.getUpdateBy() );
        sysUser.setUpdateTime( sysUserReq.getUpdateTime() );
        sysUser.setDeleteFlag( sysUserReq.getDeleteFlag() );
        sysUser.setVersion( sysUserReq.getVersion() );

        return sysUser;
    }
}
