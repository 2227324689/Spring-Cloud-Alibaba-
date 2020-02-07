//package com.gupaoedu.book.rocketmq.consumer;
//
//import org.apache.rocketmq.spring.annotation.RocketMQMessageListener;
//import org.apache.rocketmq.spring.core.RocketMQListener;
//import org.springframework.stereotype.Component;
//
///**
// * @author juede.tcever
// */
//@Component
//@RocketMQMessageListener(topic = "TopicTest", consumerGroup = "CONSUMER_GROUP_TOPIC_TEST")
//public class TestListener implements RocketMQListener<String> {
//    @Override
//    public void onMessage(String s) {
//        System.out.println("TopicTest receive: " + s + ", receiveTime = " + System.currentTimeMillis());
//    }
//}
