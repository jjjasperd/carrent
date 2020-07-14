/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.common.result;

import java.io.Serializable;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: Result.java
 * @Package com.common.result
 * @Description Result set which are used to combine result data
 * @date 2020 07-13 0:30.
 */
public class Result implements Serializable {

    private static final long serialVersionUID = -4219262547455898689L;

    /**
     * SUCCESS = "1"
     */
    public static final String SUCCESS = "1";

    /**
     * FAIL = "0"
     */
    public static final String FAIL = "0";

    /**
     * result symbol
     * 1: Success
     * 2: Fail
     */
    private String res;

    /**
     * response error code
     */
    private String errCode;

    /**
     * response error message
     */
    private String errMsg;

    /**
     * result data
     */
    private Object data;

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

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

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
