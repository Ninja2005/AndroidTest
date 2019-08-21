package com.hqumath.androidtest.ui;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;
import androidx.test.filters.LargeTest;

import com.hqumath.androidtest.R;

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

/**
 * ****************************************************************
 * 文件名称: LoginActivityTest
 * 作    者: Created by gyd
 * 创建时间: 2019/8/21 10:19
 * 文件描述: 仪器测试-ui
 * 注意事项:
 * 版权声明:
 * ****************************************************************
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class LoginActivityTest {

    private static final String STRING_TO_BE_TYPED = "Espresso";

    /**
     * Use {@link ActivityScenarioRule} to create and launch the activity under test, and close it
     * after test completes. This is a replacement for {@link androidx.test.rule.ActivityTestRule}.
     * 在每一个test之前自动地调用ActivityScenario.launch，在测试结束的时候调用ActivityScenario.close
     */
    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule
            = new ActivityScenarioRule<>(MainActivity.class);

//    @Before
//    public void launchActivity() {
//        activityScenario = ActivityScenario.launch(LoginActivity.class);
//    }

    @Test
    public void changeText() {
        // Type text and then press the button.
        onView(withId(R.id.user_name_et)).perform(typeText(STRING_TO_BE_TYPED),
                closeSoftKeyboard());

        onView(withId(R.id.btn_copy)).perform(click());

        // Check that the text was changed.
        onView(withId(R.id.password_et)).check(matches(withText(STRING_TO_BE_TYPED)));
    }
}