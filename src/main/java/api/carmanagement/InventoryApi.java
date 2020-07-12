/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package api.carmanagement;

import common.result.Result;
import domain.dto.carmanagement.CarDTO;
import domain.dto.carmanagement.StoreDTO;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: InventoryApi.java
 * @Package api
 * @Description inventory api
 * @date 2020 07-13 1:45.
 */
public interface InventoryApi {

    Result queryCarInventory(StoreDTO storeDTO);

    Result takeAcar(CarDTO carDTO);

    Result returnAcar(CarDTO carDTO);
}
