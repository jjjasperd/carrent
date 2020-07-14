/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.api.user;

import com.common.result.Result;
import com.domain.dto.userinfo.UserInfoDTO;
import com.domain.dto.userinfo.UserRegistrationDTO;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: RegiesterApi.java
 * @Package com.api
 * @Description regestration com.api
 * @date 2020 07-13 1:46.
 */
public interface RegiesterApi {
    /**
     * register
     * @param userRegistrationDTO userRegistrationDTO
     * @return result set
     */
    Result registerUser(UserRegistrationDTO userRegistrationDTO);

}
