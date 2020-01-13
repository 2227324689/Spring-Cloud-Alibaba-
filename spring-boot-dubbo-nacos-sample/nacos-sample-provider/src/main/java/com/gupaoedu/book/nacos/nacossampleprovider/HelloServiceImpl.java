package com.gupaoedu.book.nacos.nacossampleprovider;

import com.gupaoedu.book.nacos.IHelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * 腾讯课堂搜索【咕泡学院】
 * 官网：www.gupaoedu.com
 * 风骚的Mic 老师
 * create-date: 2020/1/11-0:43
 */
@Service
public class HelloServiceImpl implements IHelloService {

    @Override
    public String sayHello(String name) {
        return "Hello World:"+name;
    }
}
