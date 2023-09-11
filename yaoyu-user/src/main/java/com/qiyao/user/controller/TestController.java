package com.qiyao.user.controller;

import com.qiyao.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName TestController
 * @Description 测试 controller
 * @Version 1.0.0
 * @Date 2023/08/26
 * @Author LinQi
 */
@RestController
public class TestController {


    @GetMapping("/helloTest")
    public String HelloTest(){
        return "Hello, welcome to use Yao language to quickly develop scaffolding.";
    }

}
