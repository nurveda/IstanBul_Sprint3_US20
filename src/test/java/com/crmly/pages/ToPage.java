package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class ToPage extends BasePage {

    @FindBy(xpath = "//div[@class='bx-finder-box-tabs']//a")
    public List<WebElement> fingerBoxTab;

    @FindBy(xpath ="//a[contains(text(),'Employees and departments')]")
    public WebElement empAndDepOption;

    @FindBy(css = "#destLastTab_destination0183341")
    public WebElement recentOption;

    @FindBy(css = "#destEmailTab_destination0183341")
    public WebElement emailOption;

    @FindBy(css = "#bx-destination-tag")
    public WebElement addMorelink;

    @FindBy(css = ".feed-add-post-destination-text")
    public List<WebElement> mailsInInputBox;

    @FindBy(xpath = "//*[@class='popup-window-close-icon']")
    public WebElement crossBtn;




}
