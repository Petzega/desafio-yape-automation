package utils;

import java.io.IOException;
import java.util.Properties;

public class Config {

    public static String getConfigProperty(String property) {
        Properties properties = new Properties();
        try {
            properties.load(Config.class.getResourceAsStream("/Config.properties"));
        } catch (IOException e) {
            e.getCause();
        }
        return properties.getProperty(property);
    }
}
