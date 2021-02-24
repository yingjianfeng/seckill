package com.seckill.provider;

import com.seckill.model.Goods;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Title: TestFeignController
 * Description: 提供者
 *
 * @author yingjf
 * @date 2021/2/24 10:50
 */
@Slf4j
@RestController
public class TestFeignController {
    @Value("${server.port}")
    String port;

    //无参数
    @GetMapping("qry/{id}")
    public Map qry(@PathVariable("id") String id){
        Map map = new HashMap();
        map.put("name","衣服");
        map.put("id",id);
        map.put("size","M");
        map.put("price","100.00");
        map.put("port",port);
        return map;
    }

    @PostMapping("save")
    public Goods save(@RequestBody Goods goods){
        log.info("id:{},保存成功",goods.getId());
        goods.setRemarks(port+"保存成功！");
        return goods;
    }
}
