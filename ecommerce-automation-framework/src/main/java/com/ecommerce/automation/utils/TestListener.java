package com.ecommerce.automation.utils;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

public class TestListener implements ITestListener {

    private static ExtentReports extent = ExtentManager.getInstance();
    private static ThreadLocal<ExtentTest> test = new ThreadLocal<>();

    @Override
    public void onStart(ITestContext context) {

        System.out.println("Execution Started");

    }

    @Override
    public void onTestStart(ITestResult result) {

        ExtentTest extentTest = extent.createTest(result.getMethod().getMethodName());

        test.set(extentTest);

        System.out.println("STARTED : " + result.getName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {

        test.get().pass("Test Passed");

        System.out.println("PASSED : " + result.getName());

    }

    @Override
    public void onTestFailure(ITestResult result) {

        test.get().fail(result.getThrowable());

        System.out.println("FAILED : " + result.getName());

    }

    @Override
    public void onTestSkipped(ITestResult result) {

        test.get().skip("Test Skipped");

    }

    @Override
    public void onFinish(ITestContext context) {

        extent.flush();

        System.out.println("Execution Finished");

    }

}