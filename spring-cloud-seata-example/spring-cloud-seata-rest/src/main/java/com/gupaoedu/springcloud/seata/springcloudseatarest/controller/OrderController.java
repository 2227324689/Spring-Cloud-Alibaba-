package com.gupaoedu.springcloud.seata.springcloudseatarest.controller;

import com.gupaoedu.seata.common.dto.OrderRequest;
import com.gupaoedu.seata.common.response.ObjectResponse;
import com.gupaoedu.springcloud.seata.springcloudseatarest.service.IRestOrderService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 咕泡学院，只为更好的你
  咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/

@Slf4j
@RestController
public class OrderController {

    @Autowired
    IRestOrderService restOrderService;

    @PostMapping("/order")
    ObjectResponse order(@RequestBody OrderRequest orderRequest) throws Exception {
        return restOrderService.handleBusiness(orderRequest);
    }
}
