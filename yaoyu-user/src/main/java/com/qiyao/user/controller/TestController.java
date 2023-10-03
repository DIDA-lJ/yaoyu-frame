package com.qiyao.user.controller;

import com.qiyao.redis.utils.RedisShareLockUtil;
import com.qiyao.redis.utils.RedisUtil;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
@Api(tags = "测试 controller ")
public class TestController {
    @Autowired
    private RedisUtil redisUtil;

    @Autowired
    private RedisShareLockUtil redisShareLockUtil;

    @GetMapping("/helloTest")
    @ApiOperation(value = "项目启动测试")
    public String HelloTest() {
        return "Hello, welcome to use Yao language to quickly develop scaffolding.";
    }

    @GetMapping("/redisTest")
    @ApiOperation(value = "Redis 连接测试")
    public void redisTest() {
        redisUtil.set("name", "qiyao");

    }

    @GetMapping("/redisLockTest")
    @ApiOperation(value = "分布式锁测试")
    public void testRedisLock() {
        boolean flag = redisShareLockUtil.lock("黑马程序员", "123456", 100000L);
        System.out.println(flag);
    }

    @GetMapping("/logTest")
    @ApiOperation(value = "日志测试")
    public void testLog(){
        long startTime = System.currentTimeMillis();
        for (int i = 0; i <= 100000; i++) {
            log.info("测试日志打印:这是第 {} 条测试日志",i);
        }
        long endTime = System.currentTimeMillis();
        log.info("本次打印耗时:{} ms",endTime - startTime);
    }
}
