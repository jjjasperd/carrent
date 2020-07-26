/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.dao.user;

import com.domain.po.userinfo.UserInfoPO;
import org.apache.ibatis.annotations.*;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: UserMapper.java
 * @Package com.dao.com.user
 * @Description com.user mapper
 * @date 2020 07-13 22:25.
 */
@Mapper
public interface UserMapper {
    @Insert("INSERT INTO carrental.user (user_id, user_name, user_password, user_age, user_gender, user_address, user_driver_license_id, customer_name, user_phone) VALUES (#{userId}, #{userName}, #{userPassword}, #{userAge}, #{userGender}, #{userAddress}, #{userDriverLicenseId}, #{customerName}, #{userPhone})")
    int insertUser(UserInfoPO userInfoPO);

    @Delete("DELETE FROM carrental.user where user_id = #{userId}")
    int deleteUSerById(String userId);

    @Select("select * from carrental.user where user_id = #{userId}")
    UserInfoPO getUserById(String userId);
}
