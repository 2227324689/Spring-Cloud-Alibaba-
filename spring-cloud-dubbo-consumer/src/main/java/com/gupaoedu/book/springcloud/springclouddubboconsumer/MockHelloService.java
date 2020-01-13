package com.gupaoedu.book.springcloud.springclouddubboconsumer;

import com.gupaoedu.book.springcloud.IHelloService;

/**
 * 腾讯课堂搜索【咕泡学院】
 * 官网：www.gupaoedu.com
 * 风骚的Mic 老师
 * create-date: 2020/1/8-22:23
 */
public class MockHelloService implements IHelloService {
    @Override
    public String sayHello(String s) {
        return "Sorry，服务无法访问，返回降级数据";
    }
}
