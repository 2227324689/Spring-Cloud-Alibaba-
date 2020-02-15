package com.gupaoedu.book.springcloud.sentinel.springcloudsentinelsample;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@RestController
public class HelloController {

    @SentinelResource(value = "hello",blockHandler = "blockHandlerHello")
    @GetMapping("/say")
    public String hello(){
        return "hello ,Mic";
    }
    public String blockHandlerHello(BlockException e){
        return "被限流了";
    }
}
