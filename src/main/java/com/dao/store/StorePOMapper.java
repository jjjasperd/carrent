package com.dao.store;
import com.domain.po.carmanagement.StorePO;
import org.apache.ibatis.annotations.*;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: StorePOMapper.java
 * @Package com.dao.store
 * @Description store query mapper
 * @date 2020 07-25 21:22.
 */
@Mapper
@CacheNamespace
public interface StorePOMapper {

	@Insert("insert into store(store_id,store_name) value (#{storeId},#{storeName})")
	@Options(useGeneratedKeys = true, keyProperty = "storeId")
	void addStorePO(StorePO store);


	@Delete("delete from store where store_id = #{storeId}")
	boolean deleteStorePOById(String storeId);

	@Update("update store set store_id=#{storeId},store_name=#{storeName} where store_id = #{storeId}")
	boolean updateStorePO(StorePO store);


	@Update("update store set store_name=#{storeName} where store_id = #{storeId}")
	boolean updateFieldStorePOName(@Param("storeId") String storeId,@Param("storeName") String storeName);


	@Select("select * from store where store_id = #{storeId}")
	StorePO getStorePO(String storeId);
}
