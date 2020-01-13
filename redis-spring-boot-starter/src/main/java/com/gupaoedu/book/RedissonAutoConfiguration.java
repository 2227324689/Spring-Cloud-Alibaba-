package com.gupaoedu.book;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.config.SingleServerConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;

/**
 * 腾讯课堂搜索【咕泡学院】
 * 官网：www.gupaoedu.com
 * 风骚的Mic 老师
 * create-date: 2020/1/3-19:30
 */
@Configuration
@ConditionalOnClass(Redisson.class)
@EnableConfigurationProperties(RedissonProperties.class)
public class RedissonAutoConfiguration {
    @Autowired
    RedissonProperties redissonProperties;
    @Bean
    RedissonClient redissonClient(){
       Config config=new Config();
       String prefix="redis://";
       if(redissonProperties.isSsl()){
           prefix="rediss://";
       }
       SingleServerConfig singleServerConfig=config.useSingleServer()
               .setAddress(prefix+redissonProperties.getHost()+":"+redissonProperties.getPort())
               .setConnectTimeout(redissonProperties.getTimeout());
       if(!StringUtils.isEmpty(redissonProperties.getPassword())){
           singleServerConfig.setPassword(redissonProperties.getPassword());
       }
       return Redisson.create(config);
    }
}
