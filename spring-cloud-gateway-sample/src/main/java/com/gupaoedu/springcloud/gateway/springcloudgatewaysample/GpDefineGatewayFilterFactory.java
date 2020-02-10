package com.gupaoedu.springcloud.gateway.springcloudgatewaysample;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilter;
import org.springframework.cloud.gateway.filter.factory.AbstractGatewayFilterFactory;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@Service
@Slf4j
public class GpDefineGatewayFilterFactory extends AbstractGatewayFilterFactory<GpDefineGatewayFilterFactory.GpConfig>{

    public GpDefineGatewayFilterFactory(){
        super(GpConfig.class);
    }

    @Override
    public GatewayFilter apply(GpConfig config) {
        return ((exchange, chain) -> {
            log.info("[Pre] Filter Request,name:"+config.getName());
            return chain.filter(exchange).then(Mono.fromRunnable(()->{
                log.info("[Post] Response Filter");
            }));
        });
    }

    public static class GpConfig{
        private String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
