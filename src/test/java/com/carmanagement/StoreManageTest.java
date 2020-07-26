/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.carmanagement;

import com.JunitBase;
import com.api.carmanagement.StoreManageApi;
import com.common.result.Result;
import com.domain.dto.carmanagement.StoreDTO;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: StoreManageTest.java
 * @Package com.carmanagement
 * @Description
 * @date 2020 07-26 14:16.
 */
public class StoreManageTest extends JunitBase {

    @Resource
    private StoreManageApi storeManageApi;

    @Test
    public void addStoreTest() {
        StoreDTO storeDTO = new StoreDTO();
        storeDTO.setStoreName("Store1"+ RandomUtils.nextInt(1,10000));
        Result result = storeManageApi.addStore(storeDTO);
        Assert.assertEquals(Result.SUCCESS,result.getRes());
    }
}
