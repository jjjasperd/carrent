/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.domain.po.carmanagement;

import java.io.Serializable;

public class CarPO implements Serializable {

  private static final long serialVersionUID = -9051417307175314509L;
  private String carId;
  private String carName;
  private String carSku;
  private Integer carStatus;
  private String storeId;
  private Double gasAmount;
  private Double rentDailyPrice;
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
