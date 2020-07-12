/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package domain.dto.carmanagement;

import domain.po.carmanagement.CarPO;

import java.io.Serializable;
import java.util.List;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: StoreDTO.java
 * @Package domain.dto.carmanagement
 * @Description store dto
 * @date 2020 07-13 1:30.
 */
public class StoreDTO implements Serializable {

    private static final long serialVersionUID = 1547024795239771521L;

    /**
     * rent store id
     */
    private String storeId;

    /**
     * rent store name
     */
    private String storeName;

    /**
     * store car list
     */
    private List<CarPO> carPOList;

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getStoreName() {
        return storeName;
    }

    public void setStoreName(String storeName) {
        this.storeName = storeName;
    }

    public List<CarPO> getCarPOList() {
        return carPOList;
    }

    public void setCarPOList(List<CarPO> carPOList) {
        this.carPOList = carPOList;
    }
}
