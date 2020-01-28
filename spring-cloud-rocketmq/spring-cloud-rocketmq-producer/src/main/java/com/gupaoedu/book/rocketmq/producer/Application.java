package com.gupaoedu.book.rocketmq.producer;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.apache.rocketmq.spring.support.RocketMQHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;

import javax.annotation.PostConstruct;

/**
 * @author juede.tcever
 */
@SpringBootApplication
public class Application {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @PostConstruct
    private void init() {
        String msg = "Hello RocketMQ";
        MessageBuilder builder = MessageBuilder.withPayload(msg)
                .setHeader(RocketMQHeaders.TAGS, "binder")
                .setHeader(RocketMQHeaders.KEYS, "my-key")
                .setHeader("DELAY", "5");
        Message message = builder.build();
        rocketMQTemplate.send("TopicTest", message);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
