package com.crmly.step_definitions;

import com.crmly.pages.InsVideoPage;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InsertVideoStepDefs {

    InsVideoPage insVideoPage= new InsVideoPage();


    @When("enter {string} to video source input box")
    public void enter_to_video_source_input_box(String videoURL) {
       insVideoPage.videoSourceBox.sendKeys(videoURL);
    }

    @Then("system should NOT display error message")
    public void system_should_NOT_display_error_message() {

        new WebDriverWait(Driver.get(),5).until(ExpectedConditions.visibilityOf(insVideoPage.errorMsg));
        Assert.assertFalse(insVideoPage.errorMsg.isDisplayed());

    }


    @When("click to the {string} button")
    public void click_to_the_button(String result) {

        switch (result){
            case "save":
                insVideoPage.sendBtn.click();
                break;
            case "cancel":
                insVideoPage.cancelBtn.click();
                break;
            default:
                System.out.println("result does not matching");
        }

    }



    @When("user clicks cross icon on the corner of the page")
    public void user_clicks_cross_icon_on_the_corner_of_the_page() {
        insVideoPage.closeBtn.click();
    }

    @Then("verify window will not be visible")
    public void verify_window_will_not_be_visible() {

        Assert.assertFalse(insVideoPage.coreWindow.isDisplayed());

    }



}
