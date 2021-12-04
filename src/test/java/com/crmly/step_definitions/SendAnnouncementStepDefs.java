package com.crmly.step_definitions;

import com.crmly.pages.AnnouncementPage;
import com.crmly.pages.LoginPage;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SendAnnouncementStepDefs {


    @Then("verify announcement sent")
    public void verify_announcement_sent() {
        new WebDriverWait(Driver.get(),3).until(ExpectedConditions.visibilityOf(Driver.get().findElement(By.cssSelector(".feed-post-user-name"))));
        WebElement annUserName= Driver.get().findElement(By.cssSelector(".feed-post-user-name"));
        String actualUs= annUserName.getText();
        String expectedUs= new LoginPage().userName.getText();
        Assert.assertEquals(expectedUs,actualUs);
    }
}
