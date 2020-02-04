package com.gupaoedu.springboot.demo.demo01;

import com.gupaoedu.springboot.demo.demo02.DefaultClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
public class ConfigurationMain {

    public static void main(String[] args) {
//        ApplicationContext context=new FileSystemXmlApplicationContext("aplicationContext.xml");
        ApplicationContext context=
                new AnnotationConfigApplicationContext(ConfigurationDemo.class);
        //去spring容器中找到DemoClass的实例
        //name / type
        DefaultClass dc=context.getBean(DefaultClass.class);
        /*DemoClass dc=context.getBean(DemoClass.class);
        System.out.println(dc.say());*/
    }
}
