package com.hqumath.androidtest;

import android.content.Context;
import androidx.test.InstrumentationRegistry;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.filters.SmallTest;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * ****************************************************************
 * 文件名称: ExampleInstrumentedTest
 * 作    者: Created by gyd
 * 创建时间: 2019/8/19 10:37
 * 文件描述: 仪器测试-basic
 * 注意事项:
 * 版权声明:
 * ****************************************************************
 */
@RunWith(AndroidJUnit4.class)
@SmallTest
public class ExampleInstrumentedTest {
    @Test
    public void useAppContext() {
        // Context of the app under test.
        Context appContext = ApplicationProvider.getApplicationContext();

        assertEquals("com.hqumath.androidtest", appContext.getPackageName());
        assertEquals("AndroidTest", appContext.getResources().getText(R.string.app_name));
    }
}
