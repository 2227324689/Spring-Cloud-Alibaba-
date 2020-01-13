package com.gupaoedu.book.spi;

/**
 * 腾讯课堂搜索【咕泡学院】
 * 官网：www.gupaoedu.com
 * 风骚的Mic 老师
 * create-date: 2020/1/9-18:36
 */
public class MysqlDriver implements Driver {
    @Override
    public String connect() {
        return "连接Mysql数据库";
    }
}
