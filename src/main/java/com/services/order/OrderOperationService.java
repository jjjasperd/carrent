/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.services.order;

import com.api.order.OrderOperationApi;
import com.common.result.Result;
import com.domain.dto.order.OrderDTO;
import org.springframework.stereotype.Service;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: OrderOperationService.java
 * @Package com.services.com.order
 * @Description com.order operation service
 * @date 2020 07-13 1:48.
 */
@Service
public class OrderOperationService implements OrderOperationApi {
    /**
     * create an order
     *
     * @param orderDTO orderDTO
     * @return create result
     */
    @Override
    public Result createOrder(OrderDTO orderDTO) {
        return null;
    }

    /**
     * modify an order
     *
     * @param orderDTO orderDTO
     * @return result
     */
    @Override
    public Result modifyOrder(OrderDTO orderDTO) {
        return null;
    }

    /**
     * cancel an order
     *
     * @param orderDTO orderDTO
     * @return result
     */
    @Override
    public Result cancelOrder(OrderDTO orderDTO) {
        return null;
    }

    /**
     * submit an order
     *
     * @param orderDTO orderDTO
     * @return result
     */
    @Override
    public Result submitOrder(OrderDTO orderDTO) {
        return null;
    }
}
