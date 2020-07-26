/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.domain.po.order;


public class OrderPO {

  private String orderNo;
  private String userName;
  private String userId;
  private String carName;
  private String carId;
  private java.sql.Date rentStartDate;
  private java.sql.Date rentEndDate;
  private long orderStatus;
  private java.sql.Timestamp creaateTime;
  private java.sql.Timestamp modifyTime;


  public String getOrderNo() {
    return orderNo;
  }

  public void setOrderNo(String orderNo) {
    this.orderNo = orderNo;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  public String getCarName() {
    return carName;
  }

  public void setCarName(String carName) {
    this.carName = carName;
  }


  public String getCarId() {
    return carId;
  }

  public void setCarId(String carId) {
    this.carId = carId;
  }


  public java.sql.Date getRentStartDate() {
    return rentStartDate;
  }

  public void setRentStartDate(java.sql.Date rentStartDate) {
    this.rentStartDate = rentStartDate;
  }


  public java.sql.Date getRentEndDate() {
    return rentEndDate;
  }

  public void setRentEndDate(java.sql.Date rentEndDate) {
    this.rentEndDate = rentEndDate;
  }


  public long getOrderStatus() {
    return orderStatus;
  }

  public void setOrderStatus(long orderStatus) {
    this.orderStatus = orderStatus;
  }


  public java.sql.Timestamp getCreaateTime() {
    return creaateTime;
  }

  public void setCreaateTime(java.sql.Timestamp creaateTime) {
    this.creaateTime = creaateTime;
  }


  public java.sql.Timestamp getModifyTime() {
    return modifyTime;
  }

  public void setModifyTime(java.sql.Timestamp modifyTime) {
    this.modifyTime = modifyTime;
  }

}
