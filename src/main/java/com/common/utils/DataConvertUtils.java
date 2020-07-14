/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.common.utils;

import com.domain.dto.userinfo.UserInfoDTO;
import com.domain.dto.userinfo.UserRegistrationDTO;
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
}
