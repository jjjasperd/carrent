/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.services.user;

import com.api.user.UserInformationApi;
import com.common.businessexception.BusinessException;
import com.common.businessexception.CommonErrorCode;
import com.common.result.Result;
import com.common.utils.DataConvertUtils;
import com.common.utils.ResultUtils;
import com.dao.user.UserMapper;
import com.domain.dto.userinfo.UserInfoDTO;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

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

    @Resource
    private UserMapper userMapper;
    @Override
    public Result queryUserInfoById(String userId) {
        if (StringUtils.isBlank(userId)) {
            throw new BusinessException(CommonErrorCode.PARAM_ERROR.getErrCode(), CommonErrorCode.PARAM_ERROR.getErrMsg());
        }
        UserInfoDTO resultUserInfoDTO = DataConvertUtils.userInfoPO2DTO(userMapper.getUserById(userId));
        return ResultUtils.success(resultUserInfoDTO);
    }
}
