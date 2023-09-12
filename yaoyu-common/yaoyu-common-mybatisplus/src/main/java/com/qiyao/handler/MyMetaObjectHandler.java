package com.qiyao.handler;

import com.baomidou.mybatisplus.core.handlers.MetaObjectHandler;
import org.apache.ibatis.reflection.MetaObject;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * @ClassName MetaObjectHandler
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/12
 */
@Component
public class MyMetaObjectHandler implements MetaObjectHandler {

    @Override
    public void insertFill(MetaObject metaObject) {
        this.strictInsertFill(metaObject, "createBy", String.class, "qinyao");
        this.strictInsertFill(metaObject, "createTime", Date.class,new Date());
        this.strictInsertFill(metaObject, "deleteFlag",Integer.class,0);
        this.strictInsertFill(metaObject, "version",Integer.class,0);
    }



    @Override
    public void updateFill(MetaObject metaObject) {
        this.strictUpdateFill(metaObject,"updateBy",String.class,"qinyao");
        this.strictUpdateFill(metaObject,"updateTime",Date.class,new Date());
    }
}
