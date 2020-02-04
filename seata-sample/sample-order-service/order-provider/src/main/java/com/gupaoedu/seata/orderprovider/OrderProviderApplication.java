package com.gupaoedu.seata.orderprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.gupaoedu.seata.orderprovider.dal")
@SpringBootApplication
public class OrderProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(OrderProviderApplication.class, args);
	}

}
