/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.common.utils;

import java.util.UUID;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: UuidUtils.java
 * @Package com.common.utils
 * @Description
 * @date 2020 07-14 1:40.
 */
public class UuidUtils {

    public static String getUserUuid(){
        return "U" +UUID.randomUUID().toString().replace("-", "").toLowerCase().substring(0,16);
    }
}
