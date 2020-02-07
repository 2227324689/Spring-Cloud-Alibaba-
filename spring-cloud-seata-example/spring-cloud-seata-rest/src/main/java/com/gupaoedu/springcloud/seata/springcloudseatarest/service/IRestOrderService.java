package com.gupaoedu.springcloud.seata.springcloudseatarest.service;


import com.gupaoedu.seata.common.dto.OrderRequest;
import com.gupaoedu.seata.common.response.ObjectResponse;

public interface IRestOrderService {

    ObjectResponse handleBusiness(OrderRequest orderRequest) throws Exception;
}
