package utils;

public class PublicVariables {
    public static final String APP_PACKAGE = Config.getConfigProperty("appium.capability.appPackage");
    public static final String APP_ACTIVITY = Config.getConfigProperty("appium.capability.appActivity");
    public static final String DEVICE_NAME = Config.getConfigProperty("appium.capability.deviceName");
    public static final String PLATFORM_NAME = Config.getConfigProperty("appium.capability.platformName");
    public static final String PLATFORM_VERSION = Config.getConfigProperty("appium.capability.platformVersion");
    public static final String AUTOMATION_NAME = Config.getConfigProperty("appium.capability.automationName");
    public static final boolean NO_RESET = Boolean.parseBoolean(Config.getConfigProperty("appium.capability.noReset"));
    public static final boolean FULL_RESET = Boolean.parseBoolean(Config.getConfigProperty("appium.capability.fullReset"));
    public static final boolean UNICODE_KEYBOARD = Boolean.parseBoolean(Config.getConfigProperty("appium.capability.unicodeKeyboard"));
    public static final String URL = Config.getConfigProperty("appium.server.url");
    public static String FECHA_INICIO;
    public static String FECHA_FIN;
}
