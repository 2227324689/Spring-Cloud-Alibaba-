package com.gupaoedu.book.rocketmq.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author juede.tcever
 */
public interface TestChannel {

    String INPUT = "input2";

    @Input(TestChannel.INPUT)
    SubscribableChannel input();
}
