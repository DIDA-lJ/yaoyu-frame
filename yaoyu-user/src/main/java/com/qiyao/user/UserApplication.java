package com.qiyao.user;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


/**
 * @ClassName UserApplication
 * @Description
 * @Version 1.0.0
 * @Date 2023/08/26
 * @Author LinQi
 */
@SpringBootApplication
@MapperScan(value = "com.qiyao.*.mapper")
@ComponentScan(value = "com.qiyao")
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class);
    }

}
