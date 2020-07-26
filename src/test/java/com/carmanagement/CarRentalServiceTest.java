/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.carmanagement;

import com.JunitBase;
import com.api.carmanagement.CarRentalApi;
import com.common.result.Result;
import com.common.utils.Constant;
import com.common.utils.UuidUtils;
import com.domain.dto.carmanagement.CarDTO;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: CarRentalServiceTest.java
 * @Package com.carmanagement
 * @Description car rent service test
 * @date 2020 07-26 13:44.
 */
public class CarRentalServiceTest extends JunitBase {

    @Resource
    private CarRentalApi carRentalApi;

    @Test
    public void addCarTest() {
        CarDTO carDTO = new CarDTO();
        carDTO.setCarName("Car" + RandomUtils.nextInt(1,100));
        carDTO.setCarSku("50001" + RandomUtils.nextInt(1,100));
        carDTO.setCarStatus(Constant.CAR_STATUS_AVAILABLE);
        carDTO.setGasAmount(100);
        carDTO.setRentDailyPrice(100);
        carDTO.setStoreId("S41b98d28614f4289");
        Result result = carRentalApi.addCar(carDTO);
        Assert.assertEquals(Result.SUCCESS,result.getRes());
    }

    @Test
    public void rentCarTest() {
        CarDTO carDTO = new CarDTO();
        carDTO.setStoreId("S41b98d28614f4289");
        carDTO.setCarId("C1b93bab4a8b842b7");
        Result result = carRentalApi.rentCar(carDTO);
        Assert.assertEquals(Result.SUCCESS,result.getRes());
    }

    @Test
    public void returnCarTest() {
        CarDTO carDTO = new CarDTO();
        carDTO.setStoreId("S41b98d28614f4289");
        carDTO.setCarId("C1b93bab4a8b842b7");
        Result result = carRentalApi.returnCar(carDTO);
        Assert.assertEquals(Result.SUCCESS,result.getRes());
    }
}
