package com.gupaoedu.seata.account.accountprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.gupaoedu.seata.account.accountprovider.dal.mappers")
@SpringBootApplication
public class AccountProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(AccountProviderApplication.class, args);
	}

}
