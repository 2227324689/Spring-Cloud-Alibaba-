package com.gupaoedu.springcloud.config.springcloudnacosconfig;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@RestController
public class HelloController {


    @NacosValue(value = "${info:Local Hello World}",autoRefreshed = true)
    private String info;

    @GetMapping("/config")
    public String get(){
        return info;
    }
}
