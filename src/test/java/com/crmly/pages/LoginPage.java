package com.crmly.pages;

import com.crmly.utilities.ConfigurationReader;
import com.crmly.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);
    }

    @FindBy(css = "[type='text']")
    public WebElement usernameInput;

    @FindBy(css = "[type='password']")
    public WebElement passwordInput;

    @FindBy(css = "[type='submit']")
    public WebElement submitBtn;

    @FindBy(css = "#user-name")
    public WebElement userName;


    public void login(String userType){

        String username="";
        String password= ConfigurationReader.get("password");
        switch (userType) {
            case "HR":
                username = ConfigurationReader.get("HR_username");
                break;
            case "Marketing":
                username = ConfigurationReader.get("Marketing_username");
                break;
            case "Help Desk":
                username = ConfigurationReader.get("HelpDesk_username");
                break;
            default:
                System.out.println("Please enter user type");
                break;
        }

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        System.out.println("username = " + username);
        submitBtn.click();

        Assert.assertEquals("verify username's are same",username,userName.getText());

    }








}
