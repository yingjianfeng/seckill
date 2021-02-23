package com.seckill.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Title: Client
 * Description: TODO
 *
 * @author yingjf
 * @date 2021/2/23 17:23
 */
@Service
@FeignClient("seckill-provider")
public interface Client {
    @RequestMapping("/hello")
     String hello();
}
