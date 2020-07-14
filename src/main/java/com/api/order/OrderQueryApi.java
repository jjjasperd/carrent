/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.api.order;

import com.common.result.Result;
import com.domain.dto.order.OrderDTO;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: OrderQueryApi.java
 * @Package com.api
 * @Description com.order query com.api
 * @date 2020 07-13 1:45.
 */
public interface OrderQueryApi {

    /**
     * query orderList by userId
     * @param userId userId
     * @return result
     */
    Result queryOrderByUserId(String userId);

    /**
     * query order by condition
     * @param orderDTO orderDTO
     * @return result
     */
    Result queryOrder(OrderDTO orderDTO);
}
