/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com.services.carmanagement;

import com.api.carmanagement.CarRentalApi;
import com.common.businessexception.CommonErrorCode;
import com.common.result.Result;
import com.common.utils.Constant;
import com.common.utils.DataConvertUtils;
import com.common.utils.ResultUtils;
import com.common.utils.UuidUtils;
import com.dao.carmanagement.CarPOMapper;
import com.domain.dto.carmanagement.CarDTO;
import com.domain.po.carmanagement.CarPO;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: CarRentalService.java
 * @Package com.services.com.carmanagement
 * @Description rent car service
 * @date 2020 07-13 1:43.
 */
@Service
public class CarRentalService implements CarRentalApi {
    @Resource
    private CarPOMapper carPOMapper;
    @Resource
    private InventoryService inventoryService;

    @Override
    public Result addCar(CarDTO carDTO) {
        //TODO validate add data
        carDTO.setCarId(UuidUtils.getCarUuid());
        CarPO carPO = DataConvertUtils.carDTO2PO(carDTO);
        carPOMapper.addCarPO(carPO);
        return ResultUtils.success();
    }

    @Override
    @Transactional
    public Result rentCar(CarDTO carDTO) {
        //TODO validate carinfo
        //TODO need use distribute lock to make sure there is no multiple operation.
        try {
            carPOMapper.updateFieldCarPOStatus(carDTO.getCarId(), Constant.CAR_STATUS_BEING_RENTED);
            inventoryService.takeAcar(carDTO);
            return ResultUtils.success();
        }catch (Exception e){
            return ResultUtils.fail(CommonErrorCode.SYSTEM_ERROR.getErrCode(),CommonErrorCode.SYSTEM_ERROR.getErrMsg());
        }

    }

    @Override
    @Transactional
    public Result returnCar(CarDTO carDTO) {
        //TODO validate carinfo

        //TODO need use distribute lock to make sure there is no multiple operation.

        try {
            carPOMapper.updateFieldCarPOStatus(carDTO.getCarId(), Constant.CAR_STATUS_INSPECTING);
            inventoryService.returnAcar(carDTO);
            return ResultUtils.success();
        }catch (Exception e){
            return ResultUtils.fail(CommonErrorCode.SYSTEM_ERROR.getErrCode(),CommonErrorCode.SYSTEM_ERROR.getErrMsg());
        }
    }

    /**
     * get car info list by condition
     *
     * @param carDTO carDTO
     * @return res
     */
    @Override
    public List<CarDTO> queryCarList(CarDTO carDTO) {
        CarPO queryCarPO = DataConvertUtils.carDTO2PO(carDTO);
        List<CarPO> carPOList= carPOMapper.queryCarList(queryCarPO);
        List<CarDTO> carDTOList = new ArrayList<>();
        for (CarPO carPO : carPOList) {
            CarDTO resultCarDTO = DataConvertUtils.carPO2DTO(carPO);
            carDTOList.add(resultCarDTO);
        }
        return carDTOList;
    }
}
