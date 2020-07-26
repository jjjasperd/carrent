/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.user;

import com.JunitBase;
import com.common.result.Result;
import com.common.utils.UuidUtils;
import com.domain.dto.userinfo.UserInfoDTO;
import com.domain.dto.userinfo.UserRegistrationDTO;
import com.services.user.RegisterService;
import org.apache.commons.lang3.RandomUtils;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;
import java.util.Random;

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
        UserRegistrationDTO userRegistrationDTO = new UserRegistrationDTO();
        userRegistrationDTO.setCustomerName("jjj" + RandomUtils.nextInt(10, 999));
        userRegistrationDTO.setUserName("jjj");
        userRegistrationDTO.setUserPassword("123456" + RandomUtils.nextInt(10, 999));
        userRegistrationDTO.setUserPhone("17688888888");
        userRegistrationDTO.setUserAge(28);
        userRegistrationDTO.setUserGender(1);
        userRegistrationDTO.setUserAddress("at home test");
        userRegistrationDTO.setUserDriverLicenseId("L123123");
        Result result = registerService.registerUser(userRegistrationDTO);
        Assert.assertEquals(Result.SUCCESS, result.getRes());
    }

    @Test
    public void deleteUserTest() {
        UserInfoDTO userInfoDTO = new UserInfoDTO();
        userInfoDTO.setUserId("");
    }
}
