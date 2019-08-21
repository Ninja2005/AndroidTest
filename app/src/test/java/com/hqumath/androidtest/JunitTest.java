package com.hqumath.androidtest;

import com.hqumath.androidtest.utils.StringUtil;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

/**
 * ****************************************************************
 * 文件名称: JunitTest
 * 作    者: Created by gyd
 * 创建时间: 2019/8/15 14:42
 * 文件描述: JUnit4框架
 * 注意事项:
 * 版权声明:
 * ****************************************************************
 */
public class JunitTest {

    @Before
    public void setUp() throws Exception {
        System.out.println("测试开始");
    }

    @After
    public void tearDown() throws Exception {
        System.out.println("测试结束");
    }

    @Test
    public void getSizeString() {
        String msg = StringUtil.getSizeString(102400);
        assertEquals("100.00 KB", msg);

        assertThat("Checking that StringUtils.getSizeString", msg, is(equalTo("100.00 KB")));
    }

    @Test
    public void equals() {
        assertTrue(StringUtil.equals("test", "test"));
        //assertFalse(StringUtils.equals(null, "test"));

        assertThat("Checking that StringUtils.equals", StringUtil.equals("test", "test"), is(true));
    }
}