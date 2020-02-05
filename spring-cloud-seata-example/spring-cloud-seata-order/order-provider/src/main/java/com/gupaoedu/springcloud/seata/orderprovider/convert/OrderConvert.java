package com.gupaoedu.springcloud.seata.orderprovider.convert;

import com.gupaoedu.seata.common.dto.OrderDto;
import com.gupaoedu.springcloud.seata.orderprovider.dal.entitys.Order;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@Mapper(componentModel = "spring")
public interface OrderConvert {

    @Mappings({
        @Mapping(source = "orderCount",target = "count"),
        @Mapping(source = "orderAmount",target = "amount")
    })
    Order dto2Order(OrderDto orderDto);
}
