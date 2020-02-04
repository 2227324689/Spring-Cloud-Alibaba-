package com.gupaoedu.springboot.demo.demo01;

import com.gupaoedu.springboot.demo.demo02.SpringConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@Configuration
@Import(SpringConfig.class)
public class ConfigurationDemo {

    @Bean
    public DemoClass demoClass(){
        return new DemoClass();
    }
}
