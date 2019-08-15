package com.hqumath.androidtest.ui;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;

import static org.junit.Assert.assertNotNull;

/**
 * ****************************************************************
 * 文件名称: MainActivityTest
 * 作    者: Created by gyd
 * 创建时间: 2019/8/15 14:43
 * 文件描述:
 * 注意事项:
 * 版权声明:
 * ****************************************************************
 */
@RunWith(RobolectricTestRunner.class)
public class MainActivityTest {

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void check() {
        MainActivity activity = Robolectric.setupActivity(MainActivity.class);
        assertNotNull(activity);
    }
}