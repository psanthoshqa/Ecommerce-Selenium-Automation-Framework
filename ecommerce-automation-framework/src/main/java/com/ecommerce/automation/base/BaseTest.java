package com.ecommerce.automation.base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.ecommerce.automation.driver.DriverFactory;
import com.ecommerce.automation.utils.ConfigReader;

public class BaseTest {

    protected WebDriver driver;

    @BeforeMethod
    public void setUp() {

        new ConfigReader();

        driver = DriverFactory.getDriver();

        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get(ConfigReader.getProperty("url"));

    }

    @AfterMethod
    public void tearDown() {

        if (driver != null) {

            driver.quit();

        }

    }

}