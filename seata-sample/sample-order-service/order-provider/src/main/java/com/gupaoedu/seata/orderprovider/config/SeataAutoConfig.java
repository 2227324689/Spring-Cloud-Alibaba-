package com.gupaoedu.seata.orderprovider.config;

import com.alibaba.druid.pool.DruidDataSource;
import io.seata.rm.datasource.DataSourceProxy;
import io.seata.spring.annotation.GlobalTransactionScanner;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
//@Configuration
public class SeataAutoConfig {

    @Autowired
    private DataSourceProperties dataSourceProperties;

    @Bean
    @Primary
    public DruidDataSource druidDataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setUrl(dataSourceProperties.getUrl());
        druidDataSource.setUsername(dataSourceProperties.getUsername());
        druidDataSource.setPassword(dataSourceProperties.getPassword());
        druidDataSource.setDriverClassName(dataSourceProperties.getDriverClassName());
        return druidDataSource;
    }
/*
    @Bean
    public DataSourceProxy dataSourceProxy(@Autowired DruidDataSource druidDataSource){
        return new DataSourceProxy(druidDataSource);
    }
    @Bean
    public SqlSessionFactory sqlSessionFactory(DataSourceProxy dataSourceProxy) throws Exception {
        SqlSessionFactoryBean factoryBean = new SqlSessionFactoryBean();
        factoryBean.setDataSource(dataSourceProxy);
        factoryBean.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources("classpath*:com/gupaoedu/seata/orderprovider/dal/mappers/*Mapper.xml"));
        factoryBean.setTransactionFactory(new JdbcTransactionFactory());
        return factoryBean.getObject();
    }*/
    @Bean
    public GlobalTransactionScanner globalTransactionScanner(){

        return new GlobalTransactionScanner(
                "sample-order-service","order_default_group");
    }
}
