package org.govstack.pom.pages;

import com.aventstack.extentreports.Status;
import org.govstack.framework.ConfigurationManager;
import org.govstack.framework.ExtentReporter;
import org.govstack.framework.TestData;
import org.govstack.pom.locators.LoginLocators;
import org.govstack.utils.CommonMethods;
import org.testng.Assert;

import java.time.Duration;

import static org.govstack.WebDriver.WebDriverManager.getDriver;

public class LoginPage {

    LoginLocators locators=new LoginLocators();
    CommonMethods methods=new CommonMethods();

    public void loginToGovStack_BackEnd(){
        try {
            getDriver().get(ConfigurationManager.getPropertyValue("GOVSTACK_CMS_QA"));
            getDriver().manage().window().maximize();
            getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            methods.clickElement(locators.signinWithB2Cbtn);
            methods.sendTextToElement(locators.userNameTxt, ConfigurationManager.getPropertyValue("CMS_QA_USERNAME"));
            methods.clickElement(locators.nextBtn);
            methods.sendTextToElement(locators.passwordTxt,ConfigurationManager.getPropertyValue("CMS_QA_PASSWORD"));
            methods.clickElement(locators.signInBtn);
            ExtentReporter.logWithScreenshot(Status.PASS,"Launched application");
            methods.waitForElement(15);
        }catch (Exception e){
            ExtentReporter.log(Status.FAIL,"Unable to login to the application");
            Assert.fail();
        }
    }

}

