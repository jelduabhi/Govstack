package org.govstack.pom.locators;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.security.cert.X509Certificate;

public class CreateNewsLocators {

    @FindBy (xpath = "//button[@class='btn btn-outline umb-outline']")
    public WebElement creatNewpost;


    /**  Settings Section **/
    @FindBy (xpath = "//input[@id='postDate']")
    public  WebElement postDateText;
    @FindBy (xpath = "//span[@id='disableComments]")
    public  WebElement DisableCommentsText;
    @FindBy (xpath = "//div[@class='umb-toggle__toggle']")
    public WebElement SendSubscriberNotificationText;
    @FindBy (xpath = "//input[@id='customMessage']")
    public WebElement CustomMessageText;
    @FindBy (xpath = "//button[@id='postCategories']")
    public WebElement PostCategoriesText;
    @FindBy (xpath =  "//button[@id='postAuthor']")
    public  WebElement AuthorText;


    /** Content **/
    @FindBy (xpath = "//input[@value='pageLayoutFull']")
    public  WebElement LayoutFullText;
    @FindBy (xpath = "//label[@class='usn-item item  pageLayoutLeft']")
    public  WebElement LayoutLeftText;
    @FindBy (xpath = "//label[@class='usn-item item  pageLayoutRight']")
    public  WebElement LayoutRightText;
    @FindBy (xpath = "//span[@id='removePageHeading']")
    public  WebElement RemovePageHeadingsText;
    @FindBy (xpath = "//span[@id='hidePageHeading']")
    public  WebElement HidePageHeadingsText;
    @FindBy (xpath = "//input[@id='onPageTitle']")
    public  WebElement PagetitleText;
    @FindBy (xpath =  "//input[@placeholder='Heading goes here']")
    public WebElement SecondaryheadingText;
    @FindBy (xpath =  "//input[@value='s']")
    public WebElement SText;
    @FindBy (xpath =  "//input[@value='m']")
    public WebElement MText;
    @FindBy (xpath =  "//input[@value='l']")
    public WebElement LText;
    @FindBy (xpath = "//button[@id='button_mainContent']")
    public WebElement MainContentText;

    /**Extra Content**/

    @FindBy (xpath =  "//span[@id='hideDefaultTopComponents']")
    public WebElement HideGlobalTopComponentsText;
    @FindBy (xpath =  "//button[@id='button_aboveMainContent']")
    public WebElement AboveMainContentText;
    @FindBy (xpath =  "//button[@id='button_belowMainContent']")
    public WebElement BelowMainContentText;
    @FindBy (xpath =  "//span[@id='hideDefaultBottomComponents']")
    public WebElement HideGlobalBottomComponentsText;
    @FindBy (xpath =  "//span[@id='hideDefaultPods']")
    public WebElement HideGlobalPodsText;
    @FindBy (xpath =  "//button[@id='button_pagePods']")
    public WebElement PodsText;
    @FindBy (xpath =  "//input[@value='modal-timed']")
    public WebElement ModalWindowTimedText;
    @FindBy (xpath =  "//input[@value='modal-scroll']")
    public WebElement ModalWindowScrollText;


    /**Navigation**/


    @FindBy (xpath =  "//span[@id='umbracoNaviHide']")
    public WebElement HideFromAllNavigationText;
    @FindBy (xpath =  "//span[@id='hideFromInternalSearch']")
    public WebElement HideFromInternalSearchText;
    @FindBy (xpath =  "//span[@id='hideBreadcrumb']")
    public WebElement HideBreadcrumbText;
    @FindBy (xpath =  "//input[@id='htmlSitemapLinkText']")
    public WebElement HTMLsitemaplinktextText;
    @FindBy (xpath =  "//input[@id='breadcrumbLinkText']")
    public WebElement BreadcrumblinktextText;

    /**SEO&Share**/

    @FindBy (xpath =  "//div[@class='usn-google-search']")
    public WebElement TitleAndDescriptionText;
    @FindBy (xpath = "//input[@ng-model='model.value.title']")
    public WebElement TitleText;
    @FindBy (xpath = "//textarea[@class='usn-text-field usn-text-area ng-pristine ng-untouched ng-valid ng-empty']")
    public WebElement DescriptionText;

    @FindBy (xpath = "")
    public WebElement SocialshareimageText;


    @FindBy (xpath = "//input[@id='twitterCreatorUsername']")
    public WebElement TwitterCreatorUsernameText;
    @FindBy (xpath = "//span[@id='hideFromSearchEngines']")
    public WebElement HideFromSearchEnginesText;
    @FindBy (xpath = "//span[@id='stopInternalLinksBeingFollowed']")
    public WebElement StopInternalLinksBeingFollowedText;
    @FindBy (xpath =  "//input[@name='taboptions_6710']")
    public WebElement SitemapXMLchangeFrequencyAlways;
    @FindBy (xpath =  "//input[@value='sitemap_Hourly']")
    public WebElement SitemapXMLchangeFrequencyHourly;
    @FindBy (xpath =  "//input[@value='sitemap_Daily']")
    public WebElement SitemapXMLchangeFrequencyDaily;
    @FindBy (xpath =  "//input[@value='sitemap_Weekly']")
    public WebElement SitemapXMLchangeFrequencyWeekly;
    @FindBy (xpath =  "//input[@value='sitemap_Monthly']")
    public WebElement SitemapXMLchangeFrequencyMonthly;
    @FindBy (xpath =  "//input[@value='sitemap_Yearly']")
    public WebElement SitemapXMLchangeFrequencyYearly;
    @FindBy (xpath =  "//input[@value='sitemap_Never']")
    public WebElement SitemapXMLchangeFrequencyNever;
    @FindBy (xpath = "//input[@id='overrideCanonicalURL']")
    public WebElement OverrideCanonicalURL;
    @FindBy (xpath = "//input[@id='umbracoUrlAlias']")
    public WebElement AlternativeURLtext;
    @FindBy (xpath = "id=umbracoUrlName")
    public WebElement AlternativeNameText;


    /**Scripts**/

    @FindBy (xpath = "//div[@class='ace_content']")
    public WebElement HeaderOpeningScriptsText;


    @FindBy (xpath = "")
    public WebElement HeaderClosingScriptsText;

    @FindBy (xpath = "")
   public WebElement AfterOpeningBodyScriptsText;

    @FindBy (xpath = "")
    public WebElement BeforeClosingBodyScriptsText;


    /**Advanced**/
    @FindBy (xpath = "//span[@id='hideWebsiteHeaderSection']")
    public WebElement HideWebsiteHeaderSectionText;
    @FindBy (xpath = "//span[@id='hideWebsiteFooterSection']")
    public WebElement HideWebsiteFooterSectionText;
    @FindBy (xpath = "//button[@id='overrideWebsiteStyle']")
    public WebElement OverrideDesignStyleText;
    @FindBy (xpath = "overrideWebsiteLogo")
    public WebElement OverrideWebsiteLogoText;
    @FindBy (xpath = "//input[@value='ltr']")
    public WebElement OverrideContentDirectionLTRText;
    @FindBy (xpath = "//input[@value='rtl']")
    public WebElement OverrideContentDirectionRTLText;
    @FindBy (xpath = "//input[@id='customBodyClasses']")
    public WebElement CustomPageClassesText;
    @FindBy (xpath = "//span[@id='disableDelete']")
    public WebElement DisableDeleteText;


}
