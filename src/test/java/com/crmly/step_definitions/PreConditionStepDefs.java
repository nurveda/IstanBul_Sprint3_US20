package com.crmly.step_definitions;

import com.crmly.pages.ActivityStreamPage;
import com.crmly.pages.LoginPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class PreConditionStepDefs {

    LoginPage loginPage= new LoginPage();
    ActivityStreamPage activityStreamPage= new ActivityStreamPage();


    @When ("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {

        loginPage.login(userType);
    }


    @When("user clicks more tab")
    public void user_clicks_more_tab() {
        activityStreamPage.moreTab.click();
    }




    @When("clicks Announcement option")
    public void clicks_Announcement_option() {

        activityStreamPage.announcementOption.click();
    }



    @Then("Announcement window should be displayed")
    public void announcement_window_should_be_displayed() {
        Assert.assertTrue(activityStreamPage.AnnounceWindow.isDisplayed());
    }



}
