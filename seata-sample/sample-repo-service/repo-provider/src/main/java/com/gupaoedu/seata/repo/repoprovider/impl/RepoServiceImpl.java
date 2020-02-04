package com.gupaoedu.seata.repo.repoprovider.impl;

import com.gupaoedu.seata.common.constants.ResCode;
import com.gupaoedu.seata.common.dto.ProductDto;
import com.gupaoedu.seata.common.response.ObjectResponse;
import com.gupaoedu.seata.repo.IRepoService;
import com.gupaoedu.seata.repo.repoprovider.dal.mappers.RepoMapper;
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
public class RepoServiceImpl implements IRepoService{
    @Autowired
    RepoMapper repoMapper;

    @Override
    public ObjectResponse decreaseRepo(ProductDto productDto) {
        ObjectResponse response=new ObjectResponse();
        try {
            int repo = repoMapper.decreaseRepo(productDto.getProductCode(), productDto.getCount());
            if(repo>0){
                response.setMsg(ResCode.SUCCESS.getMessage());
                response.setCode(ResCode.SUCCESS.getCode());
                return response;
            }
            response.setMsg(ResCode.FAILED.getMessage());
            response.setCode(ResCode.FAILED.getCode());
        }catch (Exception e){
            log.error("decreaseRepo Occur Exception:"+e);
            response.setCode(ResCode.SYSTEM_EXCEPTION.getCode());
            response.setMsg(ResCode.SYSTEM_EXCEPTION.getMessage()+"-"+e.getMessage());
        }
        return response;
    }
}
