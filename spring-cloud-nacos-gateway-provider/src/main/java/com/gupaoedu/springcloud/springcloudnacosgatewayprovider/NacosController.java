package com.gupaoedu.springcloud.springcloudnacosgatewayprovider;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@RestController
public class NacosController {

    @GetMapping("/say")
    public String sayHello(){
        return "[spring-cloud-nacos-gatewayh-provider]:sayHello";
    }
}
