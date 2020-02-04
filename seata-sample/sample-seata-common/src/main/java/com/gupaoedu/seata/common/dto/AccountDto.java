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
public class AccountDto implements Serializable{
    private static final long serialVersionUID = 428434492100190769L;
    private Integer id;
    private String userId;
    private BigDecimal balance;
}
