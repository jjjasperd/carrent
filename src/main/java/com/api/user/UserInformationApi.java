/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.api.user;

import com.domain.dto.userinfo.UserInfoDTO;
import com.domain.po.userinfo.UserInfoPO;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: UserOperationApi.java
 * @Package com.api
 * @Description UserOperationApi
 * @date 2020 07-13 1:46.
 */
public interface UserInformationApi {

    /**
     * query user info by condition
     * @param userInfoDTO
     * @return
     */
    UserInfoPO queryUserInfo(UserInfoDTO userInfoDTO);
}
