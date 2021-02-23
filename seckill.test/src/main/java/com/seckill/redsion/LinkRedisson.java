package com.seckill.redsion;

import com.seckill.Boot;
import javafx.application.Application;
import org.redisson.Redisson;
import org.redisson.api.RBucket;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.config.MasterSlaveServersConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.jupiter.api.Test;
/**
 * Title: LinkRedisson
 * Description: TODO
 *
 * @author yingjf
 * @date 2021/2/5 16:33
 */
@SpringBootTest(classes = Boot.class)
public class LinkRedisson {
    @Autowired
    public RedissonClient redisson;

    @Test
    public void test(){
        RBucket<String> xx = redisson.getBucket("xx");
        xx.set("xx");
        RBucket<String> a = redisson.getBucket("xx");
//        keyObj.set("v1236");
        String aa = a.get();
        System.out.println(aa);
        System.out.println("=====================");
        RBucket<String> b = redisson.getBucket("xx");
//        keyObj.set("v1236");
        String bb = b.get();
        System.out.println(bb);
        System.out.println("=====================");
        RBucket<String> c = redisson.getBucket("xx");
//        keyObj.set("v1236");
        String cc = c.get();
        System.out.println(cc);
        System.out.println("=====================");
    }

    public static void main(String[] args) {
        Config config = new Config();
        config.useMasterSlaveServers()
                //可以用"rediss://"来启用SSL连接
                .setMasterAddress("redis://182.254.166.73:6379").setPassword("yingjf")
                .addSlaveAddress("redis://123.57.140.253:6379").setPassword("yingjf");
        RedissonClient redisson = Redisson.create(config);

        RBucket<String> xx = redisson.getBucket("xx");
        xx.set("xx");
        System.out.println("=====================");
        RBucket<String> a = redisson.getBucket("xx");
//        keyObj.set("v1236");
        String aa = a.get();
        System.out.println(aa);
        System.out.println("=====================");
        RBucket<String> b = redisson.getBucket("xx");
//        keyObj.set("v1236");
        String bb = b.get();
        System.out.println(bb);
        System.out.println("=====================");
        RBucket<String> c = redisson.getBucket("xx");
//        keyObj.set("v1236");
        String cc = c.get();
        System.out.println(cc);
        System.out.println("=====================");
    }
}
