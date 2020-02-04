package com.gupaoedu.seata.common.dto;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@Data
public class OrderDto implements Serializable{
    private static final long serialVersionUID = -1233077570826468556L;
    private String orderNo;
    private String userId;
    private String productCode;
    private Integer orderCount;
    private BigDecimal orderAmount;
}
