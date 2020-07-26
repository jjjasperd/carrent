/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.services.carmanagement;

import com.api.carmanagement.StoreManageApi;
import com.common.result.Result;
import com.common.utils.ResultUtils;
import com.common.utils.UuidUtils;
import com.dao.store.StorePOMapper;
import com.domain.dto.carmanagement.StoreDTO;
import com.domain.po.carmanagement.StorePO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: StoreManageService.java
 * @Package com.services.carmanagement
 * @Description
 * @date 2020 07-26 14:13.
 */
@Service
public class StoreManageService implements StoreManageApi {
    @Resource
    private StorePOMapper storePOMapper;

    @Override
    public Result addStore(StoreDTO storeDTO) {
        //TODO validate store info
        StorePO storePO = new StorePO();
        storePO.setStoreName(storeDTO.getStoreName());
        storePO.setStoreId(UuidUtils.getStoreUuid());
        storePOMapper.addStorePO(storePO);
        return ResultUtils.success();
    }
}
