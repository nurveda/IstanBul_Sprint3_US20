package com.crmly.step_definitions;

import com.crmly.pages.AddMentionPage;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddMetionStepDefs {

    AddMentionPage addMentionPage= new AddMentionPage();

    @Then("add mention window is displayed")
    public void add_mention_window_is_displayed() {
        Assert.assertTrue(addMentionPage.littleWindow.isDisplayed());
    }

    @Then("inside the window There are no items message is displayed")
    public void inside_the_window_There_are_no_items_message_is_displayed() {
        Assert.assertEquals("There are no items", addMentionPage.noItemText.getText());
    }

    @Then("Recent, Employees and departments options are visible")
    public void recent_Employees_and_departments_options_are_visible() {
        Assert.assertTrue(addMentionPage.recentOption.isDisplayed());
        Assert.assertTrue(addMentionPage.empAndDepOption.isDisplayed());
    }



    @When("click to Employees and departments part")
    public void click_to_Employees_and_departments_part() {
        addMentionPage.empAndDepOption.click();
    }

    @When("select {string}")
    public void select(String beginning) {
       String username= beginning+"@cybertekschool.com";
       String path="//div[text()='"+username+"']";
       WebElement user=Driver.get().findElement(By.xpath(path));
       user.click();


    }

    @Then("{string} should display on the window")
    public void should_display_on_the_window(String beginning) {
        String expectedEmail= beginning+"@cybertekschool.com";
        Driver.get().switchTo().frame(Driver.get().findElement(By.cssSelector(".bx-editor-iframe")));
        String actualEmail= addMentionPage.emailOnWindow.getText();
        Assert.assertEquals(expectedEmail,actualEmail);
    }


    @When("delete mentioned user from the announcement window")
    public void delete_mentioned_user_from_the_announcement_window() {
        addMentionPage.emailOnWindow.sendKeys(Keys.CONTROL+"a");
        addMentionPage.emailOnWindow.sendKeys(Keys.BACK_SPACE);
    }

    @Then("verify mentioned user deleted from the window")
    public void verify_mentioned_user_deleted_from_the_window() {
        Assert.assertEquals("",addMentionPage.windowBox.getText());

    }




}
