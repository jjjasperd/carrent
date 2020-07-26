/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.api.carmanagement;

import com.common.result.Result;
import com.domain.dto.carmanagement.CarDTO;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: CarRentalApi.java
 * @Package com.api
 * @Description carRentalApi
 * @date 2020 07-13 1:44.
 */
public interface CarRentalApi {

    Result addCar(CarDTO carDTO);

    /**
     * check the inventory by queryCarInventory
     * rent a car
     * log inventory rent log
     * @param carDTO carDTO
     * @return return result
     */
    Result rentCar(CarDTO carDTO);

    /**
     * return a car
     * log inventory return log
     * @param carDTO carDTO
     * @return result
     */
    Result returnCar(CarDTO carDTO);
}
