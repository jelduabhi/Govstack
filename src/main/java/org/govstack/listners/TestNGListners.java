package org.govstack.listners;

import org.govstack.WebDriver.WebDriverManager;
import org.govstack.framework.ExtentReport;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListners implements ITestListener {

    public void onTestStart(ITestResult result) {
        WebDriverManager.initDriver();
        ExtentReport.initReport(result.getName());
        ExtentReport.initTest(result.getTestName(),"Test Results");
    }

    public void onTestSuccess(ITestResult result) {
        WebDriverManager.closeDriver();
        ExtentReport.endReport(result.getTestName());
    }

    public void onTestFailure(ITestResult result) {
        WebDriverManager.closeDriver();
        ExtentReport.endReport(result.getTestName());
    }

    public void onTestSkipped(ITestResult result) {
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
    }

    public void onFinish(ITestContext context) {
    }
}
