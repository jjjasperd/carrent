/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.domain.dto.userinfo;

import java.io.Serializable;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: UserInfoDTO.java
 * @Package com.domain.dto.userinfo
 * @Description com.user infomation dto
 * @date 2020 07-13 0:52.
 */
public class UserInfoDTO implements Serializable {

    private static final long serialVersionUID = 5393177759322036840L;
    /**
     * auto-generated userId
     */
    private String userId;
    /**
     * input com.user name
     * max length:32
     */
    private String userName;

    /**
     * input com.user name
     * max length:32
     */
    private String userPassword;

    /**
     * input com.user age
     */
    private int userAge;

    /**
     * input gender
     * 1:male
     * 2:female
     */
    private int userGender;

    /**
     * input address
     * max length:256
     */
    private String userAddress;

    /**
     * Driver license id of the customer
     * Usage: to prove that the customer is qualified to drive
     */
    private String userDriverLicenseId;

    /**
     * real name of customer
     * Usage: to record the real name in case of car damaged.
     */
    private String customerName;

    /**
     * phone number that is used to contact the customer.
     */
    private String userPhone;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getUserAge() {
        return userAge;
    }

    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }

    public int getUserGender() {
        return userGender;
    }

    public void setUserGender(int userGender) {
        this.userGender = userGender;
    }

    public String getUserAddress() {
        return userAddress;
    }

    public void setUserAddress(String userAddress) {
        this.userAddress = userAddress;
    }

    public String getUserDriverLicenseId() {
        return userDriverLicenseId;
    }

    public void setUserDriverLicenseId(String userDriverLicenseId) {
        this.userDriverLicenseId = userDriverLicenseId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone;
    }
}
