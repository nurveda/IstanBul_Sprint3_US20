package com.crmly.step_definitions;

import com.crmly.pages.ActivityStreamPage;
import com.crmly.pages.AnnouncementPage;
import com.crmly.pages.ToPage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ToBoxStepDefs {
ActivityStreamPage activityStreamPage= new ActivityStreamPage();
AnnouncementPage announcementPage= new AnnouncementPage();
ToPage toPage= new ToPage();


    @When("click the cross inside the all employees box")
    public void click_the_cross_inside_the_all_employees_box() {

      announcementPage.cross_AllEmployees.click();

    }

    @Then("verify all employees option is removed")
    public void verify_all_employees_option_is_removed() {
        Assert.assertFalse(announcementPage.allEmployesBox.isDisplayed());
    }


    @When("click {string} option")
    public void click_option(String string) {
        announcementPage.persGroupDepartLink.click();
    }

    @When("verify if people and department parts are displayed in the new window")
    public void verify_if_people_and_department_parts_are_displayed_in_the_new_window() {
       Assert.assertTrue(announcementPage.addMoreWindow.isDisplayed());
    }


    @Then("the system should displayed on the right side of the page")
    public void the_system_should_displayed_on_the_right_side_of_the_page(List<String> expectedOptions) {

        List<String> actualOptions= new ArrayList<>();
        for(WebElement option: toPage.fingerBoxTab){
            actualOptions.add(option.getText());
        }

        Assert.assertEquals("Recent, Employees and departments and E-mail users options DOESN'T displayed",expectedOptions,actualOptions);
    }


    @Given("click Add More link")
    public void click_Add_More_link() {
        toPage.addMorelink.click();
    }

    @When("Select {string} part")
    public void select_part(String ToOptions) {

        switch (ToOptions){
            case "Recent":
                toPage.recentOption.click();
                break;
            case "Employees and departments":
                toPage.empAndDepOption.click();
                break;
            case "E-mail users":
                toPage.emailOption.click();
            default:
                System.out.println("Please enter option");
        }

    }

    @When("add {string} and {string} users to contact")
    public void add_and_users_to_contact(String beginning1, String beginning2) {
        String email1= beginning1+"@cybertekschool.com";
        String email2= beginning2+"@cybertekschool.com";
        Driver.get().findElement(By.xpath("//div[text()='"+email1+"']")).click();
        Driver.get().findElement(By.xpath("//div[text()='"+email2+"']")).click();
    }

    @Then("verify {string} and {string} users re in the input box")
    public void verify_and_users_re_in_the_input_box(String beginning1, String beginning2) {
        String email1= beginning1+"@cybertekschool.com";
        String email2= beginning2+"@cybertekschool.com";

        List<String> expectedMails= new ArrayList<>(Arrays.asList("All employees",email1,email2));
        List<String> actualMails= new ArrayList<>();
        for(WebElement mail: toPage.mailsInInputBox){
            actualMails.add(mail.getText());
        }

        System.out.println("actualMails = " + actualMails);
        System.out.println("expectedMails = " + expectedMails);
        Assert.assertEquals("actual mail list is different",expectedMails,actualMails);

        toPage.crossBtn.click();
    }

    @When("user clicks send button")
    public void user_clicks_send_button() {
        announcementPage.sendBtn.click();
    }

    @Then("user should get information message -Please specify at least one person.")
    public void user_should_get_information_message_Please_specify_at_least_one_person() {

        Assert.assertEquals("verify error message","Please specify at least one person.",activityStreamPage.errorMessage.getText());


    }


    @Then("click {string} button")
    public void click_button(String button) {

       // toPage.crossBtn.click();

        switch (button){
            case "save":
                announcementPage.sendBtn.click();
                BrowserUtils.waitFor(5);
                break;
            case "cancel":
                announcementPage.cancelBtn.click();
                break;
            default:
                System.out.println("wrong button name");


        }


    }


    @Then("full announcement window should not display anymore")
    public void full_announcement_window_should_not_display_anymore() {
        Assert.assertTrue(announcementPage.fullAnnouncementWindow.isEnabled());

    }


}
