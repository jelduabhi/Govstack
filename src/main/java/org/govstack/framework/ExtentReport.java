package org.govstack.framework;


import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;
import org.govstack.utils.CommonMethods;
import org.testng.Assert;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;


public class ExtentReport extends CommonMethods {

    private static ExtentReports extentD;
    private static ExtentReports extentDwss;
    public static ExtentTest testParent;
    public static ExtentTest testParentWss;
    public static String reportPath;
    public static ThreadLocal<ExtentTest> test = new ThreadLocal<>();
    public static ThreadLocal<ExtentTest> testwss = new ThreadLocal<>();
    public static ThreadLocal<Boolean> isPassed = new ThreadLocal<>();
    public static int passCountD = 0;
    public static int failCountD = 0;

    public static Map<String, ExtentReport> classReportMap = new HashMap<String, ExtentReport>();


    public static void initReport(String suiteName) {
        String path = System.getProperty("user.dir") + "\\Reports\\";
        String fileName = new SimpleDateFormat("yyyyMMddhhmm").format(new Date());
        new File(path + "Report_" + fileName).mkdirs();
        reportPath = path + "Report_" + fileName;
        System.setProperty("Report_Path", reportPath);
        extentD = new ExtentReports(reportPath + "/testResults.htm", true);
        extentDwss = new ExtentReports(reportPath + "/testResultsWithScreenshots.htm", true);
    }


    public ExtentReport(String testName, String description, String suiteName) {
        initParent(testName, description, suiteName);
    }


    public ExtentReport(String testName, String suiteName) {
        initParent(testName, suiteName);
    }


    public static void logWithScreenshot(LogStatus logStatus, String stepName) {
        test.get().log(logStatus, stepName);
        String path = "";
        String screenPass = ConfigurationManager.getPropertyValue("screenPass");
        String screenFail = ConfigurationManager.getPropertyValue("screenFail");
        String screenWarn = ConfigurationManager.getPropertyValue("screenWarn");

        switch (logStatus) {
            case PASS:
                assert screenPass != null;
                if (screenPass.equals("true")) {
                    path = CommonMethods.captureScreen();
                    testwss.get().log(logStatus, stepName + testwss.get().addScreenCapture(path));
                } else
                    testwss.get().log(logStatus, stepName);
                break;
            case FAIL:
                assert screenFail != null;
                if (screenFail.equals("true")) {
                    path = CommonMethods.captureScreen();
                    testwss.get().log(logStatus, stepName + testwss.get().addScreenCapture(path));
                } else
                    testwss.get().log(logStatus, stepName);
                isPassed.set(false);
                break;
            case INFO:
            case SKIP:
                testwss.get().log(logStatus, stepName);
                break;
            case WARNING:
                assert screenWarn != null;
                if (screenWarn.equals("true")) {
                    path = CommonMethods.captureScreen();
                    testwss.get().log(logStatus, stepName + testwss.get().addScreenCapture(path));
                } else
                    testwss.get().log(logStatus, stepName);
                break;
            case ERROR:
                assert screenFail != null;
                if (screenFail.equals("true")) {
                    path = CommonMethods.captureScreen();
                    testwss.get().log(LogStatus.FAIL, stepName + testwss.get().addScreenCapture(path));
                } else
                    testwss.get().log(LogStatus.FAIL, stepName);
                isPassed.set(false);
                Assert.fail();
                break;
            case UNKNOWN:
                isPassed.set(false);
                logStatus = LogStatus.FAIL;
                assert screenWarn != null;
                if (screenWarn.equals("true")) {
                    path = CommonMethods.captureScreen();
                    testwss.get().log(logStatus, stepName + testwss.get().addScreenCapture(path));
                } else {
                    testwss.get().log(logStatus, stepName + " ");
                }
                Assert.fail();
                break;
            case FATAL:
                isPassed.set(false);
                testwss.get().log(logStatus, stepName);
                Assert.fail();
                break;
            default:
                break;
        }
    }


    public static void log(LogStatus logStatus, String stepName) {
        test.get().log(logStatus, stepName);
        switch (logStatus) {
            case PASS:
            case WARNING:
            case INFO:
                testwss.get().log(logStatus, stepName);
                break;
            case FAIL:
                testwss.get().log(logStatus, stepName);
                isPassed.set(false);
                break;
            case ERROR:
                testwss.get().log(LogStatus.FAIL, stepName);
                isPassed.set(false);
                Assert.fail();
                break;
            default:
                System.out.println("");
        }
    }


    public void initParent(String testName, String description, String suiteName) {
        testParent = extentD.startTest(testName, description);
        testParentWss = extentDwss.startTest(testName, description);
    }


    public void initParent(String testName, String suiteName) {
        testParent = extentD.startTest(testName);
        testParentWss = extentDwss.startTest(testName);
    }


    public static void initTest(String testName, String desc) {
        isPassed.set(true);
        test.set(getextent().startTest(testName, desc));
        testwss.set(getextentwss().startTest(testName, desc));
    }


    public static void assignCatogory(String Catogory) {
        test.get().assignCategory(Catogory);
        testwss.get().assignCategory(Catogory);
    }


    public void endParent(String suiteName) {
        extentD.endTest(testParent);
        extentDwss.endTest(testParentWss);
    }


    public static void endReport(String suiteName) {
        extentD.endTest(testParent);
        extentDwss.endTest(testParentWss);
        extentD.flush();
        extentDwss.flush();
    }


    private static ExtentReports getextent() {
        return extentD;
    }


    private static ExtentReports getextentwss() {
        return extentDwss;
    }


    public void appendParent() {
        testParent.appendChild(test.get());
        testParentWss.appendChild(testwss.get());
        if (isPassed.get()) {
            passCountD = passCountD + 1;
        } else {
            failCountD = failCountD + 1;
        }
        test.remove();
        testwss.remove();
        isPassed.remove();
    }
}

