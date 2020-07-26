/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.api.carmanagement;

import com.common.result.Result;
import com.domain.dto.carmanagement.StoreDTO;
import org.springframework.stereotype.Service;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: StoreManageApi.java
 * @Package com.api.carmanagement
 * @Description store manage api
 * @date 2020 07-26 13:54.
 */
@Service
public interface StoreManageApi {

    /**
     * add a new store
     * @param storeDTO storeDTO
     * @return res
     */
    Result addStore(StoreDTO storeDTO);

    /**
     * query store available car
     * @param storeDTO storeDTO
     * @return res
     */
    Result queryStoreAvailabeCar(StoreDTO storeDTO);
}
