package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class LinkPage extends BasePage{

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement textInputBox;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkInputBox;

    @FindBy(id = "undefined")
    public WebElement saveBtn;

    @FindBy(id = "cancel")
    public WebElement cancelBtn;

    @FindBy(xpath = "//span[@title='Close']")
    public WebElement closeIconBtn;

    @FindBy(xpath = "//body[@contenteditable='true']/a")
    public WebElement textInsideWindow;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement emptyWindow;

    @FindBy(css = "#bx-admin-prefix")
    public WebElement coreWindow;
}
