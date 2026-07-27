package com.ecommerce.automation.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.ecommerce.automation.utils.WaitUtils;

public class LoginPage {

    private WebDriver driver;

    private By loginLink = By.id("login2");
    private By usernameTextBox = By.id("loginusername");
    private By passwordTextBox = By.id("loginpassword");
    private By loginButton = By.xpath("//button[text()='Log in']");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickLoginLink() {

        WaitUtils.waitForElementVisible(driver, loginLink).click();

    }

    public void enterUsername(String username) {

        WaitUtils.waitForElementVisible(driver, usernameTextBox).clear();
        WaitUtils.waitForElementVisible(driver, usernameTextBox).sendKeys(username);

    }

    public void enterPassword(String password) {

        WaitUtils.waitForElementVisible(driver, passwordTextBox).clear();
        WaitUtils.waitForElementVisible(driver, passwordTextBox).sendKeys(password);

    }

    public void clickLoginButton() {

        WaitUtils.waitForElementVisible(driver, loginButton).click();

    }

    public void login(String username, String password) {

        clickLoginLink();
        enterUsername(username);
        enterPassword(password);
        clickLoginButton();

        System.out.println("Login Successful");
    }
}