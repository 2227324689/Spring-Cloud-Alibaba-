package com.gupaoedu.springcloud.seata.accountprovider.dal.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/

public interface AccountMapper {

    int decreaseAccount(@Param("userId") String userId, @Param("balance") Double balance);
}
