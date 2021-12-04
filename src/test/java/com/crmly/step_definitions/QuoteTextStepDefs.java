package com.crmly.step_definitions;

import com.crmly.pages.QuotePage;
import com.crmly.utilities.BrowserUtils;
import com.crmly.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class QuoteTextStepDefs {

    QuotePage quotePage = new QuotePage();

    @Then("verify the system displayed yellow quote input box inside the announcement window")
    public void verify_the_system_displayed_yellow_quote_input_box_inside_the_announcement_window() {
        Driver.get().switchTo().frame(Driver.get().findElement(By.cssSelector(".bx-editor-iframe")));
        Assert.assertTrue(quotePage.yellowInputBox.isDisplayed());

    }

    @When("enter {string} to yellow quote input box")
    public void enter_to_yellow_quote_input_box(String text) {
        Driver.get().switchTo().frame(Driver.get().findElement(By.cssSelector(".bx-editor-iframe")));
        BrowserUtils.waitFor(2);
        quotePage.yellowInputBox.click();
        quotePage.yellowInputBox.sendKeys(text);
    }

    @Then("verify {string} is visible on the window")
    public void verify_is_visible_on_the_window(String text) {
        //Driver.get().switchTo().frame(Driver.get().findElement(By.cssSelector(".bx-editor-iframe")));
        Assert.assertEquals("check" + text + "is matching with actual", text, quotePage.yellowInputBox.getText());

    }

    @Then("verify {string} and {string} is visible on the window")
    public void verify_and_is_visible_on_the_window(String string, String string2) {
        Driver.get().switchTo().frame(Driver.get().findElement(By.cssSelector(".bx-editor-iframe")));
        List<String> expectedList = new ArrayList<>(Arrays.asList(string, string2));
        List<String> actualList = new ArrayList<>();
        for (WebElement text : quotePage.nestedQuoteBoxes) {
            actualList.add(text.getText());
        }

        System.out.println("expectedList = " + expectedList);
        System.out.println("actualList = " + actualList);

    }

    @Then("delete text and yellow quote input box")
    public void deleteTextAndYellowQuoteInputBox() {
        quotePage.yellowInputBox.sendKeys(Keys.CONTROL + "a");
        quotePage.yellowInputBox.sendKeys(Keys.BACK_SPACE);
    }


    @Then("verify window is empty")
    public void verifyWindowIsEmpty() {
        Assert.assertEquals("", quotePage.windowBox.getText());
    }

    @And("user enters {string} to yellow quote input box")
    public void userEntersToYellowQuoteInputBox(String text) {
        quotePage.yellowInputBox.sendKeys(text);
    }
}








//    @Then("verify yellow quote input box is not visible on the announcement window")
//    public void verify_yellow_quote_input_box_is_not_visible_on_the_announcement_window() {
//        //BrowserUtils.waitFor(5);
//       // Driver.get().switchTo().frame(Driver.get().findElement(By.xpath("//iframe[@class='bx-editor-iframe']")));
//        //String yellowQuote= quotePage.windowBox.getText();
//        Assert.assertFalse(quotePage.yellowInputBox.isEnabled());
//        //Assert.assertEquals("",yellowQuote);
//    }
