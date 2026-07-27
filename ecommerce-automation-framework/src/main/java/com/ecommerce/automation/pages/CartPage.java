package com.ecommerce.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ecommerce.automation.utils.WaitUtils;

public class CartPage {

    private WebDriver driver;

    private By cartLink = By.id("cartur");

    public CartPage(WebDriver driver) {
        this.driver = driver;
    }

    public void openCart() {

        WaitUtils.waitForElementVisible(driver, cartLink).click();

    }

}