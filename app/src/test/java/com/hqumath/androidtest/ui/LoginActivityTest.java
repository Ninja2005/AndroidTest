package com.hqumath.androidtest.ui;

import android.content.Context;
import androidx.test.core.app.ApplicationProvider;
import org.junit.Test;

/**
 * ****************************************************************
 * 文件名称: LoginActivityTest
 * 作    者: Created by gyd
 * 创建时间: 2019/8/15 15:48
 * 文件描述: Robolectric框架
 * 注意事项:
 * 版权声明:
 * ****************************************************************
 */
//@RunWith(AndroidJUnit4.class)
public class LoginActivityTest {

//    private Context context = ApplicationProvider.getApplicationContext();

    @Test
    public void checkLogin(){
        //旧版本
        /*LoginActivity activity = Robolectric.setupActivity(LoginActivity.class);
        activity.findViewById(R.id.btn_login).performClick();

        Intent expectedIntent = new Intent(activity, MainActivity.class);
        Intent actual = shadowOf(RuntimeEnvironment.application).getNextStartedActivity();
        assertEquals(expectedIntent.getComponent(), actual.getComponent());*/

        //模仿官方库
        /*ActivityController<LoginActivity> controller = Robolectric.buildActivity(LoginActivity.class).setup();
        assertNotNull(controller.get().btnLogin);
        System.out.println(controller.get().state);

        controller.pause();
        System.out.println(controller.get().state);
        controller.stop();
        System.out.println(controller.get().state);*/

        //官方scenario
        /*ActivityScenario<LoginActivity> scenario = ActivityScenario.launch(LoginActivity.class);
        scenario.moveToState(Lifecycle.State.CREATED);
        scenario.onActivity(new ActivityScenario.ActivityAction<LoginActivity>() {
            @Override
            public void perform(LoginActivity activity) {
                System.out.println(activity.state);
            }
        });*/

    }
}