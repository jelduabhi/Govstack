package org.govstack.pom.pages;

import com.aventstack.extentreports.Status;
import org.govstack.framework.ExtentReporter;
import org.govstack.framework.TestData;
import org.govstack.pom.locators.ContentMainLocators;
import org.govstack.pom.locators.NewsLocators;
import org.govstack.utils.CommonMethods;
import org.openqa.selenium.WebElement;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NewsPage {
    CommonMethods methods = new CommonMethods();
    NewsLocators newsLocators = new NewsLocators();
    ContentMainLocators mainLocators=new ContentMainLocators();
    public static String newsTitle;


    public void publishNews() {
        enterSettingsDetails();
        enterContentDetails();
        enterSummaryDetails();
        requestPublish();
        verifyPublish();
    }
    public void verifyPublish(){
        methods.clickElement(mainLocators.postsBtn);
        methods.clickElement(newsLocators.searchTxt);
        methods.sendTextToElement(newsLocators.searchTxt,newsTitle);
        for(WebElement ele: newsLocators.results){
            if(ele.getText().contains(newsTitle)){
                CommonMethods.highlightElement(ele);
                methods.waitForElement(2);
                ExtentReporter.log(Status.PASS,"News Created");
                ExtentReporter.logWithScreenshot(Status.PASS,"News Created");
                break;
            }else{
                ExtentReporter.log(Status.FAIL,"News not Created");
                ExtentReporter.logWithScreenshot(Status.FAIL,"News not Created");
            }
        }
    }

    public void requestPublish(){
        methods.clickElement(newsLocators.requestPublishBtn);
        methods.waitForElement(3);
        methods.sendTextToElement(newsLocators.workflowCommentTxt,TestData.getData("Descripbe the Changes"));
        methods.waitForElement(2);
        methods.clickElement(newsLocators.requestPublishFinalBtn);
        methods.waitForElement(8);
    }
    public void enterSettingsDetails() {
        methods.clickElement(newsLocators.creatNewpost);
        newsTitle=TestData.getData("Header Name") + "_" + methods.generateRandomString();
        methods.sendTextToElement(newsLocators.headerNameTxt, newsTitle);
        methods.clickElement(newsLocators.datePicker);
        if (TestData.getData("Post Date").equalsIgnoreCase("currentdate")) {
            methods.selectOptionFromList(newsLocators.postDateTxt, methods.getCurrentDate());
        }
        //methods.clickElement(newsLocators.headerNameTxt);
        //methods.clickElement(newsLocators.saveBtn);
        methods.clickElement(newsLocators.postCategoriesBtn);
        methods.waitForElement(3);
        methods.selectOptionFromList(newsLocators.selectCategory, TestData.getData("Post Category"));
        methods.waitForElement(1);
        methods.clickElement(newsLocators.submitBtn);
        methods.waitForElement(2);
        methods.clickElement(newsLocators.authorBtn);
        methods.waitForElement(3);
        methods.selectOptionFromList(newsLocators.selectAuthor, TestData.getData("Author"));
        methods.waitForElement(1);
        methods.clickElement(newsLocators.submitBtn);
        methods.waitForElement(2);
        // methods.sendTextToElement(newsLocators.CustomMessageTxt,TestData.getData("Custom Message"));
    }

    public void enterContentDetails() {
        methods.clickElement(newsLocators.contentMenuBtn);
        //methods.clickElement(newsLocators.layoutFullLnk);
        methods.sendTextToElement(newsLocators.pageTitleTxt, TestData.getData("Page title") + "_" + methods.generateRandomString());

    }

    public void enterSummaryDetails() {
        methods.clickElement(newsLocators.summaryBtn);
        methods.sendTextToElement(newsLocators.headerNameTxt, TestData.getData("Heading") + "_" + methods.generateRandomString());
    }

    public static void main(String[] args) throws ParseException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateOnly.format(cal.getTime()).split("/")[1]);
    }
}
