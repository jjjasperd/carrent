/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package api.carmanagement;

import common.result.Result;
import domain.dto.carmanagement.CarDTO;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: CarRentalApi.java
 * @Package api
 * @Description carRentalApi
 * @date 2020 07-13 1:44.
 */
public interface CarRentalApi {

    Result rentCar(CarDTO carDTO);

    Result returnCar(CarDTO carDTO);
}
