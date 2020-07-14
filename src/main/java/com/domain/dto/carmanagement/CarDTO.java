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
    private int carStatus;

    /**
     * store id
     */
    private String storeId;

    /**
     * gas amount(use to charge when rent and return)
     */
    private double gasAmount;

    /**
     * price for rent a day
     */
    private double rentDailyPrice;

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

    public int getCarStatus() {
        return carStatus;
    }

    public void setCarStatus(int carStatus) {
        this.carStatus = carStatus;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public double getGasAmount() {
        return gasAmount;
    }

    public void setGasAmount(double gasAmount) {
        this.gasAmount = gasAmount;
    }

    public double getRentDailyPrice() {
        return rentDailyPrice;
    }

    public void setRentDailyPrice(double rentDailyPrice) {
        this.rentDailyPrice = rentDailyPrice;
    }
}
