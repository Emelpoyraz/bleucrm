package com.bleucrm.step_definitions;

import com.bleucrm.pages.ActivityStreamPage;
import com.bleucrm.pages.AppreciationMessagePage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class AppreciationMessage_StepDef {

    AppreciationMessagePage appreciationMessagePage = new AppreciationMessagePage();

    @Given("the user is on the Activity Stream page")
    public void the_user_is_on_the_activity_stream_page() {
        appreciationMessagePage.activityStreamBtn.click();
    }
    @When("the user clicks on the Appreciation tab")
    public void the_user_clicks_on_the_appreciation_tab() {
        appreciationMessagePage.moreTab.click();
        appreciationMessagePage.appreciationBtn.click();
    }
    @When("enter {string} in the message content area")
    public void enter_in_the_message_content_area(String appreciationMessage) {

        Driver.getDriver().switchTo().frame(appreciationMessagePage.iframeArea);
        appreciationMessagePage.messageContentInput.sendKeys("Thank you!");
        Driver.getDriver().switchTo().parentFrame();
    }
    @When("clicks on the Send button")
    public void clicks_on_the_send_button() {
        BrowserUtils.waitForClickablility(appreciationMessagePage.sendButton,10);
        appreciationMessagePage.sendButton.click();
    }
    @Then("the appreciation is sent successfully")
    public void the_appreciation_is_sent_successfully() {
        Assert.assertTrue(appreciationMessagePage.successfulAppreciationMsg.isDisplayed());

    }

    // ------------------errorMessageScenario---------------------------------
    @And("send appreciation without filling in the message content area")
    public void sendAppreciationWithoutFillingInTheMessageContentArea() {
        Driver.getDriver().switchTo().frame(appreciationMessagePage.iframeArea);
        appreciationMessagePage.messageContentInput.click();
        Driver.getDriver().switchTo().parentFrame();
        BrowserUtils.waitForClickablility(appreciationMessagePage.sendButton,10);
        appreciationMessagePage.sendButton.click();
    }

    @Then("{string} error message displayed")
    public void errorMessageDisplayed(String titleError) {
        Assert.assertTrue(appreciationMessagePage.titleErrorMsg.isDisplayed());
    }

    @And("the user send appreciation without filling recipient area")
    public void theUserSendAppreciationWithoutFillingRecipientArea() {
        appreciationMessagePage.removeAllEmployeesBtn.click();
        BrowserUtils.waitForClickablility(appreciationMessagePage.sendButton,10);
        appreciationMessagePage.sendButton.click();
    }


    @Then("{string} error message is displayed")
    public void errorMessageIsDisplayed(String errorRecipient) {
        Assert.assertTrue(appreciationMessagePage.errorRecipientMsg.isDisplayed());
    }

    // ------------------allEmployeesScenario---------------------------------

    @Then("All employees is selected by default")
    public void allEmployeesIsSelectedByDefault() {
        Assert.assertTrue(appreciationMessagePage.allEmployeesTab.isDisplayed());
    }

    // ------------------cancelMessageScenario---------------------------------

    @And("fills in the mandatory fields")
    public void fillsInTheMandatoryFields() {

        Driver.getDriver().switchTo().frame(appreciationMessagePage.iframeArea);
        appreciationMessagePage.messageContentInput.sendKeys("Thank you!");
        Driver.getDriver().switchTo().parentFrame();
    }

    @And("clicks on the Cancel button")
    public void clicksOnTheCancelButton() {
        BrowserUtils.waitForClickablility(appreciationMessagePage.sendButton,10);
        appreciationMessagePage.cancelButton.click();
    }

    @Then("the appreciation sending process is canceled")
    public void theAppreciationSendingProcessIsCanceled() {
        Assert.assertTrue(!appreciationMessagePage.cancelButton.isDisplayed());

    }
}
