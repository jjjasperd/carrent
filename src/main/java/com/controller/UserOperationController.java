/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.controller;

import com.common.businessexception.BusinessException;
import com.common.result.Result;
import com.common.utils.ResultUtils;
import com.domain.dto.userinfo.UserInfoDTO;
import com.domain.dto.userinfo.UserRegistrationDTO;
import com.services.user.RegisterService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.validation.Valid;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: UserOperationController.java
 * @Package com.controller
 * @Description user info controller
 * @date 2020 07-14 21:47.
 */
@RestController
@RequestMapping(value = "/user")
public class UserOperationController {

    @Resource
    private RegisterService registerService;

    @PostMapping("/registration")
    public Result registration(@Valid UserRegistrationDTO userRegistrationDTO) {
        try {

            return registerService.registerUser(userRegistrationDTO);
        }catch (BusinessException e){
            return ResultUtils.fail(e.getCode(),e.getMessage());
        }catch (Exception e){
            return ResultUtils.fail("E001", "System Error.");
        }

    }

}
