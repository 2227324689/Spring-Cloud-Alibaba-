package com.gupaoedu.springcloud.seata.springcloudseatarest.service;

import com.gupaoedu.seata.common.constants.ResCode;
import com.gupaoedu.seata.common.dto.OrderDto;
import com.gupaoedu.seata.common.dto.OrderRequest;
import com.gupaoedu.seata.common.dto.ProductDto;
import com.gupaoedu.seata.common.response.ObjectResponse;
import com.gupaoedu.springcloud.seata.IOrderService;
import com.gupaoedu.springcloud.seata.IRepoService;
import io.seata.core.context.RootContext;
import io.seata.spring.annotation.GlobalTransactional;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * @Author: heshouyou
 * @Description  Dubbo业务发起方逻辑
 * @Date Created in 2019/1/14 18:36
 */
@Slf4j
@Service
public class RestOrderServiceImpl implements IRestOrderService {
    @Reference
    IRepoService repoService;
    @Reference
    IOrderService orderService;

    @Override
    @GlobalTransactional(timeoutMills = 300000, name = "spring-cloud-seata-rest")
    public ObjectResponse handleBusiness(OrderRequest orderRequest) throws Exception {
        log.info("开始全局事务:xid="+ RootContext.getXID());
        log.info("begin order: "+orderRequest);
        //1. 扣减库存
        ProductDto productDto=new ProductDto();
        productDto.setProductCode(orderRequest.getProductCode());
        productDto.setCount(orderRequest.getCount());
        ObjectResponse repoRes=repoService.decreaseRepo(productDto);
        //2. 创建订单
        OrderDto orderDto=new OrderDto();
        orderDto.setUserId(orderRequest.getUserId());
        orderDto.setOrderAmount(orderRequest.getAmount());
        orderDto.setOrderCount(orderRequest.getCount());
        orderDto.setProductCode(orderRequest.getProductCode());
        ObjectResponse orderRes=orderService.createOrder(orderDto);
        if(orderRequest.getProductCode().equals("GP20200202002")){
            throw new Exception("系统异常");
        }
        ObjectResponse response=new ObjectResponse();
        response.setMsg(ResCode.SUCCESS.getMessage());
        response.setCode(ResCode.SUCCESS.getCode());
        response.setData(orderRes.getData());
        return response;
    }
}
