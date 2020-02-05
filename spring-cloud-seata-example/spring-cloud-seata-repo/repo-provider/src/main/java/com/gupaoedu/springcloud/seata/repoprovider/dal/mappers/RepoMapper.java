package com.gupaoedu.springcloud.seata.repoprovider.dal.mappers;

import org.apache.ibatis.annotations.Param;

/**
 * 咕泡学院，只为更好的你
 * 咕泡学院-Mic: 2227324689
 * http://www.gupaoedu.com
 **/
public interface RepoMapper {

    /**
     *
     * @param productCode
     * @param count
     * @return
     */
    int decreaseRepo(@Param("productCode") String productCode, @Param("count") Integer count);
}
