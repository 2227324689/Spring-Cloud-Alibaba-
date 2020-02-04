package com.gupaoedu.seata.common.constants;

import lombok.Data;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
public enum ResCode {
    SUCCESS(200,"成功"),
    SYSTEM_EXCEPTION(500,"系统异常"),
    FAILED(999, "系统错误");
    private int code;
    private String message;

    ResCode(int code, String message) {
        this.code = code;
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
