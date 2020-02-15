package com.gupaoedu.book.rocketmq.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

/**
 * @author juede.tcever
 */
@EnableBinding({ Sink.class, InputChannel.class})
@SpringBootApplication
public class Application {

    @StreamListener(value = InputChannel.ORDER_INPUT)
    public void receive(String receiveMsg) {
        System.out.println("receive: " + receiveMsg);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
