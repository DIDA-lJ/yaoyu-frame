package com.qiyao.redis.init;

import com.qiyao.redis.utils.SpringContextUtil;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * @ClassName InitCache
 * @Description 实现缓存预热
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/23
 */
@Component
public class InitCache implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        // 需要知道哪些缓存需要进行预热
        ApplicationContext applicationContext = SpringContextUtil.getApplicationContext();
        Map<String, AbstractCache> beanMap = applicationContext.getBeansOfType(AbstractCache.class);
        // 调用 init 方法
        if (beanMap.isEmpty()) {
            return;
        }
        for(Map.Entry<String, AbstractCache> entry : beanMap.entrySet()){
            AbstractCache abstractCache = (AbstractCache) SpringContextUtil.getBean(entry.getValue().getClass());
            abstractCache.initCache();
        }
    }
}
