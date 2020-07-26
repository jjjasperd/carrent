/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.domain.dto.carmanagement;

import java.io.Serializable;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: CarDTO.java
 * @Package com.domain.dto.com.carmanagement
 * @Description car dto
 * @date 2020 07-13 1:30.
 */
public class CarDTO implements Serializable {

    private static final long serialVersionUID = -1946549046925632524L;

    /**
     * car id
     */
    private String carId;

    /**
     * name of the car
     */
    private String carName;

    /**
     * identical of the car type
     */
    private String carSku;

    /**
     * car status
     * 1 : Available
     * 2 : being rented
     * 3 : inspecting
     * 4 : repairing
     * 5 : damaged
     */
    private Integer carStatus;

    /**
     * store id
     */
    private String storeId;

    /**
     * gas amount(use to charge when rent and return)
     */
    private Double gasAmount;

    /**
     * price for rent a day
     */
    private Double rentDailyPrice;

    public String getCarId() {
        return carId;
    }

    public void setCarId(String carId) {
        this.carId = carId;
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public String getCarSku() {
        return carSku;
    }

    public void setCarSku(String carSku) {
        this.carSku = carSku;
    }

    public Integer getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(Integer carStatus) {
        this.carStatus = carStatus;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public Double getGasAmount() {
        return gasAmount;
    }

    public void setGasAmount(Double gasAmount) {
        this.gasAmount = gasAmount;
    }

    public Double getRentDailyPrice() {
        return rentDailyPrice;
    }

    public void setRentDailyPrice(Double rentDailyPrice) {
        this.rentDailyPrice = rentDailyPrice;
    }
}
