package com.ecommerce.automation.pages;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.ecommerce.automation.utils.WaitUtils;

public class ProductPage {

    private WebDriver driver;

    private By productName = By.cssSelector(".name");
    private By productPrice = By.cssSelector(".price-container");
    private By addToCartButton = By.linkText("Add to cart");

    public ProductPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProductName() {

        return WaitUtils.waitForElementVisible(driver, productName).getText();

    }

    public String getProductPrice() {

        return WaitUtils.waitForElementVisible(driver, productPrice).getText();

    }

    public void clickAddToCart() {

        WaitUtils.waitForElementVisible(driver, addToCartButton).click();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {

            Alert alert = wait.until(ExpectedConditions.alertIsPresent());

            alert.accept();

            System.out.println("Product Added Successfully");

        } catch (NoAlertPresentException e) {

            System.out.println("No Alert Present");

        }

    }

}