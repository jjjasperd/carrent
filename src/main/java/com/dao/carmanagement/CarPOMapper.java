package com.dao.carmanagement;
import com.domain.po.carmanagement.CarPO;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: CarPOMapper.java
 * @Package com.dao.carmanagement
 * @Description car query mapper
 * @date 2020 07-25 21:22.
 */
@Mapper
@CacheNamespace
public interface CarPOMapper {

	@Insert("insert into car(car_id,car_name,car_sku,car_status,store_id,gas_amount,rent_daily_price) value (#{carId},#{carName},#{carSku},#{carStatus},#{storeId},#{gasAmount},#{rentDailyPrice})")
	@Options(useGeneratedKeys = true, keyProperty = "carId")
	void addCarPO(CarPO car);


	@Delete("delete from car where car_id = #{carId}")
	boolean deleteCarPOById(String carId);

	@Update("update car set car_id=#{carId},car_name=#{carName},car_sku=#{carSku},car_status=#{carStatus},store_id=#{storeId},gas_amount=#{gasAmount},rent_daily_price=#{rentDailyPrice} where car_id = #{carId}")
	boolean updateCarPO(CarPO car);


	@Update("update car set car_name=#{carName} where car_id = #{carId}")
	boolean updateFieldCarPOName(@Param("carId") String carId,@Param("carName") String carName);


	@Update("update car set car_sku=#{carSku} where car_id = #{carId}")
	boolean updateFieldCarPOSku(@Param("carId") String carId,@Param("carSku") String carSku);


	@Update("update car set car_status=#{carStatus} where car_id = #{carId}")
	boolean updateFieldCarPOStatus(@Param("carId") String carId,@Param("carStatus") Integer carStatus);


	@Update("update car set store_id=#{storeId} where car_id = #{carId}")
	boolean updateFieldStoreId(@Param("carId") String carId,@Param("storeId") String storeId);


	@Update("update car set gas_amount=#{gasAmount} where car_id = #{carId}")
	boolean updateFieldGasAmount(@Param("carId") String carId,@Param("gasAmount") Double gasAmount);


	@Update("update car set rent_daily_price=#{rentDailyPrice} where car_id = #{carId}")
	boolean updateFieldRentDailyPrice(@Param("carId") String carId,@Param("rentDailyPrice") Double rentDailyPrice);


	@Select("select * from car where car_id = #{carId}")
	CarPO getCarPO(String carId);

	@Select({"<script>"
			+ "select * from car " +
			"where 1=1" +
			"<when test= 'carId != null'> and car_id=#{carId} </when>" +
			"<when test= 'carName != null'> and car_name=#{carName} </when>" +
			"<when test= 'carSku != null'> and car_sku=#{carSku} </when>" +
			"<when test= 'carStatus != null'> and car_status=#{carStatus} </when>" +
			"<when test= 'storeId != null'> and store_id=#{storeId} </when>" +
			"<when test= 'gasAmount != null'> and gas_amount=#{gasAmount} </when>" +
			"<when test= 'rentDailyPrice != null'> and rent_daily_price=#{rentDailyPrice} </when>" +
			"</script>"})
	List<CarPO> queryCarList(CarPO carPO);
}
