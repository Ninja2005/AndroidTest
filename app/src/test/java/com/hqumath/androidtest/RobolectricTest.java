package com.hqumath.androidtest;

import android.content.Intent;

import com.hqumath.androidtest.R;
import com.hqumath.androidtest.ui.LoginActivity;
import com.hqumath.androidtest.ui.MainActivity;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.robolectric.Robolectric;
import org.robolectric.RobolectricTestRunner;
import org.robolectric.RuntimeEnvironment;
import org.robolectric.android.controller.ActivityController;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.robolectric.Shadows.shadowOf;

/**
 * ****************************************************************
 * 文件名称: EspressoTest
 * 作    者: Created by gyd
 * 创建时间: 2019/8/15 15:48
 * 文件描述: Robolectric框架
 * 注意事项:
 * 版权声明:
 * ****************************************************************
 */
@RunWith(RobolectricTestRunner.class)
public class RobolectricTest {

    private static final String STRING_TO_BE_TYPED = "Robolectric";

    @Test
    public void changeText() {
        //修改文字
        LoginActivity activity = Robolectric.setupActivity(LoginActivity.class);
        activity.userName.setText(STRING_TO_BE_TYPED);
        activity.btnCopy.performClick();
        assertEquals(STRING_TO_BE_TYPED, activity.passwrod.getText().toString());
        //跳转界面
        activity.findViewById(R.id.btn_login).performClick();
        Intent expectedIntent = new Intent(activity, MainActivity.class);
        Intent actual = shadowOf(RuntimeEnvironment.application).getNextStartedActivity();
        assertEquals(expectedIntent.getComponent(), actual.getComponent());
    }

    @Test
    public void moveStatus() {
        //移动生命周期
        ActivityController<LoginActivity> controller =
                Robolectric.buildActivity(LoginActivity.class).setup();
        controller.pause();
        assertNotNull(controller.get().btnLogin);
    }
}