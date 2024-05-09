package org.govstack.WebDriver;


import org.govstack.framework.ConfigurationManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WebDriverManager extends WebDriverCapabilities{

    static ThreadLocal<WebDriver> driver;


    public static void initDriver(){
        driver.set(new ChromeDriver(setDriverCapabilities()));
        driver.get().manage().deleteAllCookies();
    }

    public static void closeDriver(){
        driver.get().close();
    }

    public static WebDriver getDriver(){
        return driver.get();
    }
}
