package tests;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AutomationName;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class DenemeTesti {
    AndroidDriver<MobileElement>driver;
    @Test
    public void test01() throws MalformedURLException {

        DesiredCapabilities capabilities =new DesiredCapabilities();
        //capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,"PIXEL 6");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,"Android");
        capabilities.setCapability(MobileCapabilityType.UDID,"emulator-5554");
       // capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,"10.0");
        // capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME,"UiAutomator2");
        capabilities.setCapability(MobileCapabilityType.APP,"C:\\Users\\hesoa\\IdeaProjects\\Appium_T-108\\Apps\\Google Calculator_8.4 (503542421)_apkcombo.com.apk");
        driver=new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"),capabilities);

        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);


        driver.findElement(By.id("com.google.android.calculator:id/digit_7")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_8")).click();

        driver.findElement(By.id("com.google.android.calculator:id/op_mul")).click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_2")).click();
        driver.findElement(By.id("com.google.android.calculator:id/eq")).click();
    }
}
