package com.gupaoedu.book.stream.rocketmq.stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.Message;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

/**
 * @author juede.tcever
 */
//@RestController

@Component
public class ProduceController {
//
//    @Autowired
//    private StreamClient source;

    @Autowired
    private Source source;

//    @StreamListener("input1")
//    public void test(String message){
//        System.out.println(message);
//    }

    @PostConstruct
    private void init() throws InterruptedException {
        MessageBuilder builder = MessageBuilder.withPayload("init...");
        Message message = builder.build();
        source.output().send(message);
        System.out.println("init...");
    }
}
