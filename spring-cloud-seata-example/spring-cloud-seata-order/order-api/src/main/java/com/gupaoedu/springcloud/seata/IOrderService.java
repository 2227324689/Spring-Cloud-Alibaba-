package com.gupaoedu.springcloud.seata;

import com.gupaoedu.seata.common.dto.OrderDto;
import com.gupaoedu.seata.common.response.ObjectResponse;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
public interface IOrderService {

    /**
     * 创建订单
     * @param orderDto
     * @return
     */
    ObjectResponse<OrderDto> createOrder(OrderDto orderDto);
}
