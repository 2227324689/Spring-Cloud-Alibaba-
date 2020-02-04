package com.gupaoedu.seata.repo;

import com.gupaoedu.seata.common.dto.ProductDto;
import com.gupaoedu.seata.common.response.ObjectResponse;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
public interface IRepoService {

    /**
     * 扣减库存
     */
    ObjectResponse decreaseRepo(ProductDto productDto);
}
