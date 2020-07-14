/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.services.order;

import com.api.order.OrderQueryApi;
import com.common.result.Result;
import com.domain.dto.order.OrderDTO;
import org.springframework.stereotype.Service;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: OrderQueryService.java
 * @Package com.services.com.order
 * @Description com.order query service
 * @date 2020 07-13 1:48.
 */
@Service
public class OrderQueryService implements OrderQueryApi {
    /**
     * query orderList by userId
     *
     * @param userId userId
     * @return result
     */
    @Override
    public Result queryOrderByUserId(String userId) {
        //TODO to be implemented
        return null;
    }

    /**
     * query order by condition
     *
     * @param orderDTO orderDTO
     * @return result
     */
    @Override
    public Result queryOrder(OrderDTO orderDTO) {
        return null;
    }
}
