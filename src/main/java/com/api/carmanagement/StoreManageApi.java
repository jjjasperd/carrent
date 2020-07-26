/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.api.carmanagement;

import com.common.result.Result;
import com.domain.dto.carmanagement.StoreDTO;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: StoreManageApi.java
 * @Package com.api.carmanagement
 * @Description store manage api
 * @date 2020 07-26 13:54.
 */
public interface StoreManageApi {

    Result addStore(StoreDTO storeDTO);

}
