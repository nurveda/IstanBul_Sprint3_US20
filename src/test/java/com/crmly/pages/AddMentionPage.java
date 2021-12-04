package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddMentionPage extends BasePage{

    @FindBy(id="bx-lm-box-waiter-content-text")
    public WebElement noItemText;

    @FindBy(xpath = "//a[contains(text(),'Recent')]")
    public WebElement recentOption;

    @FindBy(xpath = "//a[contains(text(),'Employees and departments')]")
    public WebElement empAndDepOption;

    @FindBy(id = "BXSocNetLogDestination")
    public WebElement littleWindow;

    @FindBy(css = ".bxhtmled-metion")
    public WebElement emailOnWindow;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement windowBox;



}
