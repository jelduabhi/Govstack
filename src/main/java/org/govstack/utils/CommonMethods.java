package org.govstack.utils;

import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.govstack.WebDriver.WebDriverManager;
import org.govstack.framework.ExtentReporter;
import org.govstack.framework.TestData;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.io.File;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.List;

public class CommonMethods extends WebDriverManager {

    WebDriverWait driverWait = new WebDriverWait(getDriver(), Duration.ofSeconds(30));

    public static String captureScreen() {
        String path;
        File targetPath;
        try {
            File source = ((TakesScreenshot) getDriver()).getScreenshotAs(OutputType.FILE);
            path = ExtentReporter.reportPath + "/" + source.getName();
            targetPath = new File(path);
            FileUtils.copyFile(source, targetPath);
            return source.getName();
        } catch (Exception e) {
            return null;
        }
    }

    public void clickElement(WebElement ele) {
        try {
            driverWait.until(ExpectedConditions.elementToBeClickable(ele));
            highlightElement(ele);
            ele.click();
            ExtentReporter.log(Status.INFO, ele + " clicked");
        } catch (Exception e) {
            ExtentReporter.logWithScreenshot(Status.FAIL, ele + " Unable to click element "+e.getMessage());
            Assert.fail();
        }
    }

    public void sendTextToElement(WebElement ele, String text) {
        try {
            driverWait.until(ExpectedConditions.visibilityOf(ele));
            highlightElement(ele);
            ele.sendKeys(text);
            ExtentReporter.log(Status.INFO, ele + " clicked");
        } catch (Exception e) {
            ExtentReporter.logWithScreenshot(Status.FAIL, ele + " Unable to click element "+e.getMessage());
            Assert.fail();
        }
    }

    public String getCurrentDate() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
        return dateOnly.format(cal.getTime()).split("/")[1].toString();
    }


    public String generateRandomString() {
        return RandomStringUtils.randomAlphanumeric(5);
    }

    public void selectOptionFromList(List<WebElement> element, String value) {
        try {
            for (WebElement ele : element) {
                if (ele.getText().equals(value)) {
                  //  highlightElement(ele);
                    clickElement(ele);
                    ExtentReporter.log(Status.INFO, value + " Selected");
                    break;
                }
            }
            waitForElement(2);
        } catch (Exception e) {
            ExtentReporter.log(Status.FAIL, "Unable to select " + value + " " + e.getMessage());
            ExtentReporter.logWithScreenshot(Status.FAIL, "Unable to select " + value + " " + e.getMessage());
            Assert.fail();
        }
    }

    public void waitForElement(int sec){
        try {
            Thread.sleep(sec * 1000L);
        }catch (Exception e){
            ExtentReporter.log(Status.INFO,"");
        }
    }

    public static void highlightElement(WebElement ele){
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].style.border='3px solid red'", ele);
    }

    public void scrollToElement(WebElement ele){
        waitForElement(1);
        ((JavascriptExecutor)getDriver()).executeScript("arguments[0].scrollIntoView({block:'center',inline: 'nearest'});", ele);
    }
}