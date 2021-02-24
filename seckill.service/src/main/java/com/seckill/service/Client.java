package com.seckill.service;

import com.seckill.model.Goods;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

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

    @GetMapping("qry/{id}")
    Map qry(@PathVariable("id") String id);

    @PostMapping("save")
    public Goods save(@RequestBody Goods goods);
}
