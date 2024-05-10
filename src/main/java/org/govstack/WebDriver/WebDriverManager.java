package org.govstack.WebDriver;


import org.govstack.framework.ConfigurationManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverManager extends WebDriverCapabilities{

    static WebDriver driver;


    public static void initDriver(){
        driver =new ChromeDriver(setDriverCapabilities());
    }

    public static void closeDriver(){
        driver.close();
    }

    public static WebDriver getDriver(){
        return driver;
    }
}
