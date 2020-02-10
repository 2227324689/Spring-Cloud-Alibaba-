package com.gupaoedu.springcloud.config.springcloudnacosconfig;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCloudNacosConfigApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context=
				SpringApplication.run(SpringCloudNacosConfigApplication.class, args);
		String info=context.getEnvironment().getProperty("info");
		System.out.println(info);
	}
}
