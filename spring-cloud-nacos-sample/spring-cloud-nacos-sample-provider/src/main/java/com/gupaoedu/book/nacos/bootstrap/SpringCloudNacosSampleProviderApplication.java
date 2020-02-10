package com.gupaoedu.book.nacos.bootstrap;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
public class SpringCloudNacosSampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudNacosSampleProviderApplication.class, args);
    }
}
