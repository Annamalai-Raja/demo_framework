package framework.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public interface Configuration {

      Properties properties = new Properties();
      String PROPERTIES_FILE_PATH = "resources/config.properties";

    String URL = getProperty("url");

    String SELENIUM_HUB= getProperty("selenium-hub");
    String SELENIUM_PORT = getProperty("selenium-port");

     static String getProperty(String key) {
         FileInputStream input = null;
         try {
             input = new FileInputStream(PROPERTIES_FILE_PATH);
             properties.load(input);
         } catch (IOException e) {
             throw new RuntimeException(e);
         }

         return properties.getProperty(key);
    }

}
