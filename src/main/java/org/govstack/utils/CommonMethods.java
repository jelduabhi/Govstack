package org.govstack.utils;

import com.aventstack.extentreports.Status;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.govstack.WebDriver.WebDriverManager;
import org.govstack.framework.ExtentReporter;
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

    WebDriverWait driverWait=new WebDriverWait(getDriver(),Duration.ofSeconds(30));
    public static String captureScreen(){
        String path;
        File targetPath;
        try{
            File source=((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
            path= ExtentReporter.reportPath+"/"+source.getName();
            targetPath=new File(path);
            FileUtils.copyFile(source,targetPath);
            return source.getName();
        }catch (Exception e){
            return null;
        }
    }
    public void clickElement(WebElement ele){
        try{
            driverWait.until(ExpectedConditions.elementToBeClickable(ele));
            ele.click();
            ExtentReporter.log(Status.INFO,ele+" clicked");
        }catch (Exception e){
            ExtentReporter.logWithScreenshot(Status.FAIL,ele+" Unable to click element");
            Assert.fail();
        }
    }

    public void sendTextToElement(WebElement ele,String text){
        try{
            driverWait.until(ExpectedConditions.visibilityOf(ele));
            ele.sendKeys(text);
            ExtentReporter.log(Status.INFO,ele+" clicked");
        }catch (Exception e){
            ExtentReporter.logWithScreenshot(Status.FAIL,ele+" Unable to click element");
            Assert.fail();
        }
    }

    public String getCurrentDate(){
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
        return dateOnly.format(cal.getTime()).split("/")[1].toString();
    }

    public void selectDate(List<WebElement> ele, String date){
        for(WebElement element:ele){
            if(element.getText().equals(date)){
                element.click();
                break;
            }
        }
    }

    public String generateRandomString(){
        String generatedString = RandomStringUtils.randomAlphanumeric(5);
        return generatedString;
    }

}
