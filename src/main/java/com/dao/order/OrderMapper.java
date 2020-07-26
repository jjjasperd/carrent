/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.dao.order;
import com.domain.po.order.OrderPO;
import org.apache.ibatis.annotations.*;

import java.util.Date;
/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: OrderQueryMapper.java
 * @Package com.dao.order
 * @Description order query mapper
 * @date 2020 07-25 21:22.
 */
@Mapper
@CacheNamespace
public interface OrderMapper {

	@Insert("insert into OrderPO(OrderPO_no,user_name,user_id,car_name,car_id,rent_start_date,rent_end_date,OrderPO_status) value (#{OrderPONo},#{userName},#{userId},#{carName},#{carId},#{rentStartDate},#{rentEndDate},#{OrderPOStatus})")
	@Options(useGeneratedKeys = true, keyProperty = "OrderPONo")
	void addOrderPO(OrderPO OrderPO);


	@Delete("delete from OrderPO where OrderPO_no = #{OrderPONo}")
	boolean deleteOrderPOById(String OrderPONo);

	@Update("update OrderPO set OrderPO_no=#{OrderPONo},user_name=#{userName},user_id=#{userId},car_name=#{carName},car_id=#{carId},rent_start_date=#{rentStartDate},rent_end_date=#{rentEndDate},OrderPO_status=#{OrderPOStatus} where OrderPO_no = #{OrderPONo}")
	boolean updateOrderPO(OrderPO OrderPO);


	@Update("update OrderPO set user_name=#{userName} where OrderPO_no = #{OrderPONo}")
	boolean updateFieldUserName(@Param("OrderPONo") String OrderPONo,@Param("userName") String userName);


	@Update("update OrderPO set user_id=#{userId} where OrderPO_no = #{OrderPONo}")
	boolean updateFieldUserId(@Param("OrderPONo") String OrderPONo,@Param("userId") String userId);


	@Update("update OrderPO set car_name=#{carName} where OrderPO_no = #{OrderPONo}")
	boolean updateFieldCarName(@Param("OrderPONo") String OrderPONo,@Param("carName") String carName);


	@Update("update OrderPO set car_id=#{carId} where OrderPO_no = #{OrderPONo}")
	boolean updateFieldCarId(@Param("OrderPONo") String OrderPONo,@Param("carId") String carId);


	@Update("update OrderPO set rent_start_date=#{rentStartDate} where OrderPO_no = #{OrderPONo}")
	boolean updateFieldRentStartDate(@Param("OrderPONo") String OrderPONo,@Param("rentStartDate") Date rentStartDate);


	@Update("update OrderPO set rent_end_date=#{rentEndDate} where OrderPO_no = #{OrderPONo}")
	boolean updateFieldRentEndDate(@Param("OrderPONo") String OrderPONo,@Param("rentEndDate") Date rentEndDate);


	@Update("update OrderPO set OrderPO_status=#{OrderPOStatus} where OrderPO_no = #{OrderPONo}")
	boolean updateFieldOrderPOStatus(@Param("OrderPONo") String OrderPONo,@Param("OrderPOStatus") Integer OrderPOStatus);


	@Select("select * from OrderPO where OrderPO_no = #{OrderPONo}")
	OrderPO getOrderPO(String OrderPONo);
}
