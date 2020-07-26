/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.services.carmanagement;

import com.api.carmanagement.InventoryApi;
import com.common.result.Result;
import com.common.utils.Constant;
import com.common.utils.ResultUtils;
import com.dao.carmanagement.InventoryLogPOMapper;
import com.domain.dto.carmanagement.CarDTO;
import com.domain.dto.carmanagement.StoreDTO;
import com.domain.po.carmanagement.InventoryLogPO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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
    @Resource
    private InventoryLogPOMapper inventoryLogPOMapper;

    @Override
    public Result takeAcar(CarDTO carDTO) {
        InventoryLogPO inventoryLogPO = new InventoryLogPO();
        inventoryLogPO.setCarId(carDTO.getCarId());
        inventoryLogPO.setLogType(Constant.LOG_TYPE_RENT);
        inventoryLogPO.setStoreId(carDTO.getStoreId());
        inventoryLogPOMapper.addInventoryLogPO(inventoryLogPO);
        return ResultUtils.success();
    }

    @Override
    public Result returnAcar(CarDTO carDTO) {
        InventoryLogPO inventoryLogPO = new InventoryLogPO();
        inventoryLogPO.setCarId(carDTO.getCarId());
        inventoryLogPO.setLogType(Constant.LOG_TYPE_RETURN);
        inventoryLogPO.setStoreId(carDTO.getStoreId());
        inventoryLogPOMapper.addInventoryLogPO(inventoryLogPO);
        return ResultUtils.success();
    }
}
