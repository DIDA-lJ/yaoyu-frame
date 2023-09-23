package com.qiyao.user.controller;

import com.qiyao.redis.utils.RedisUtil;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description 测试 controller
 * @Version 1.0.0
 * @Date 2023/08/26
 * @Author LinQi
 */
@RestController
@Api(tags = "测试 controller ")
public class TestController {
    @Autowired
    private RedisUtil redisUtil;

    @GetMapping("/helloTest")
    public String HelloTest(){
        return "Hello, welcome to use Yao language to quickly develop scaffolding.";
    }

    @GetMapping("/redisTest")
    public void redisTest(){
        redisUtil.set("name","qiyao");

    }
}
