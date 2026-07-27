package com.ecommerce.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ecommerce.automation.utils.WaitUtils;

public class PlaceOrderPage {

    private WebDriver driver;

    private By placeOrderButton = By.xpath("//button[text()='Place Order']");
    private By name = By.id("name");
    private By country = By.id("country");
    private By city = By.id("city");
    private By card = By.id("card");
    private By month = By.id("month");
    private By year = By.id("year");
    private By purchaseButton = By.xpath("//button[text()='Purchase']");

    public PlaceOrderPage(WebDriver driver) {
        this.driver = driver;
    }

    public void placeOrder() {

        WaitUtils.waitForElementVisible(driver, placeOrderButton).click();

        WaitUtils.waitForElementVisible(driver, name).sendKeys("Santhosh");
        driver.findElement(country).sendKeys("India");
        driver.findElement(city).sendKeys("Hyderabad");
        driver.findElement(card).sendKeys("1234567890123456");
        driver.findElement(month).sendKeys("07");
        driver.findElement(year).sendKeys("2026");

        driver.findElement(purchaseButton).click();

        System.out.println("Order Placed Successfully");

    }

}