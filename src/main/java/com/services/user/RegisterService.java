/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.services.user;

import com.api.user.RegiesterApi;
import com.common.result.Result;
import com.common.utils.DataConvertUtils;
import com.common.utils.ResultUtils;
import com.dao.user.UserMapper;
import com.domain.dto.userinfo.UserInfoDTO;
import com.domain.dto.userinfo.UserRegistrationDTO;
import com.domain.po.userinfo.UserInfoPO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;


/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: RegisterService.java
 * @Package com.services.com.user
 * @Description register service
 * @date 2020 07-13 1:49.
 */
@Service
public class RegisterService implements RegiesterApi {
    @Resource
    private UserMapper userMapper;

    /**
     * register
     *
     * @param userRegistrationDTO userRegistrationDTO
     * @return result set
     */
    @Override
    public Result registerUser(UserRegistrationDTO userRegistrationDTO) {
        UserInfoPO userInfoPO = DataConvertUtils.userRegistrationDTO2PO(userRegistrationDTO);
        userMapper.insertUser(userInfoPO);
        return ResultUtils.success();
    }

    @Override
    public Result deleteUser(UserInfoDTO userInfoDTO) {
        userMapper.deleteUSerById(userInfoDTO.getUserId());
        return ResultUtils.success();
    }
}
