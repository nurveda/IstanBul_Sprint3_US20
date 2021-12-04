package com.crmly.step_definitions;

import com.crmly.pages.AnnouncementPage;
import com.crmly.pages.LinkPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class LinkStepDefs {

    LinkPage linkPage= new LinkPage();
    AnnouncementPage announcementPage= new AnnouncementPage();

    @When("click {string} icon")
    public void click_icon(String icon) {

        switch(icon){
            case "Upload File":
                announcementPage.uploadFileIcon.click();
                break;
            case "Link":
                announcementPage.linkIcon.click();
                break;
            case "Insert Video":
                announcementPage.insertVideoIcon.click();
                break;
            case "Quote Text":
                //new WebDriverWait(Driver.get(),5).until(ExpectedConditions.elementToBeClickable(announcementPage.quoteTextIcon));
                announcementPage.quoteTextIcon.click();
                break;
            case "Add Mention":
                announcementPage.addMentionIcon.click();
                break;
            default:
                System.out.println("Icon name is not correct");
        }

    }

    @When("enter {string} to Text input box")
    public void enter_to_Text_input_box(String linkText) {
      linkPage.textInputBox.sendKeys(linkText);
    }

    @When("enter {string} to Link input box")
    public void enter_to_Link_input_box(String linkURL) {
       linkPage.linkInputBox.sendKeys(linkURL);
    }

    @When("hit to the {string} button")
    public void hit_to_the_button(String result) {

        switch (result){
            case "save":
                linkPage.saveBtn.click();
                break;
            case "cancel":
                linkPage.cancelBtn.click();
                break;
            default:
                System.out.println("result does not matching");
        }
    }

    @Then("verify only {string} is displayed on the announcement window")
    public void verify_only_is_displayed_on_the_announcement_window(String linkText) {

        Driver.get().switchTo().frame(Driver.get().findElement(By.cssSelector(".bx-editor-iframe")));
        String actualLinkText= linkPage.textInsideWindow.getText();
        System.out.println("actualLinkText = " + actualLinkText);
        Assert.assertEquals("check list inside the window",linkText,actualLinkText);
    }


    @Then("verify entered link didn't displayed on the window")
    public void verify_entered_link_didn_t_displayed_on_the_window() {
        BrowserUtils.waitFor(5);
        Driver.get().switchTo().frame(Driver.get().findElement(By.cssSelector(".bx-editor-iframe")));
        Assert.assertEquals("text is not correct","",linkPage.emptyWindow.getText());

    }


    @When("clicks cross icon button")
    public void clicks_cross_icon_button() {
       linkPage.closeIconBtn.click();
    }

    @Then("window will not be visible")
    public void window_will_not_be_visible() {
        Assert.assertFalse(linkPage.coreWindow.isDisplayed());
    }


}
