package org.govstack.stepdefinition;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.govstack.WebDriver.WebDriverManager;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    public static Scenario scenario;
    @Before
    public void setup(Scenario scenario){
        Hooks.scenario =scenario;
        WebDriverManager.initDriver();
    }

    @After
    public static void tearDown(Scenario scenario){
        final byte[] screenshot=((TakesScreenshot)WebDriverManager.getDriver()).getScreenshotAs(OutputType.BYTES);
        scenario.attach(screenshot,"image/png",scenario.getName());
        WebDriverManager.closeDriver();
    }
}
