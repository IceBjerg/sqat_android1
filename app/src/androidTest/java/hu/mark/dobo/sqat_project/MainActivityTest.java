package hu.mark.dobo.sqat_project;


import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

import androidx.test.espresso.ViewInteraction;
import androidx.test.filters.LargeTest;
import androidx.test.rule.ActivityTestRule;
import androidx.test.runner.AndroidJUnit4;

import org.hamcrest.Description;
import org.hamcrest.Matcher;
import org.hamcrest.TypeSafeMatcher;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.Espresso.pressBack;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.closeSoftKeyboard;
import static androidx.test.espresso.action.ViewActions.replaceText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withParent;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.hamcrest.Matchers.allOf;

@LargeTest
@RunWith(AndroidJUnit4.class)
public class MainActivityTest {

    @Rule
    public ActivityTestRule<MainActivity> mActivityTestRule = new ActivityTestRule<>(MainActivity.class);

    @Test
    public void mainActivityTest() {

        ViewInteraction editText = onView(withId(R.id.editText));

        editText.perform(click());

        ViewInteraction button1 = onView(withId(R.id.button1));

        button1.perform(click());

        ViewInteraction textView = onView((withId(R.id.textView)));
        textView.check(matches(withText("")));

        editText.perform(replaceText("y"), closeSoftKeyboard());

        button1.perform(click());
        textView.check(matches(withText("b")));

        editText.perform(replaceText("yb5loo"), closeSoftKeyboard());

        button1.perform(click());
        textView.check(matches(withText("b5looo")));

        ViewInteraction button2 = onView((withId(R.id.button2)));
        button2.perform(click());
        textView.check(matches(withText("602")));

        editText.check(matches(withText("yb5loo")));
    }
}
