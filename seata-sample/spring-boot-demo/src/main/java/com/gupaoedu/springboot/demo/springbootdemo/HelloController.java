package com.gupaoedu.springboot.demo.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@RestController
public class HelloController {

    //自动装配
    @Autowired //依赖注入| redisTemplate实例是如何装配的。
    private RedisTemplate<String,String> redisTemplate;

    @GetMapping("/hello")
    public String hello(){
        String rs=redisTemplate.opsForValue().get("name");
        return "Hello:"+rs;
    }
}
