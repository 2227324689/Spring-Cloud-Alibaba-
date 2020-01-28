package com.gupaoedu.book.rocketmq.producer;

import com.google.common.collect.Lists;
import org.apache.rocketmq.client.exception.MQBrokerException;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.client.producer.TransactionSendResult;
import org.apache.rocketmq.remoting.exception.RemotingException;
import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.apache.rocketmq.spring.support.RocketMQHeaders;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.support.MessageBuilder;
import org.springframework.messaging.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

/**
 * @author juede.tcever
 */
@RestController
public class TestController {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @GetMapping(value = "/hello")
    public String hello(String msg) {
        MessageBuilder builder = MessageBuilder.withPayload(msg);
        Message message = builder.build();
        rocketMQTemplate.send("TopicTest", message);
        rocketMQTemplate.send("TopicTest2", message);
        return "Hello RocketMQ，RocketMQTemplate send " + msg;
    }

    @GetMapping(value = "/batch")
    public String batch() throws InterruptedException, RemotingException, MQClientException, MQBrokerException {
        org.apache.rocketmq.common.message.Message msg1 = new org.apache.rocketmq.common.message.Message("TopicTest", "msg1".getBytes());
        org.apache.rocketmq.common.message.Message msg2 = new org.apache.rocketmq.common.message.Message("TopicTest", "msg2".getBytes());
        org.apache.rocketmq.common.message.Message msg3 = new org.apache.rocketmq.common.message.Message("TopicTest", "msg3".getBytes());
        SendResult sendResult =  rocketMQTemplate.getProducer().send(Lists.newArrayList(msg1, msg2, msg3));
        return sendResult.getMsgId();
    }

    @GetMapping(value = "/orderly")
    public String orderly(String orderId) {
        Order order = new Order(orderId, "浙江杭州");
        MessageBuilder builder = MessageBuilder.withPayload(order);
        Message message = builder.build();
        SendResult sendResult = rocketMQTemplate.syncSendOrderly("TopicTest", message, order.getOrderId());
        System.out.println("MsgId = " + sendResult.getMsgId() + ", QueueId = " + sendResult.getMessageQueue().getQueueId());
        return sendResult.getMsgId();
    }

    @GetMapping(value = "/delay")
    public String delay() {
        Order order = new Order("123", "浙江杭州");
        MessageBuilder builder = MessageBuilder.withPayload(order);
        Message message = builder.build();
        SendResult sendResult = rocketMQTemplate.syncSend("TopicTest", message, 10, 5);
        System.out.println("SendTime = " + System.currentTimeMillis());
        return sendResult.getMsgId();
    }

    @GetMapping(value = "/transaction")
    public String transaction() {
        Order order = new Order("123", "浙江杭州");
        MessageBuilder builder = MessageBuilder.withPayload(order).setHeader(RocketMQHeaders.TRANSACTION_ID, UUID.randomUUID().toString());
        Message message = builder.build();

        TransactionSendResult sendResult = rocketMQTemplate.sendMessageInTransaction("OrderTransactionGroup","TopicTest", message, order.getOrderId());
        return sendResult.getMsgId();
    }
}
