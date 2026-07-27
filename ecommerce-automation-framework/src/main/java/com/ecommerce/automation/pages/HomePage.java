package com.ecommerce.automation.pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage {

    private WebDriver driver;
    private WebDriverWait wait;

    private By phonesCategory = By.linkText("Phones");
    private By laptopsCategory = By.linkText("Laptops");
    private By monitorsCategory = By.linkText("Monitors");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickPhones() {

        for (int i = 0; i < 3; i++) {

            try {

                wait.until(ExpectedConditions.refreshed(
                        ExpectedConditions.elementToBeClickable(phonesCategory)))
                        .click();

                return;

            } catch (StaleElementReferenceException e) {

                System.out.println("Retrying click on Phones...");

            }
        }
    }

    public void clickLaptops() {

        wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(laptopsCategory)))
                .click();

    }

    public void clickMonitors() {

        wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(monitorsCategory)))
                .click();

    }

    public void selectProduct(String productName) {

        By product = By.linkText(productName);

        wait.until(ExpectedConditions.refreshed(
                ExpectedConditions.elementToBeClickable(product)))
                .click();

    }

}