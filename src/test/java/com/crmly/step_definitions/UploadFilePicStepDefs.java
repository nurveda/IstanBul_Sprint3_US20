package com.crmly.step_definitions;

import com.crmly.pages.ActivityStreamPage;
import com.crmly.pages.AnnouncementPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Arrays;

public class UploadFilePicStepDefs {

    AnnouncementPage announcementPage = new AnnouncementPage();


    @Given("click Upload files icon")
    public void click_Upload_files_icon() {
        announcementPage.uploadFileIcon.click();
    }


//    @When("user uploaded picture from local")
//    public void user_uploaded_picture_from_local() {
//        String projectPath= System.getProperty("user.dir");
//        String filePath= "src/test/resources/example.docx";
//        String fullPath=projectPath+"/"+filePath;
//
//        System.out.println("projectPath = " + projectPath);
//        System.out.println("filePath = " + filePath);
//        System.out.println("fullPath = " + fullPath);
//        new WebDriverWait(Driver.get(),10).until(ExpectedConditions.visibilityOf(announcementPage.fileImageUploader));
//
//        announcementPage.fileImageUploader.sendKeys(fullPath);
//        BrowserUtils.waitFor(5);
//
//    }

    @Then("the system should display selected picture under the Attached files and images text")
    public void the_system_should_display_selected_picture_under_the_Attached_files_and_images_text() {


    }

//    @Then("click Insert in text")
//    public void click_Insert_in_text() {
//        BrowserUtils.waitForClickablility(announcementPage.insertText,10);
//        announcementPage.insertText.click();
//    }
//
//    @Then("verify the picture is displayed inside the announcement window")
//    public void verify_the_picture_is_displayed_inside_the_announcement_window() {
//
//    }

    @When("user uploaded {string} from local")
    public void userUploadedFromLocal(String name) {

        String projectPath = System.getProperty("user.dir");
        String filePath = "src/test/resources/" + name;
        String fullPath = projectPath + "/" + filePath;

        System.out.println("projectPath = " + projectPath);
        System.out.println("filePath = " + filePath);
        System.out.println("fullPath = " + fullPath);
        announcementPage.fileImageUploader.sendKeys(fullPath);

    }


    @Given("the user should be on the announcement window")
    public void theUserShouldBeOnTheAnnouncementWindow() {
        ActivityStreamPage activityStreamPage = new ActivityStreamPage();
        activityStreamPage.getAnnouncementWindow();
    }


    @Then("verify the {string} is displayed under the Attachment files and images text")
    public void verifyTheIsDisplayedUnderTheAttachmentFilesAndImagesText(String fileName) {

        String[] arrOfStr = fileName.split("[.]",10);

        System.out.println("arrOfStr[0] = " + arrOfStr[0]);

        Assert.assertTrue(announcementPage.underAttPicName.getText().contains(arrOfStr[0]));

    }
}
