package com.seckill.provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Title: Test
 * Description: TODO
 *
 * @author yingjf
 * @date 2021/2/23 17:19
 */
@RestController
public class Test {
    @RequestMapping("/hello")
    public String hello() {

        System.out.println("=====hello =====");
        return "hello consul.";
    }
}
