package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActivityStreamPage extends BasePage{


    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement errorMessage;


    public void getAnnouncementWindow(){
        moreTab.click();
        announcementOption.click();

    }


}
