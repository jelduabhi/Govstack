package org.govstack.WebDriver;

import org.govstack.framework.ConfigurationManager;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.Objects;

public class WebDriverCapabilities {

    public static ChromeOptions setDriverCapabilities(){
        ChromeOptions options=new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        if(Objects.requireNonNull(ConfigurationManager.getPropertyValue("HEADLESS_MODE")).equalsIgnoreCase("true")){
            options.addArguments("--headless=new");
        }
        return options;
    }
}
