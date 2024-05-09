package org.govstack.utils;

import com.relevantcodes.extentreports.LogStatus;
import org.apache.commons.io.FileUtils;
import org.govstack.WebDriver.WebDriverManager;
import org.govstack.framework.ExtentReport;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v85.page.Page;
import org.openqa.selenium.remote.Augmenter;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.File;

public class CommonMethods extends WebDriverManager {

    public CommonMethods(){
        PageFactory.initElements(getDriver(),this);
    }
    public static String captureScreen(){
        String path;
        File targetPath;
        try{
            WebDriver driver=new Augmenter().augment(getDriver());
            File source=((TakesScreenshot)getDriver()).getScreenshotAs(OutputType.FILE);
            path= ExtentReport.reportPath+"/"+source.getName();
            targetPath=new File(path);
            FileUtils.copyFile(source,targetPath);
            return source.getName();
        }catch (Exception e){
            return null;
        }
    }
    public void clickElement(WebElement ele){
        try{
            ele.click();
            ExtentReport.log(LogStatus.INFO,ele+" clicked");
        }catch (Exception e){
            ExtentReport.log(LogStatus.FAIL,ele+" Unable to click element");
            Assert.fail();
        }
    }
}
