package com.qiyao.redis.init;

import org.springframework.stereotype.Component;

/**
 * @ClassName AbstractCache
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/23
 */
@Component
public abstract class AbstractCache {

    public void initCache(){}

    public <T> T getCache(String key){
        return  null;
    }

    public abstract void clearCache();

    public void reloadCache(){
        clearCache();
        initCache();
    }

}
