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
public class OrderRequest implements Serializable{
    private static final long serialVersionUID = -4916456555673668661L;
    private String userId;
    private String productCode;
    private String name;
    private Integer count;
    private BigDecimal amount;
}
