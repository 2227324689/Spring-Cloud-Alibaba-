package com.gupaoedu.springcloud.seata.springcloudseatarest;

import com.alibaba.cloud.seata.GlobalTransactionAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(exclude = GlobalTransactionAutoConfiguration.class)
public class SpringCloudSeataRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudSeataRestApplication.class, args);
	}

}
