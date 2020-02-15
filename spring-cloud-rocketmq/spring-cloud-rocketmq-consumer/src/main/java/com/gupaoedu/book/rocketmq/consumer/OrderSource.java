package com.gupaoedu.book.rocketmq.consumer;

import org.springframework.cloud.stream.annotation.Output;
import org.springframework.messaging.MessageChannel;

/**
 * @author juede.tcever
 */
public interface OrderSource {

    String OUTPUT = "orderOutput";

    @Output(OrderSource.OUTPUT)
    MessageChannel output();
}
