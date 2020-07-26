/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.domain.po.carmanagement;

public class InventoryLogPO {

  private long logId;
  private long logType;
  private String carId;
  private String storeId;
  private String remark;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp modifyTime;


  public long getLogId() {
    return logId;
  }

  public void setLogId(long logId) {
    this.logId = logId;
  }


  public long getLogType() {
    return logType;
  }

  public void setLogType(long logType) {
    this.logType = logType;
  }


  public String getCarId() {
    return carId;
  }

  public void setCarId(String carId) {
    this.carId = carId;
  }


  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }


  public String getRemark() {
    return remark;
  }

  public void setRemark(String remark) {
    this.remark = remark;
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
