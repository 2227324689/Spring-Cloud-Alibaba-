package com.gupaoedu.book.sentienl.web;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author juede.tcever
 */
@RestController
public class TestController {

    @GetMapping(value = "/hello")
    @SentinelResource(value = "HelloWorld", blockHandler = "blockHandler")
    public String hello() {
        return "Hello Sentinel";
    }

    public String blockHandler(BlockException ex) {
        System.out.println("处理限流异常 !!!");
        return "block !!!";
    }

    @SentinelResource(value = "demo")
    public void demo(String name, Integer age) {

    }
}
