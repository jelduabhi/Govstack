package org.govstack.stepdefinition;

import com.aventstack.extentreports.Status;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.govstack.WebDriver.WebDriverManager;
import org.govstack.framework.ExtentReporter;
import org.govstack.pom.pages.ContentMainPage;
import org.govstack.pom.pages.LoginPage;

public class StepDefinitions {

    @Given("I launch and login to the Govstack application")
    public void i_launch_and_login_to_the_govstack_application() {
        LoginPage loginPage=new LoginPage();
        loginPage.loginToGovStack_BackEnd();
    }

    @When("I selects the news")
    public void i_selects_the_news() {
        ContentMainPage mainPage=new ContentMainPage();
        mainPage.SelectTheContent("News");
    }

    @When("I enter all the details")
    public void i_enter_all_the_details() {
        ExtentReporter.log(Status.INFO,"i_enter_all_the_details");
    }

    @Then("I should be able to publsh")
    public void i_should_be_able_to_publsh() {
        ExtentReporter.log(Status.INFO,"i_should_be_able_to_publsh");
    }
}
