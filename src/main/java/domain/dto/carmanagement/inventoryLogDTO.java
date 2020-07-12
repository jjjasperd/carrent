/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package domain.dto.carmanagement;

import java.io.Serializable;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: inventoryLog.java
 * @Package domain.dto.carmanagement
 * @Description inventory log
 * @date 2020 07-13 1:30.
 */
public class inventoryLogDTO implements Serializable {
    private static final long serialVersionUID = -7263427549887616343L;

    /**
     * log id
     */
    private long logId;

    /**
     * log type
     * 1:rent
     * 2:return
     */
    private int logType;

    /**
     * rented car id
     */
    private String carId;

    /**
     * rented store
     */
    private String storeId;

    /**
     * remark
     * max length 256
     */
    private String remark;

    public long getLogId() {
        return logId;
    }

    public void setLogId(long logId) {
        this.logId = logId;
    }

    public int getLogType() {
        return logType;
    }

    public void setLogType(int logType) {
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
}
