package com.gupaoedu.seata.repo.repoprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.gupaoedu.seata.repo.repoprovider.dal.mappers")
@SpringBootApplication
public class RepoProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepoProviderApplication.class, args);
	}

}
