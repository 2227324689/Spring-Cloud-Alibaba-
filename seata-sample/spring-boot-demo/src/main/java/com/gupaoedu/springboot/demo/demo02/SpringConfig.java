package com.gupaoedu.springboot.demo.demo02;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@Configuration
public class SpringConfig {

    //无法实现逻辑性处理.
    // 要不要注入呢？
    // 从哪里注入？
    @Bean
    public DefaultClass defaultClass(){
        return new DefaultClass();
    }
}
