/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.common.businessexception;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: CommonErrorCode.java
 * @Package com.common.businessexception
 * @Description common error code enum
 * @date 2020 07-25 16:31.
 */
public enum CommonErrorCode {
    SYSTEM_ERROR("E001", "System Error!"),

    PARAM_ERROR("E002", "Parameter is invalid!");

    private String errCode;

    private String errMsg;

    public String getErrCode() {
        return errCode;
    }

    public void setErrCode(String errCode) {
        this.errCode = errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }

    public void setErrMsg(String errMsg) {
        this.errMsg = errMsg;
    }

    CommonErrorCode(String errCode, String errMsg) {
        this.errCode = errCode;
        this.errMsg = errMsg;
    }
}