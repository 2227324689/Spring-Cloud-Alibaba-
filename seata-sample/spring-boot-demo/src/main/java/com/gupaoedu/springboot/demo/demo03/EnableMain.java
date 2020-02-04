package com.gupaoedu.springboot.demo.demo03;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@SpringBootApplication
@EnableService
public class EnableMain {

    public static void main(String[] args) {
        ConfigurableApplicationContext context=
                SpringApplication.run(EnableMain.class,args);
        //这里是从IoC容器中获得一个对象实例
        context.getBean(TestService.class);
    }
}
