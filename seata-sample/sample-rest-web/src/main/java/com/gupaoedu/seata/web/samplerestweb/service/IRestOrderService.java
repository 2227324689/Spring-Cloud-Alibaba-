package com.gupaoedu.seata.web.samplerestweb.service;


import com.gupaoedu.seata.common.dto.OrderRequest;
import com.gupaoedu.seata.common.response.ObjectResponse;

public interface IRestOrderService {

    ObjectResponse handleBusiness(OrderRequest orderRequest) throws Exception;
}
