package org.govstack.pom.locators;

import io.cucumber.java.sl.In;
import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;
import java.util.List;

public class NewsLocators extends InitElements {

    @FindBy(xpath = "//button[@class='btn btn-outline umb-outline']")
    public WebElement creatNewpost;


    /**
     * Settings Section
     **/
    @FindBy(id = "headerName")
    public WebElement headerNameTxt;

    @FindBy(xpath = "//span[@icon='icon-calendar']")
    public WebElement datePicker;
    @FindBy(xpath = "//div[@class='dayContainer']/span")
    public List<WebElement> postDateTxt;

    @FindBy(xpath = "//div[@class='umb-editor-footer']/div/div[2]/umb-button/div/button")
    public WebElement saveBtn;

    @FindBy(xpath = "//button[@id='postCategories']")
    public WebElement postCategoriesBtn;
    @FindBy(xpath = "//a[@class='umb-tree-item__label']")
    public List<WebElement> selectCategory;
    @FindBy(xpath = "//umb-button[@label-key='general_submit']/div/button")
    public WebElement submitBtn;
    @FindBy(xpath = "//button[@id='postAuthor']")
    public WebElement authorBtn;
    @FindBy(xpath = "//div[@class='umb-table-cell black umb-minilistview__fade-not-allowed']")
    public List<WebElement> selectAuthor;
    @FindBy(xpath = "//span[@id='disableComments]")
    public WebElement DisableCommentsTxt;
    @FindBy(xpath = "//div[@class='umb-toggle__toggle']")
    public WebElement SendSubscriberNotificationTxt;
    @FindBy(xpath = "//body[contains(@data-id,'customMessage')]")
    public WebElement CustomMessageTxt;


    /**
     * Content
     **/
    @FindBy(xpath = "(//button[contains(text(),'Content')])[1]")
    public WebElement contentMenuBtn;
    @FindBy(xpath = "//input[@value='pageLayoutFull']")
    public WebElement layoutFullLnk;
    @FindBy(xpath = "//label[@class='usn-item item  pageLayoutLeft']")
    public WebElement LayoutLeftTxt;
    @FindBy(xpath = "//label[@class='usn-item item  pageLayoutRight']")
    public WebElement LayoutRightTxt;
    @FindBy(xpath = "//span[@id='removePageHeading']")
    public WebElement RemovePageHeadingsTxt;
    @FindBy(xpath = "//span[@id='hidePageHeading']")
    public WebElement HidePageHeadingsTxt;
    @FindBy(xpath = "//input[@id='onPageTitle']")
    public WebElement pageTitleTxt;
    @FindBy(xpath = "//input[@placeholder='Heading goes here']")
    public WebElement SecondaryheadingTxt;
    @FindBy(xpath = "//input[@value='s']")
    public WebElement STxt;
    @FindBy(xpath = "//input[@value='m']")
    public WebElement MTxt;
    @FindBy(xpath = "//input[@value='l']")
    public WebElement LTxt;
    @FindBy(xpath = "//button[@id='button_mainContent']")
    public WebElement MainContentTxt;

    /**
     * Extra Content
     **/

    @FindBy(xpath = "//span[@id='hideDefaultTopComponents']")
    public WebElement HideGlobalTopComponentsTxt;
    @FindBy(xpath = "//button[@id='button_aboveMainContent']")
    public WebElement AboveMainContentTxt;
    @FindBy(xpath = "//button[@id='button_belowMainContent']")
    public WebElement BelowMainContentTxt;
    @FindBy(xpath = "//span[@id='hideDefaultBottomComponents']")
    public WebElement HideGlobalBottomComponentsTxt;
    @FindBy(xpath = "//span[@id='hideDefaultPods']")
    public WebElement HideGlobalPodsTxt;
    @FindBy(xpath = "//button[@id='button_pagePods']")
    public WebElement PodsTxt;
    @FindBy(xpath = "//input[@value='modal-timed']")
    public WebElement ModalWindowTimedTxt;
    @FindBy(xpath = "//input[@value='modal-scroll']")
    public WebElement ModalWindowScrollTxt;

    /**
     * Summary
     **/
    @FindBy(xpath = "//button[contains(text(),'Summary')]")
    public WebElement summaryBtn;
    @FindBy(id = "pageListingHeading")
    public WebElement pageListingHeadingTxt;

    /**
     * Navigation
     **/


    @FindBy(xpath = "//span[@id='umbracoNaviHide']")
    public WebElement HideFromAllNavigationTxt;
    @FindBy(xpath = "//span[@id='hideFromInternalSearch']")
    public WebElement HideFromInternalSearchTxt;
    @FindBy(xpath = "//span[@id='hideBreadcrumb']")
    public WebElement HideBreadcrumbTxt;
    @FindBy(xpath = "//input[@id='htmlSitemapLinkTxt']")
    public WebElement HTMLsitemaplinkTxtTxt;
    @FindBy(xpath = "//input[@id='breadcrumbLinkTxt']")
    public WebElement BreadcrumblinkTxtTxt;

    /**
     * SEO&Share
     **/

    @FindBy(xpath = "//div[@class='usn-google-search']")
    public WebElement TitleAndDescriptionTxt;
    @FindBy(xpath = "//input[@ng-model='model.value.title']")
    public WebElement TitleTxt;
    @FindBy(xpath = "//Txtarea[@class='usn-Txt-field usn-Txt-area ng-pristine ng-untouched ng-valid ng-empty']")
    public WebElement DescriptionTxt;

    @FindBy(xpath = "")
    public WebElement SocialshareimageTxt;


    @FindBy(xpath = "//input[@id='twitterCreatorUsername']")
    public WebElement TwitterCreatorUsernameTxt;
    @FindBy(xpath = "//span[@id='hideFromSearchEngines']")
    public WebElement HideFromSearchEnginesTxt;
    @FindBy(xpath = "//span[@id='stopInternalLinksBeingFollowed']")
    public WebElement StopInternalLinksBeingFollowedTxt;
    @FindBy(xpath = "//input[@name='taboptions_6710']")
    public WebElement SitemapXMLchangeFrequencyAlways;
    @FindBy(xpath = "//input[@value='sitemap_Hourly']")
    public WebElement SitemapXMLchangeFrequencyHourly;
    @FindBy(xpath = "//input[@value='sitemap_Daily']")
    public WebElement SitemapXMLchangeFrequencyDaily;
    @FindBy(xpath = "//input[@value='sitemap_Weekly']")
    public WebElement SitemapXMLchangeFrequencyWeekly;
    @FindBy(xpath = "//input[@value='sitemap_Monthly']")
    public WebElement SitemapXMLchangeFrequencyMonthly;
    @FindBy(xpath = "//input[@value='sitemap_Yearly']")
    public WebElement SitemapXMLchangeFrequencyYearly;
    @FindBy(xpath = "//input[@value='sitemap_Never']")
    public WebElement SitemapXMLchangeFrequencyNever;
    @FindBy(xpath = "//input[@id='overrideCanonicalURL']")
    public WebElement OverrideCanonicalURL;
    @FindBy(xpath = "//input[@id='umbracoUrlAlias']")
    public WebElement AlternativeURLTxt;
    @FindBy(xpath = "id=umbracoUrlName")
    public WebElement AlternativeNameTxt;


    /**
     * Scripts
     **/

    @FindBy(xpath = "//div[@class='ace_content']")
    public WebElement HeaderOpeningScriptsTxt;


    @FindBy(xpath = "")
    public WebElement HeaderClosingScriptsTxt;

    @FindBy(xpath = "")
    public WebElement AfterOpeningBodyScriptsTxt;

    @FindBy(xpath = "")
    public WebElement BeforeClosingBodyScriptsTxt;


    /**
     * Advanced
     **/
    @FindBy(xpath = "//span[@id='hideWebsiteHeaderSection']")
    public WebElement HideWebsiteHeaderSectionTxt;
    @FindBy(xpath = "//span[@id='hideWebsiteFooterSection']")
    public WebElement HideWebsiteFooterSectionTxt;
    @FindBy(xpath = "//button[@id='overrideWebsiteStyle']")
    public WebElement OverrideDesignStyleTxt;
    @FindBy(xpath = "overrideWebsiteLogo")
    public WebElement OverrideWebsiteLogoTxt;
    @FindBy(xpath = "//input[@value='ltr']")
    public WebElement OverrideContentDirectionLTRTxt;
    @FindBy(xpath = "//input[@value='rtl']")
    public WebElement OverrideContentDirectionRTLTxt;
    @FindBy(xpath = "//input[@id='customBodyClasses']")
    public WebElement CustomPageClassesTxt;
    @FindBy(xpath = "//span[@id='disableDelete']")
    public WebElement DisableDeleteTxt;

    @FindBy(xpath = "(//span[@class='umb-button__content'])[4]")
    public WebElement requestPublishBtn;
    @FindBy(id="workflowComment")
    public WebElement workflowCommentTxt;

    @FindBy(xpath = "(//span[@class='umb-button__content'])[6]")
    public WebElement requestPublishFinalBtn;

    @FindBy(xpath = "//input[contains(@id,'search')]")
    public WebElement searchTxt;

    @FindBy(xpath = "//a[@class='umb-content-grid__item-name umb-outline -light']/span[2]")
    public List<WebElement> results;

}
