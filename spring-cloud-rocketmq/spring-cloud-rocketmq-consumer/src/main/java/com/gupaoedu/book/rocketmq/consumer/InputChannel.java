package com.gupaoedu.book.rocketmq.consumer;

import org.springframework.cloud.stream.annotation.Input;
import org.springframework.messaging.SubscribableChannel;

/**
 * @author juede.tcever
 */
public interface InputChannel {

    String USER_INPUT = "userInput";

    String ORDER_INPUT = "orderInput";

    @Input(InputChannel.USER_INPUT)
    SubscribableChannel userInput();

    @Input(InputChannel.ORDER_INPUT)
    SubscribableChannel orderInput();
}
