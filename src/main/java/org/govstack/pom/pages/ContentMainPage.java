package org.govstack.pom.pages;

import org.govstack.pom.locators.ContentMainLocators;
import org.govstack.utils.CommonMethods;

public class ContentMainPage {

    ContentMainLocators mainLocators = new ContentMainLocators();
    CommonMethods methods=new CommonMethods();

    public void SelectTheContent(String content) throws InterruptedException {
        methods.clickElement(mainLocators.mainSiteExpandBtn);
        methods.waitForElement(2);
        methods.scrollToElement(mainLocators.newsExpandBtn);
        methods.clickElement(mainLocators.newsExpandBtn);
        methods.waitForElement(2);
        methods.clickElement(mainLocators.postsBtn);
        methods.waitForElement(2);
    }
}
