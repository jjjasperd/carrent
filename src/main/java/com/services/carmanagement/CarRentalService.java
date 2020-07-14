/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.services.carmanagement;

import com.api.carmanagement.CarRentalApi;
import com.common.result.Result;
import com.domain.dto.carmanagement.CarDTO;
import org.springframework.stereotype.Service;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: CarRentalService.java
 * @Package com.services.com.carmanagement
 * @Description rent car service
 * @date 2020 07-13 1:43.
 */
@Service
public class CarRentalService implements CarRentalApi {
    @Override
    public Result rentCar(CarDTO carDTO) {
        return null;
    }

    @Override
    public Result returnCar(CarDTO carDTO) {
        return null;
    }
}
