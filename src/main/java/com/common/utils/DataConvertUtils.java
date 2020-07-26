/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.common.utils;

import com.domain.dto.carmanagement.CarDTO;
import com.domain.dto.userinfo.UserInfoDTO;
import com.domain.dto.userinfo.UserRegistrationDTO;
import com.domain.po.carmanagement.CarPO;
import com.domain.po.userinfo.UserInfoPO;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: DataConvertUtils.java
 * @Package com.common.utils
 * @Description
 * @date 2020 07-14 1:14.
 */
public class DataConvertUtils {

    public static UserInfoPO userInfoDTO2PO(UserInfoDTO userInfoDTO) {
        if (userInfoDTO == null) {
            return null;
        }
        UserInfoPO userInfoPO = new UserInfoPO();
        userInfoPO.setUserId(userInfoDTO.getUserId());
        userInfoPO.setUserName(userInfoDTO.getUserName());
        userInfoPO.setUserAge(userInfoDTO.getUserAge());
        userInfoPO.setUserGender(userInfoDTO.getUserGender());
        userInfoPO.setUserAddress(userInfoDTO.getUserAddress());
        userInfoPO.setUserDriverLicenseId(userInfoDTO.getUserDriverLicenseId());
        userInfoPO.setCustomerName(userInfoDTO.getCustomerName());
        userInfoPO.setUserPhone(userInfoDTO.getUserPhone());
        return userInfoPO;
    }

    public static UserInfoPO userRegistrationDTO2PO(UserRegistrationDTO userRegistrationDTO) {
        if (userRegistrationDTO == null) {
            return null;
        }
        UserInfoPO userInfoPO = new UserInfoPO();
        userInfoPO.setUserName(userRegistrationDTO.getUserName());
        userInfoPO.setUserAge(userRegistrationDTO.getUserAge());
        userInfoPO.setUserGender(userRegistrationDTO.getUserGender());
        userInfoPO.setUserAddress(userRegistrationDTO.getUserAddress());
        userInfoPO.setUserDriverLicenseId(userRegistrationDTO.getUserDriverLicenseId());
        userInfoPO.setCustomerName(userRegistrationDTO.getCustomerName());
        userInfoPO.setUserPhone(userRegistrationDTO.getUserPhone());
        return userInfoPO;
    }

    public static UserInfoDTO userInfoPO2DTO(UserInfoPO userInfoPO) {
        if (userInfoPO == null) {
            return null;
        }
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setUserId(userInfoPO.getUserId());
        userInfoDTO.setUserName(userInfoPO.getUserName());
        userInfoDTO.setUserAge(userInfoPO.getUserAge());
        userInfoDTO.setUserGender(userInfoPO.getUserGender());
        userInfoDTO.setUserAddress(userInfoPO.getUserAddress());
        userInfoDTO.setUserDriverLicenseId(userInfoPO.getUserDriverLicenseId());
        userInfoDTO.setCustomerName(userInfoPO.getCustomerName());
        userInfoDTO.setUserPhone(userInfoPO.getUserPhone());
        return userInfoDTO;
    }

    public static CarPO carDTO2PO(CarDTO carDTO) {
        if (carDTO == null) {
            return null;
        }
        CarPO carPO = new CarPO();
        carPO.setCarId(carDTO.getCarId());
        carPO.setCarName(carDTO.getCarName());
        carPO.setCarSku(carDTO.getCarSku());
        carPO.setCarStatus(carDTO.getCarStatus());
        carPO.setStoreId(carDTO.getStoreId());
        carPO.setGasAmount(carDTO.getGasAmount());
        carPO.setRentDailyPrice(carDTO.getRentDailyPrice());
        return carPO;
    }

    public static CarDTO carPO2DTO(CarPO carPO) {
        if (carPO == null) {
            return null;
        }
        CarDTO carDTO = new CarDTO();
        carDTO.setCarId(carPO.getCarId());
        carDTO.setCarName(carPO.getCarName());
        carDTO.setCarSku(carPO.getCarSku());
        carDTO.setCarStatus(carPO.getCarStatus());
        carDTO.setStoreId(carPO.getStoreId());
        carDTO.setGasAmount(carPO.getGasAmount());
        carDTO.setRentDailyPrice(carPO.getRentDailyPrice());
        return carDTO;
    }

}
