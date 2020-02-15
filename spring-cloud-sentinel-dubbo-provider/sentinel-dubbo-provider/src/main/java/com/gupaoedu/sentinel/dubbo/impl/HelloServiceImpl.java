package com.gupaoedu.sentinel.dubbo.impl;

import com.gupaoedu.sentinel.dubbo.IHelloService;
import org.apache.dubbo.config.annotation.Service;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@Service
public class HelloServiceImpl implements IHelloService{
    @Override
    public String sayHello() {
        return "Hello GuPao";
    }
}
