package com.gupaoedu.springboot.condition;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@Configuration
public class ConditionConfig {

    @Bean
    @Conditional(GpCondition.class)
    public BeanClass beanClass(){
        return new BeanClass();
    }
}
