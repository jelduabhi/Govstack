package org.govstack.pom.locators;

import org.openqa.selenium.support.PageFactory;

import static org.govstack.WebDriver.WebDriverManager.getDriver;

public class InitElements {

    public InitElements(){
        PageFactory.initElements(getDriver(),this);
    }
}
