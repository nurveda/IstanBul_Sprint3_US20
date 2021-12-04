package com.crmly.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class QuotePage extends BasePage{

    @FindBy(xpath = "//blockquote")
    public WebElement yellowInputBox;

    @FindBy(css = ".bxhtmled-quote")
    public List<WebElement> nestedQuoteBoxes;

    @FindBy(xpath = "//*[@class='bxhtmled-quote']/..")
    public WebElement yallowBox;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement windowBox;





}
