/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.services.user;

import com.api.user.UserInformationApi;
import com.domain.dto.userinfo.UserInfoDTO;
import com.domain.po.userinfo.UserInfoPO;
import org.springframework.stereotype.Service;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: UserOperationService.java
 * @Package com.services.com.user
 * @Description com.user operation service
 * @date 2020 07-13 1:49.
 */
@Service
public class UserInformationService implements UserInformationApi {

    @Override
    public UserInfoPO queryUserInfo(UserInfoDTO userInfoDTO) {
        return null;
    }
}
