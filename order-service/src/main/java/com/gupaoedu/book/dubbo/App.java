package com.gupaoedu.book.dubbo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("classpath*:META-INF/spring/consumer.xml");
        IUserService iUserService=(IUserService)context.getBean("userService");
        System.out.println(iUserService.getNameById("1001"));
    }
}
