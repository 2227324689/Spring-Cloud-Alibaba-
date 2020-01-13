package com.gupaoedu.book.dubbo.spi;

import org.apache.dubbo.common.extension.SPI;

/**
 * 腾讯课堂搜索【咕泡学院】
 * 官网：www.gupaoedu.com
 * 风骚的Mic 老师
 * create-date: 2020/1/9-18:35
 */
@SPI
public interface Driver {
    String connect();
}
