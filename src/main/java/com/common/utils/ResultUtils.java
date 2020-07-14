/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.common.utils;

import com.common.result.Result;

import java.io.Serializable;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: ResultUtils.java
 * @Package com.common.utils
 * @Description
 * @date 2020 07-14 1:20.
 */
public class ResultUtils {

    public static Result success(){
        Result rt = new Result();
        rt.setRes(Result.SUCCESS);
        return rt;
    }

    public static Result fail(){
        Result rt = new Result();
        rt.setRes(Result.FAIL);
        return rt;
    }

    public static Result success(Object data){
        Result rt = success();
        rt.setData(data);
        return rt;
    }

    public static Result fail(String errCode , String errMsg){
        Result rt = fail();
        rt.setErrMsg(errMsg);
        rt.setErrCode(errCode);
        return rt;
    }

}
