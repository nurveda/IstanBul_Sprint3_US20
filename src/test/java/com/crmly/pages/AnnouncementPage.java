package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AnnouncementPage extends BasePage{


    @FindBy(css = "#bx-b-uploadfile-blogPostForm")
    public WebElement uploadFileIcon;

    @FindBy(css = "#bx-b-link-blogPostForm")
    public WebElement linkIcon;

    @FindBy(css = "[title='Insert video']")
    public WebElement insertVideoIcon;

    @FindBy(xpath = "//span[@title='Quote text']")
    public WebElement quoteTextIcon;

    @FindBy(css = "#bx-b-mention-blogPostForm")
    public WebElement addMentionIcon;

    @FindBy(css = "#blog-submit-button-save")
    public WebElement saveBtn;

    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelBtn;

    @FindBy(name = "bxu_files[]") //[size='1'][name='bxu_files[]']
    public WebElement fileImageUploader;

    @FindBy(css = ".insert-btn-text")
    public WebElement insertText;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement cross_AllEmployees;

    @FindBy(css = "#feed-add-post-destination-item")
    public WebElement allEmployesBox;

    @FindBy(linkText = "Add persons, groups or department")
    public WebElement persGroupDepartLink;

    @FindBy(css ="#BXSocNetLogDestination")
    public WebElement addMoreWindow;

    @FindBy(css = "#blog-submit-button-save")
    public WebElement sendBtn;

    @FindBy(css = "#fulloPostFormLHE_blogPostForm")
    public WebElement fullAnnouncementWindow;

    @FindBy(xpath = "//span[@title='Click to insert file']")
    public WebElement underAttPicName;

    @FindBy(css="#blg-post-img-377")
    public WebElement announcementWholeWindow;

}
