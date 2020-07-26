/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.api.carmanagement;

import com.common.result.Result;
import com.domain.dto.carmanagement.CarDTO;
import com.domain.dto.carmanagement.StoreDTO;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: InventoryApi.java
 * @Package com.api
 * @Description inventory com.api
 * @date 2020 07-13 1:45.
 */
public interface InventoryApi {

    /**
     * Reduce the inventory of a car in store when someone rent it.
     * @param carDTO carDTO
     * @return result
     */
    Result takeAcar(CarDTO carDTO);

    /**
     * Increase the inventory of a car in store when someone return it.
     * @param carDTO carDTO
     * @return result
     */
    Result returnAcar(CarDTO carDTO);
}
