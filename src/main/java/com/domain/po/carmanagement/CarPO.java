/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.domain.po.carmanagement;

public class CarPO {

  private String carId;
  private String carName;
  private String carSku;
  private long carStatus;
  private String storeId;
  private double gasAmount;
  private double rentDailyPrice;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp modifyTime;


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


  public long getCarStatus() {
    return carStatus;
  }

  public void setCarStatus(long carStatus) {
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


  public java.sql.Timestamp getCreateTime() {
    return createTime;
  }

  public void setCreateTime(java.sql.Timestamp createTime) {
    this.createTime = createTime;
  }


  public java.sql.Timestamp getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(java.sql.Timestamp modifyTime) {
    this.modifyTime = modifyTime;
  }

}
