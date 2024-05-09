package org.govstack.pom.locators;

import org.govstack.utils.CommonMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginLocators extends CommonMethods {

    @FindBy(id="Umbraco.BackOffice.OpenIdConnect")
    public WebElement signinWithB2Cbtn;



}
