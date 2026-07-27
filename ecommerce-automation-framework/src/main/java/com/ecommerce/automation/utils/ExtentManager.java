package com.ecommerce.automation.utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;

    public static ExtentReports getInstance() {

        if (extent == null) {

            ExtentSparkReporter spark =
                    new ExtentSparkReporter("reports/ExtentReport.html");

            spark.config().setReportName("Ecommerce Automation Report");
            spark.config().setDocumentTitle("Automation Execution Report");

            extent = new ExtentReports();

            extent.attachReporter(spark);

            extent.setSystemInfo("Project", "Demoblaze Automation");
            extent.setSystemInfo("Framework", "Selenium + TestNG");
            extent.setSystemInfo("Tester", "Santhosh");
        }

        return extent;
    }
}