/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.common.businessexception;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: BusinessException.java
 * @Package com.common.businessexception
 * @Description business exception that difined by the product
 * @date 2020 07-13 0:24.
 */
public class BusinessException extends RuntimeException{

    private String code;

    private Object data;

    public BusinessException() {
        super();
    }


    public BusinessException(Throwable e) {
        super(e);
    }

    public BusinessException(String code, String msg){
        super(msg);
        this.code = code;
    }

    public BusinessException(String code, String msg, Object data){
        super(msg);
        this.code = code;
        this.data = data;
    }


    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Object getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
