package org.govstack.pom.pages;

import org.govstack.framework.ConfigurationManager;
import org.govstack.pom.locators.LoginLocators;
import org.govstack.utils.CommonMethods;

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
        }catch (Exception e){

        }
    }

}

