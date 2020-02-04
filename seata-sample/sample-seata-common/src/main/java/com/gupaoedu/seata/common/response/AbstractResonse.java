package com.gupaoedu.seata.common.response;

import lombok.Data;

import java.io.Serializable;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@Data
public class AbstractResonse implements Serializable{
    private static final long serialVersionUID = 8131236360162671718L;
    private int code;
    private String msg;
}
