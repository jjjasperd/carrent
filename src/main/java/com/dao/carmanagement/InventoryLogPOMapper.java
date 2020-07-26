package com.dao.carmanagement;
import com.domain.po.carmanagement.InventoryLogPO;
import org.apache.ibatis.annotations.*;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: InventoryLogPOMapper.java
 * @Package com.dao.carmanagement
 * @Description inventory log query mapper
 * @date 2020 07-25 21:22.
 */
@Mapper
@CacheNamespace
public interface InventoryLogPOMapper {

	@Insert("insert into inventory_log(log_id,log_type,car_id,store_id,remark) value (#{logId},#{logType},#{carId},#{storeId},#{remark})")
	@Options(useGeneratedKeys = true, keyProperty = "logId")
	void addInventoryLogPO(InventoryLogPO inventoryLog);


	@Delete("delete from inventory_log where log_id = #{logId}")
	boolean deleteInventoryLogPOById(Integer logId);


	@Select("select * from inventory_log where store_id = #{storeId}")
	InventoryLogPO getInventoryLogPO(Integer logId);
}
