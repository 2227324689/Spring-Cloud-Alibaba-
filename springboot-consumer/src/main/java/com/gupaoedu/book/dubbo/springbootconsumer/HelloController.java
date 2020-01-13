package com.gupaoedu.book.dubbo.springbootconsumer;

import com.gupaoedu.book.dubbo.IHelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 腾讯课堂搜索【咕泡学院】
 * 官网：www.gupaoedu.com
 * 风骚的Mic 老师
 * create-date: 2020/1/6-16:00
 */
@RestController
public class HelloController {

    @Reference(url = "dubbo://192.168.13.1:20880/com.gupaoedu.book.dubbo.IHelloService")
    private IHelloService helloService;

    @GetMapping("/say")
    public String sayHello(){
        return helloService.sayHello("Mic");
    }

}
