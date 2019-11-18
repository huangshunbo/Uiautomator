package com.youzan.mobile.uiautomator;

import android.content.Context;

import androidx.test.InstrumentationRegistry;
import androidx.test.runner.AndroidJUnit4;
import androidx.test.uiautomator.By;
import androidx.test.uiautomator.UiDevice;
import androidx.test.uiautomator.UiObject2;

import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;
import java.util.List;


/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Test
    public void clickTest() {
        UiDevice mDevice = UiDevice.getInstance(InstrumentationRegistry.getInstrumentation());
        try {
            mDevice.executeShellCommand("adb shell am start -n com.youzan.mobile.uiautomator/com.youzan.mobile.uiautomator.MainActivity");
            mDevice.wait(5000);
            List<UiObject2> clickList = mDevice.findObjects(By.clickable(true));
            for(int i=0;i<clickList.size();i++){
                clickList.get(i).click();
                mDevice.wait(1000);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
