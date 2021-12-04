package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InsVideoPage extends BasePage {


    @FindBy(css = "#video_idPostFormLHE_blogPostForm-source")
    public WebElement videoSourceBox;

    @FindBy(css = "#undefined")
    public WebElement sendBtn;

    @FindBy(css = "#cancel")
    public WebElement cancelBtn;

    @FindBy (xpath = "//span[@title='Close']")
    public WebElement closeBtn;

    @FindBy( css = ".bxhtmled-video-error")
    public WebElement errorMsg;

    @FindBy(css = "#bx-admin-prefix")
    public WebElement coreWindow;


}
