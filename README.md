# Ecommerce Selenium Automation Framework

## 📌 Project Overview

This is an end-to-end UI Automation Framework developed using Java, Selenium WebDriver, TestNG, and Maven following the Page Object Model (POM) design pattern.

The framework automates the Demoblaze E-commerce application and demonstrates industry-standard automation framework practices.

---

## 🚀 Tech Stack

- Java 21
- Selenium WebDriver
- TestNG
- Maven
- Page Object Model (POM)
- WebDriverManager / Selenium Manager
- Extent Reports
- Screenshot Utility
- Cross Browser Testing
- TestNG Listeners
- Git & GitHub

---

## 📂 Project Structure

```
src
├── main
│   ├── java
│   │   └── com.ecommerce.automation
│   │       ├── base
│   │       ├── driver
│   │       ├── pages
│   │       └── utils
│   └── resources
│       └── config.properties
│
└── test
    └── java
        └── com.ecommerce.automation.tests
            ├── LoginTest
            ├── SearchProductTest
            ├── AddToCartTest
            └── PlaceOrderTest
```

---

## ✅ Features

- Selenium WebDriver Automation
- Page Object Model (POM)
- TestNG Framework
- Explicit Waits
- Configurable Browser Selection
- Chrome Browser Support
- Edge Browser Support
- Screenshot Capture on Failure
- Extent HTML Reports
- TestNG Listeners
- Maven Project Structure

---

## 🧪 Test Scenarios

### Login Test

- Open Demoblaze Website
- Login with Valid Credentials
- Verify Successful Login

---

### Search Product Test

- Login
- Navigate to Phones
- Select Samsung Galaxy S6
- Verify Product Name

---

### Add To Cart Test

- Login
- Select Product
- Add Product to Cart
- Accept Alert

---

### Place Order Test

- Login
- Add Product to Cart
- Navigate to Cart
- Place Order Successfully

---

## ▶️ How to Run

1. Clone the repository

```
git clone <repository-url>
```

2. Open the project in Eclipse

3. Update Maven Project

4. Run

```
testng.xml
```

or execute

```
mvn clean test
```

---

## 📊 Reports

After execution

Extent Report:

```
reports/ExtentReport.html
```

Screenshots:

```
screenshots/
```

---

## 👨‍💻 Author

Santhosh

QA Automation Engineer

```
