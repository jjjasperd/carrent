/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.user;

import com.JunitBase;
import com.common.result.Result;
import com.domain.dto.userinfo.UserInfoDTO;
import com.services.user.UserInformationService;
import org.junit.Assert;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: UserInformationServiceTest.java
 * @Package com.user
 * @Description user info mation service test
 * @date 2020 07-25 14:48.
 */
public class UserInformationServiceTest extends JunitBase {
    @Resource
    private UserInformationService userInformationService;

    @Test
    public void queryUserInfoTest() {

        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setUserId("u82a5ceb8274c4fb1");
        Result result = userInformationService.queryUserInfoById(userInfoDTO.getUserId());
        Assert.assertNotNull(result.getData());
    }

}
