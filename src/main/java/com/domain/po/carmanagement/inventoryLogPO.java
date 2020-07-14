/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.domain.po.carmanagement;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: inventoryLog.java
 * @Package com.domain.dto.com.carmanagement
 * @Description inventory log
 * @date 2020 07-13 1:30.
 */
public class inventoryLogPO {

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
}
