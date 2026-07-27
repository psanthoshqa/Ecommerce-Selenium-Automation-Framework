package com.ecommerce.automation.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties;

    public ConfigReader() {

        properties = new Properties();

        try {

            FileInputStream file =
                    new FileInputStream("C:\\Users\\user\\eclipse-workspace\\ecommerce-automation-framework\\src\\test\\resources\\config.properties");

            properties.load(file);

        } catch (IOException e) {

            e.printStackTrace();

        }
    }

    public static String getProperty(String key) {

        return properties.getProperty(key);

    }

}