package com.gupaoedu.springcloud.seata;


import com.gupaoedu.seata.common.dto.AccountDto;
import com.gupaoedu.seata.common.response.ObjectResponse;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
public interface IAccountService {

    /**
     * 从账户扣款
     * @param accountDto
     * @return
     */
    ObjectResponse decreaseAccount(AccountDto accountDto);
}
