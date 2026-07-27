package com.ecommerce.automation.tests;

import org.testng.annotations.Test;

import com.ecommerce.automation.base.BaseTest;
import com.ecommerce.automation.pages.CartPage;
import com.ecommerce.automation.pages.HomePage;
import com.ecommerce.automation.pages.LoginPage;
import com.ecommerce.automation.pages.PlaceOrderPage;
import com.ecommerce.automation.pages.ProductPage;
import com.ecommerce.automation.utils.ConfigReader;

public class PlaceOrderTest extends BaseTest {

    @Test
    public void placeOrder() {

        LoginPage loginPage = new LoginPage(driver);

        loginPage.login(
                ConfigReader.getProperty("username"),
                ConfigReader.getProperty("password"));

        HomePage homePage = new HomePage(driver);

        homePage.clickPhones();

        homePage.selectProduct("Samsung galaxy s6");

        ProductPage productPage = new ProductPage(driver);

        productPage.clickAddToCart();

        CartPage cartPage = new CartPage(driver);

        cartPage.openCart();

        PlaceOrderPage placeOrderPage = new PlaceOrderPage(driver);

        placeOrderPage.placeOrder();

        System.out.println("Order Placed Successfully");
    }
}