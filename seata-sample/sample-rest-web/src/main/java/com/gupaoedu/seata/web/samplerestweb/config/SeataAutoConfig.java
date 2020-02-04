package com.gupaoedu.seata.web.samplerestweb.config;

import io.seata.spring.annotation.GlobalTransactionScanner;
import io.seata.spring.annotation.GlobalTransactional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
//@Configuration
public class SeataAutoConfig {

    @Bean
    public GlobalTransactionScanner globalTransactionScanner(){
        return new GlobalTransactionScanner(
                "sample-rest-web","order_default_group");
    }
}
