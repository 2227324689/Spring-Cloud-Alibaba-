package com.gupaoedu.springcloud.seata.orderprovider.dal.entitys;

import lombok.Data;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@Data
public class Order {
    private Integer id;
    private String orderNo;
    private String userId;
    private String productCode;
    private Integer count;
    private Double amount;
}
