package com.qiyao.config;

import com.qiyao.inteceptor.SqlBeautyInterceptor;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName MybatisConfiguration
 * @Description
 * @Version 1.0.0
 * @Author LinQi
 * @Date 2023/09/12
 */
@Configuration
public class MybatisConfiguration {

    @Bean
    @ConditionalOnProperty(value = {"sql.beauty.show"}, havingValue = "true", matchIfMissing = true)
    public SqlBeautyInterceptor sqlBeautyInterceptor(){
        return new SqlBeautyInterceptor();
    }
}
