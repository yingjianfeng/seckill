package com.seckill.controller;

import com.seckill.service.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: TestController
 * Description: TODO
 *
 * @author yingjf
 * @date 2021/1/26 18:14
 */
@RestController
public class TestController {
    @Autowired
    Client client;
    static {
        System.out.println("=======TestController init==========");
    }

    @GetMapping("/hello")
    public String hello(){
        String msg = client.hello();
        return msg;
    }
}
