package com.gupaoedu.springcloud.seata.accountprovider;

import com.alibaba.cloud.seata.GlobalTransactionAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.gupaoedu.springcloud.seata.accountprovider.dal.mappers")
@SpringBootApplication(exclude = GlobalTransactionAutoConfiguration.class)
public class AccountProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountProviderApplication.class, args);
	}

}
