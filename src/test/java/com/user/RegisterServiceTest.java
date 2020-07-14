/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.user;

import com.JunitBase;
import com.common.result.Result;
import com.common.utils.UuidUtils;
import com.domain.dto.userinfo.UserInfoDTO;
import com.services.user.RegisterService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: RegisterServiceTest.java
 * @Package com.user
 * @Description
 * @date 2020 07-14 1:26.
 */
public class RegisterServiceTest extends JunitBase {

    @Resource
    private RegisterService registerService;

    @Test
    public void insertUserTest() {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setUserId(UuidUtils.getUserUuid());
        userInfoDTO.setCustomerName("jjj");
        userInfoDTO.setUserName("jjj");
        userInfoDTO.setUserPhone("17688888888");
        userInfoDTO.setUserAge(28);
        userInfoDTO.setUserGender(1);
        userInfoDTO.setUserAddress("at home test");
        userInfoDTO.setUserDriverLicenseId("L123123");
        Result result = registerService.registerUser(userInfoDTO);
        Assert.assertEquals(Result.SUCCESS, result.getRes());
    }

    @Test
    public void deleteUserTest() {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setUserId("");
    }
}
