package com.seckill.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.IOException;

/**
 * Title: RedisConfig
 * Description: TODO
 *
 * @author yingjf
 * @date 2021/2/5 16:58
 */
@Configuration
public class RedisConfig {
    @Bean(destroyMethod = "shutdown")
    RedissonClient redisson() throws IOException {
        Config config = new Config();
        config.useMasterSlaveServers()
                //可以用"rediss://"来启用SSL连接
                .setMasterAddress("redis://182.254.166.73:6379").setPassword("yingjf").setDatabase(2)
                .addSlaveAddress("redis://123.57.140.253:6379").setPassword("yingjf");
        return Redisson.create(config);
    }
}