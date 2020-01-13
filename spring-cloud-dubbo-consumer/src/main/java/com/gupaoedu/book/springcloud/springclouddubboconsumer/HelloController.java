package com.gupaoedu.book.springcloud.springclouddubboconsumer;

import com.gupaoedu.book.springcloud.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 腾讯课堂搜索【咕泡学院】
 * 官网：www.gupaoedu.com
 * 风骚的Mic 老师
 * create-date: 2020/1/7-21:56
 */
@RestController
public class HelloController {

    @Reference(mock = "com.gupaoedu.book.springcloud.springclouddubboconsumer.MockHelloService",
            cluster = "failfast")
    private IHelloService iHelloService;

    @GetMapping("/say")
    public String sayHello(){
        return iHelloService.sayHello("Mic");
    }
}
