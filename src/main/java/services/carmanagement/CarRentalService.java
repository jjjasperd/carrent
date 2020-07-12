/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package services.carmanagement;

import api.carmanagement.CarRentalApi;
import common.result.Result;
import domain.dto.carmanagement.CarDTO;
import org.springframework.stereotype.Service;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: CarRentalService.java
 * @Package services.carmanagement
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
