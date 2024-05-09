package org.govstack;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;


@CucumberOptions(
        features = "FeatureFiles",
        glue = "org.example.stepdefinition",
        tags = "@MultipleWindows",
        plugin = {"pretty","html:target/CucumberReport/report.html"}
)
public class TestRunner extends AbstractTestNGCucumberTests {
    @DataProvider(parallel = true)
    public Object[][] scenarios(){
        return super.scenarios();
    }
}
