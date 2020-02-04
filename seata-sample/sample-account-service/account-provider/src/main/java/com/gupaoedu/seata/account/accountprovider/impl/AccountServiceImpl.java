package com.gupaoedu.seata.account.accountprovider.impl;

import com.gupaoedu.seata.account.IAccountService;
import com.gupaoedu.seata.account.accountprovider.dal.mappers.AccountMapper;
import com.gupaoedu.seata.common.constants.ResCode;
import com.gupaoedu.seata.common.dto.AccountDto;
import com.gupaoedu.seata.common.response.ObjectResponse;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
@Slf4j
@Service
public class AccountServiceImpl implements IAccountService{

    @Autowired
    AccountMapper accountMapper;

    @Override
    public ObjectResponse decreaseAccount(AccountDto accountDto) {
        ObjectResponse response=new ObjectResponse();
        try{
            int rs=accountMapper.decreaseAccount(accountDto.getUserId(),accountDto.getBalance().doubleValue());
            if(rs>0){
                response.setMsg(ResCode.SUCCESS.getMessage());
                response.setCode(ResCode.SUCCESS.getCode());
                return response;
            }
            response.setMsg(ResCode.FAILED.getMessage());
            response.setCode(ResCode.FAILED.getCode());
        }catch (Exception e){
            log.error("decreaseAccount Occur Exception:"+e);
            response.setCode(ResCode.SYSTEM_EXCEPTION.getCode());
            response.setMsg(ResCode.SYSTEM_EXCEPTION.getMessage()+"-"+e.getMessage());
        }
        return response;
    }
}
