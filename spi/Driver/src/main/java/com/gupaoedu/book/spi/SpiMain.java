package com.gupaoedu.book.spi;

import java.util.ServiceLoader;

/**
 * 腾讯课堂搜索【咕泡学院】
 * 官网：www.gupaoedu.com
 * 风骚的Mic 老师
 * create-date: 2020/1/9-19:02
 */
public class SpiMain {
    public static void main(String[] args) {
        ServiceLoader<Driver> serviceLoader=ServiceLoader.load(Driver.class);
        serviceLoader.forEach(driver -> System.out.println(driver.connect()));
    }
}
