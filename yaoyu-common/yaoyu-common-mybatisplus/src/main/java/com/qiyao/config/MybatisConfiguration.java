package com.qiyao.config;

import com.qiyao.inteceptor.SqlBeautyInterceptor;
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
    public SqlBeautyInterceptor sqlBeautyInterceptor(){
        return new SqlBeautyInterceptor();
    }
}
