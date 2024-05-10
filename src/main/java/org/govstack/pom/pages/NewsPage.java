package org.govstack.pom.pages;

import org.govstack.framework.TestData;
import org.govstack.pom.locators.NewsLocators;
import org.govstack.utils.CommonMethods;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class NewsPage {
    CommonMethods methods = new CommonMethods();
    NewsLocators newsLocators = new NewsLocators();

    public void publishNews() {
        methods.sendTextToElement(newsLocators.headerNameTxt, TestData.getData("Header Name") + "_" + methods.generateRandomString());
        methods.clickElement(newsLocators.creatNewpost);
        methods.clickElement(newsLocators.datePicker);
        if (TestData.getData("Post date").equalsIgnoreCase("Currentdate")) {
            methods.selectDate(newsLocators.postDateTxt, methods.getCurrentDate());
        }
        methods.clickElement(newsLocators.saveBtn);
        methods.clickElement(newsLocators.postCategoriesBtn);
    }

    public static void main(String[] args) throws ParseException {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dateOnly = new SimpleDateFormat("MM/dd/yyyy");
        System.out.println(dateOnly.format(cal.getTime()).split("/")[1]);
    }
}
