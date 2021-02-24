package com.seckill.controller;

import com.seckill.model.Goods;
import com.seckill.service.Client;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: TestController
 * Description: TODO
 *
 * @author yingjf
 * @date 2021/1/26 18:14
 */
@Slf4j
@RestController
public class TestConsumerController {


    @Autowired
    Client client;
    static {
        System.out.println("=======TestController init==========");
    }

    // 无参数
    @GetMapping("/hello")
    public String hello(){
        String msg = client.hello();
        return msg;
    }

    // 一个参数
    @GetMapping("qry/{id}")
    public Map qry(@PathVariable("id") String id){
        log.info("qry -->id:{}",id);
        Map msg = client.qry(id);
        return msg;
    }

    // 多个参数
    @GetMapping("save")
    public Goods save(@RequestParam String name,
                      @RequestParam Integer id,
                      @RequestParam String size,
                      @RequestParam Double price){
        Goods goods = new Goods();
        goods.setName(name);
        goods.setId(id);
        goods.setSize(size);
        goods.setPrice(price);
        log.info("传入参数打印 {}",goods);
        Goods msg = client.save(goods);
        return msg;
    }
}
