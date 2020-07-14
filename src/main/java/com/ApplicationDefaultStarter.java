/******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/
package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: ApplicationDefaultStarter.java
 * @Package com
 * @Description Default starter of this simple car rental system
 * @date 2020 07-14 2:55.
 */
@SpringBootApplication
public class ApplicationDefaultStarter {
    public static void main(String[] args) {
        SpringApplication.run(ApplicationDefaultStarter.class, args);
    }
}
