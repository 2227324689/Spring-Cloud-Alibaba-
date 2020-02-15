package com.gupaoedu.sentinel.dubbo.bootstrap;

import org.apache.dubbo.config.ConsumerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("com.gupaoedu.sentinel.dubbo")
@SpringBootApplication
public class SentinelDubboProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SentinelDubboProviderApplication.class, args);
	}


}
