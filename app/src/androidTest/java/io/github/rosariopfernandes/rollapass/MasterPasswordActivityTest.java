package io.github.rosariopfernandes.rollapass;

import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.intent.Intents.intended;
import static android.support.test.espresso.intent.matcher.IntentMatchers.hasComponent;
import static android.support.test.espresso.matcher.ViewMatchers.withId;

@RunWith(AndroidJUnit4.class)
public class MasterPasswordActivityTest {
    @Rule
    public ActivityTestRule<MasterPasswordActivity> activityTestRule=
            new ActivityTestRule<>(MasterPasswordActivity.class);

    @Test
    public void clickButtonNext() {
        onView(withId(R.id.btnNext)).perform(click());
        intended(hasComponent(MainActivity.class.getName()));
    }
}
