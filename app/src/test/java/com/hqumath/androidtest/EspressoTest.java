package com.hqumath.androidtest;

import android.content.Context;

import androidx.lifecycle.Lifecycle;
import androidx.test.core.app.ActivityScenario;
import androidx.test.core.app.ApplicationProvider;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import com.hqumath.androidtest.ui.LoginActivity;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.assertNotNull;

/**
 * ****************************************************************
 * 文件名称: EspressoTest
 * 作    者: Created by gyd
 * 创建时间: 2019/8/15 15:48
 * 文件描述: Espresso框架
 * 注意事项:
 * 版权声明:
 * ****************************************************************
 */
@RunWith(AndroidJUnit4.class)
public class EspressoTest {

    private static final String STRING_TO_BE_TYPED = "Espresso";

    // Context of the app under test.
    private Context context = ApplicationProvider.getApplicationContext();

    /**
     * Use {@link ActivityScenarioRule} to create and launch the activity under test.
     * This is a replacement for {@link androidx.test.rule.ActivityTestRule}.
     * 在每一个test之前自动地调用ActivityScenario.launch，在测试结束的时候调用ActivityScenario.close
     * launchActivity并过渡到Resumed状态
     */
    @Rule
    public ActivityScenarioRule<LoginActivity> activityScenarioRule =
            new ActivityScenarioRule<>(LoginActivity.class);

    @Test
    public void getResources() {
        System.out.println(context.getResources().getText(R.string.app_name));
    }

    @Test
    public void changeText() {
        // Type text and then press the button.
        onView(withId(R.id.user_name_et))
                .perform(typeText(STRING_TO_BE_TYPED), closeSoftKeyboard());

        onView(withId(R.id.btn_copy)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.password_et)).check(matches(withText(STRING_TO_BE_TYPED)));
    }

    @Test
    public void moveStatus() {
        //移动生命周期
        ActivityScenario<LoginActivity> activityScenario = activityScenarioRule.getScenario();
        activityScenario.moveToState(Lifecycle.State.CREATED);
        activityScenario.onActivity(new ActivityScenario.ActivityAction<LoginActivity>() {

            @Override
            public void perform(LoginActivity activity) {
                assertNotNull(activity.btnLogin);
            }
        });
    }
}