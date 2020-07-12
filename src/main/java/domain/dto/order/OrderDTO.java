/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package domain.dto.order;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: OrderDTO.java
 * @Package domain.dto.order
 * @Description Order dto
 * @date 2020 07-13 0:54.
 */
public class OrderDTO implements Serializable {

    private static final long serialVersionUID = -1216542043533936248L;

    /**
     * orderNo
     */
    private String orderNo;

    /**
     * user name
     */
    private String userName;

    /**
     * user id
     */
    private String userId;

    /**
     * car name
     */
    private String carName;

    /**
     * car id
     */
    private String carId;

    /**
     * rent start date
     */
    private Date rentstartDate;

    /**
     * rent end(return) date
     */
    private Date rentEndDate;

    /**
     * order status
     * 1:New
     * 2:renting
     * 3:completed
     */
    private int orderStatus;

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

    public Date getRentstartDate() {
        return rentstartDate;
    }

    public void setRentstartDate(Date rentstartDate) {
        this.rentstartDate = rentstartDate;
    }

    public Date getRentEndDate() {
        return rentEndDate;
    }

    public void setRentEndDate(Date rentEndDate) {
        this.rentEndDate = rentEndDate;
    }

    public int getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(int orderStatus) {
        this.orderStatus = orderStatus;
    }
}
