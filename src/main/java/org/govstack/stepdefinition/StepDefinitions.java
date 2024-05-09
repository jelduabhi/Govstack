package org.govstack.stepdefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.govstack.WebDriver.WebDriverManager;

public class StepDefinitions {

    @Given("I launch and login to the Govstack application")
    public void i_launch_and_login_to_the_govstack_application() {
        WebDriverManager.initDriver();
    }

    @When("I selects the news")
    public void i_selects_the_news() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @When("I enter all the details")
    public void i_enter_all_the_details() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

    @Then("I should be able to publsh")
    public void i_should_be_able_to_publsh() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
