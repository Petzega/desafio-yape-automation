package utils;

import io.appium.java_client.Setting;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.URL;

public class DriverFactory {

    public static AndroidDriver driver;

    public static void startDriver() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("platformName", PublicVariables.PLATFORM_NAME);
        capabilities.setCapability("platformVersion", PublicVariables.PLATFORM_VERSION);
        capabilities.setCapability("deviceName", PublicVariables.DEVICE_NAME);
        capabilities.setCapability("appPackage", PublicVariables.APP_PACKAGE);
        capabilities.setCapability("appActivity", PublicVariables.APP_ACTIVITY);
        capabilities.setCapability("noReset", PublicVariables.NO_RESET);
        capabilities.setCapability("fullReset", PublicVariables.FULL_RESET);
        try {
            driver = new AndroidDriver(new URL(PublicVariables.URL), capabilities);
            driver.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, 500);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
