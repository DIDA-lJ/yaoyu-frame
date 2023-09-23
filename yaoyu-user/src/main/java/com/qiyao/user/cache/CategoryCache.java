package com.qiyao.user.cache;

import com.qiyao.redis.init.AbstractCache;
import com.qiyao.redis.utils.RedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;

/**
 * @ClassName CategoryCache
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/23
 */
@Component
public class CategoryCache extends AbstractCache {

    private static String CATEGORY_CACHE_KEY ="CATEGORY";

    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private RedisTemplate redisTemplate;

    @Override
    public void initCache() {
        // 跟数据库联动，跟其他的数据来源进行联动，实现缓存预热
        redisUtil.set("category", "知识");
    }

    @Override
    public <T> T getCache(String key) {
        if (!redisTemplate.hasKey(key).booleanValue()){
            reloadCache();
        }
        return (T) redisTemplate.opsForValue().get(key);
    }

    @Override
    public void clearCache() {
        redisTemplate.delete(CATEGORY_CACHE_KEY);
    }
}
