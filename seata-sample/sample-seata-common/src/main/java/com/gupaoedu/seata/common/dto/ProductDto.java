package com.gupaoedu.seata.common.dto;

import lombok.Data;
import lombok.Getter;

import java.io.Serializable;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/

@Data
public class ProductDto implements Serializable{
    private static final long serialVersionUID = 5842131055690625955L;
    private Integer id;
    private String productCode;
    private String name;
    private Integer count;
}
