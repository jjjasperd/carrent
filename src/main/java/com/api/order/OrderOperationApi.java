/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.api.order;

import com.common.result.Result;
import com.domain.dto.order.OrderDTO;
import com.sun.org.apache.xpath.internal.operations.Or;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: OrderOperationApi.java
 * @Package com.api
 * @Description com.order operation com.api
 * @date 2020 07-13 1:45.
 */
public interface OrderOperationApi {
    /**
     * create an order
     * @param orderDTO orderDTO
     * @return create result
     */
    Result createOrder(OrderDTO orderDTO);

    /**
     * modify an order
     * @param orderDTO orderDTO
     * @return result
     */
    Result modifyOrder(OrderDTO orderDTO);

    /**
     * cancel an order
     * @param orderDTO orderDTO
     * @return result
     */
    Result cancelOrder(OrderDTO orderDTO);

    /**
     * submit an order
     * @param orderDTO orderDTO
     * @return result
     */
    Result submitOrder(OrderDTO orderDTO);
}
