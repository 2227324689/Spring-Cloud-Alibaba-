package com.gupaoedu.springcloud.seata.springcloudseatarest.config;

import com.alibaba.cloud.seata.SeataProperties;
import io.seata.spring.annotation.GlobalTransactionScanner;
import org.apache.commons.lang3.StringUtils;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@Configuration
@EnableConfigurationProperties({SeataProperties.class})
public class SeataAutoConfig {
    private ApplicationContext applicationContext;
    private SeataProperties seataProperties;
    public SeataAutoConfig(SeataProperties seataProperties, ApplicationContext applicationContext){
        this.applicationContext=applicationContext;
        this.seataProperties=seataProperties;
    }
    @Bean
    public GlobalTransactionScanner globalTransactionScanner(){
        String applicationName = this.applicationContext.getEnvironment().getProperty("spring.application.name");
        String txServiceGroup = this.seataProperties.getTxServiceGroup();
        if (StringUtils.isEmpty(txServiceGroup)) {
            txServiceGroup = applicationName + "-seata-service-group";
            this.seataProperties.setTxServiceGroup(txServiceGroup);
        }
        return new GlobalTransactionScanner(applicationName, txServiceGroup);
    }
}
