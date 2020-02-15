package com.alibaba.csp.sentinel.dashboard.rule.nacos;

import com.alibaba.csp.sentinel.dashboard.datasource.entity.rule.FlowRuleEntity;
import com.alibaba.csp.sentinel.datasource.Converter;
import com.alibaba.fastjson.JSON;
import com.alibaba.nacos.api.PropertyKeyConst;
import com.alibaba.nacos.api.exception.NacosException;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.alibaba.nacos.api.config.*;

import java.util.List;
import java.util.Properties;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@EnableConfigurationProperties(NacosPropertiesConfiguration.class)
@Configuration
public class NacosConfiguration {

    @Bean
    public Converter<List<FlowRuleEntity>,String> flowRuleEntityEncoder(){
        return JSON::toJSONString;
    }

    @Bean
    public Converter<String,List<FlowRuleEntity>> flowRuleEntityDecoder(){
        return s -> JSON.parseArray(s, FlowRuleEntity.class);
    }

    @Bean
    public ConfigService nacosConfigService(NacosPropertiesConfiguration nacosPropertiesConfiguration) throws NacosException {
        Properties properties = new Properties();
        properties.put(PropertyKeyConst.SERVER_ADDR, nacosPropertiesConfiguration.getServerAddr());
        properties.put(PropertyKeyConst.NAMESPACE, nacosPropertiesConfiguration.getNamespace());
        return ConfigFactory.createConfigService(properties);
    }
}
