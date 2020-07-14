/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.services.carmanagement;

import com.api.carmanagement.InventoryApi;
import com.common.result.Result;
import com.domain.dto.carmanagement.CarDTO;
import com.domain.dto.carmanagement.StoreDTO;
import org.springframework.stereotype.Service;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: InventoryService.java
 * @Package com.services.com.carmanagement
 * @Description inventory service
 * @date 2020 07-13 1:47.
 */
@Service
public class InventoryService implements InventoryApi {
    @Override
    public Result queryCarInventory(StoreDTO storeDTO) {
        return null;
    }

    @Override
    public Result takeAcar(CarDTO carDTO) {
        return null;
    }

    @Override
    public Result returnAcar(CarDTO carDTO) {
        return null;
    }
}
