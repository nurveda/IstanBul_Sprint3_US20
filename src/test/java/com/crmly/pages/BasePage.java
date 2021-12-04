package com.crmly.pages;

import com.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class BasePage {

    public BasePage(){
        PageFactory.initElements(Driver.get(),this);
    }


    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreTab;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[3]")
    public WebElement announcementOption;

    @FindBy(css = "#divoPostFormLHE_blogPostForm")
    public WebElement AnnounceWindow;









}
