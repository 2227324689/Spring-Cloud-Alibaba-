package com.gupaoedu.springcloud.seata.repoprovider;

import com.alibaba.cloud.seata.GlobalTransactionAutoConfiguration;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan(basePackages = "com.gupaoedu.springcloud.seata.repoprovider.dal.mappers")
@SpringBootApplication(exclude = GlobalTransactionAutoConfiguration.class)
public class RepoProviderApplication {

	public static void main(String[] args) {
		SpringApplication.run(RepoProviderApplication.class, args);
	}

}
