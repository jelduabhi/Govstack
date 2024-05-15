package org.govstack.listners;

import com.aventstack.extentreports.Status;
import io.cucumber.java.Scenario;
import org.govstack.WebDriver.WebDriverManager;
import org.govstack.framework.ExtentReporter;
import org.govstack.stepdefinition.Hooks;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestNGListners implements ITestListener {

    public void onTestStart(ITestResult result) {
        WebDriverManager.initDriver();
        ExtentReporter.initTest("Test");
    }

    public void onTestSuccess(ITestResult result) {
        ExtentReporter.logWithScreenshot(Status.PASS,"");
        WebDriverManager.closeDriver();
    }

    public void onTestFailure(ITestResult result) {
        WebDriverManager.closeDriver();
    }

    public void onTestSkipped(ITestResult result) {
        WebDriverManager.closeDriver();
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        ExtentReporter.endReport();
        WebDriverManager.closeDriver();
    }

    public void onTestFailedWithTimeout(ITestResult result) {
        this.onTestFailure(result);
    }

    public void onStart(ITestContext context) {
        ExtentReporter.initReport(context.getName());
    }

    public void onFinish(ITestContext context) {
        ExtentReporter.endReport();
    }
}
