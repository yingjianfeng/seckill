package com.seckill.provider;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: Test
 * Description: TODO
 *
 * @author yingjf
 * @date 2021/2/23 17:19
 */
@Slf4j
@RestController
public class Test {
    @Value("${server.port}")
    String port;

    @RequestMapping("/hello")
    public String hello() {
//        Thread.sleep(5000);       // 测试openFeign 响应超时
        log.info("{}","hello");
        return "hello consul."+port;
    }


}
