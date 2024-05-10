package org.govstack.pom.pages;

import org.govstack.pom.locators.ContentMainLocators;
import org.govstack.utils.CommonMethods;

public class ContentMainPage {

    ContentMainLocators mainLocators = new ContentMainLocators();
    CommonMethods methods=new CommonMethods();

    public void SelectTheContent(String content) {
        methods.clickElement(mainLocators.mainSiteExpandBtn);
        methods.clickElement(mainLocators.newsExpandBtn);
        methods.clickElement(mainLocators.postsBtn);
    }
}
