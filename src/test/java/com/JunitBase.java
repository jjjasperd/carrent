package com; /******************************************************************************
 * Copyright (C) 2020 - 2020 ShenZhen Jjasperd
 * All Rights Reserved.
 *****************************************************************************/

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @author Yujia Duan
 * @version V1.0
 * @Title: com.JunitBase.java
 * @Package PACKAGE_NAME
 * @Description
 * @date 2020 07-14 1:27.
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = ApplicationDefaultStarter.class)
public class JunitBase {
    private static final Logger LOGGER = LoggerFactory.getLogger(JunitBase.class);

    @Before
    public void before() {
        LOGGER.debug("----------------------------Start Test---" + this.getClass() + "----------------------------------");
    }

    @After
    public void after() {
        LOGGER.debug("----------------------------End Test---" + this.getClass() + "----------------------------------");
    }
}
