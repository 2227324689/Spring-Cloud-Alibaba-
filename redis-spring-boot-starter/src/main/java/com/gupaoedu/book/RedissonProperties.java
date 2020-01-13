package com.gupaoedu.book;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.time.Duration;

/**
 * 腾讯课堂搜索【咕泡学院】
 * 官网：www.gupaoedu.com
 * 风骚的Mic 老师
 * create-date: 2020/1/3-19:21
 */
@ConfigurationProperties(prefix = "gp.redisson")
public class RedissonProperties {

    private String host = "localhost";
    private String password;
    private int port = 6379;
    private int timeout;
    private boolean ssl;

    public String getHost() {return host;}
    public void setHost(String host) {this.host = host;}
    public String getPassword() {return password;}
    public void setPassword(String password) {this.password = password;}
    public int getPort() {return port;}
    public void setPort(int port) {this.port = port;}
    public boolean isSsl() {return ssl;}
    public void setSsl(boolean ssl) {this.ssl = ssl;}
    public int getTimeout() {return timeout;}
    public void setTimeout(int timeout) {this.timeout = timeout;}
}
