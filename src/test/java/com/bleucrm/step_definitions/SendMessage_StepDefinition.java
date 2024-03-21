package com.bleucrm.step_definitions;

import com.bleucrm.pages.LoginPage;
import com.bleucrm.pages.SendMessagePage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class SendMessage_StepDefinition {

    LoginPage loginPage = new LoginPage();
    SendMessagePage sendMessagePage = new SendMessagePage();

    @Given("the user with username {string} and password {string} is on the Active Stream page")
    public void the_user_with_username_and_password_is_on_the_active_stream_page(String username, String Password) {

        loginPage.userName.sendKeys(username);
        loginPage.password.sendKeys(Password);
        loginPage.submit.click();

    }
    @When("the user clicks on the Message tab")
    public void the_user_clicks_on_the_message_tab() {

        sendMessagePage.messageTab.click();

    }
    @Then("the user should see fields for Message Content")
    public void the_user_should_see_fields_for_message_content() {


        Driver.getDriver().switchTo().frame(sendMessagePage.messageIframeArea);

        Assert.assertTrue(sendMessagePage.messageContentArea.isDisplayed());

        Driver.getDriver().switchTo().parentFrame();

    }
    @Then("the user should see All employees by default as Recipient")
    public void the_user_should_see_all_employees_by_default_as_recipient() {
        Assert.assertTrue(sendMessagePage.AllEmployees.isDisplayed());
    }

    @Then("the user enters {string} in the message content field")
    public void the_user_enters_in_the_message_content_field(String message) {

        Driver.getDriver().switchTo().frame(sendMessagePage.messageIframeArea);

        sendMessagePage.messageContentArea.sendKeys("Hello, Team!");

        Driver.getDriver().switchTo().parentFrame();

        Assert.assertTrue(sendMessagePage.AllEmployees.isDisplayed());

    }
    @Then("clicks on the send button")
    public void clicks_on_the_send_button() {

        sendMessagePage.sendButton.click();
        BrowserUtils.sleep(2);
    }
    @Then("the message should be sent successfully to the specified recipient\\(s)")
    public void the_message_should_be_sent_successfully_to_the_specified_recipient_s() {

        Assert.assertTrue(sendMessagePage.proofOfSucessfullMessage.isDisplayed());
    }

    @And("the user tries to send a message without filling mandatory field of message content area")
    public void theUserTriesToSendAMessageWithoutFillingMandatoryFieldOfMessageContentArea() {

        sendMessagePage.messageTab.click();

        sendMessagePage.sendButton.click();

    }

    @Then("title error message {string} should be displayed")
    public void titleErrorMessageShouldBeDisplayed(String expectedErrorMessage) {

        Assert.assertEquals("The message title is not specified", sendMessagePage.errorContentMessage.getText());


    }

    @And("the user tries to send a message without filling mandatory field of recipient area")
    public void theUserTriesToSendAMessageWithoutFillingMandatoryFieldOfRecipientArea() {


        sendMessagePage.removeAllEmployeesFirst.click();

        sendMessagePage.sendButton.click();

    }

    @Then("recipient error message {string} should be displayed")
    public void recipientErrorMessageShouldBeDisplayed(String expectedErrorMessage) {

        Assert.assertEquals(expectedErrorMessage, sendMessagePage.errorRecipientMessage.getText());


    }

    @When("the user clicks on the {string} button before sending the message")
    public void theUserClicksOnTheButtonBeforeSendingTheMessage(String arg0) {

        sendMessagePage.cancelButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("the message should not be sent")
    public void theMessageShouldNotBeSent() {

        Assert.assertTrue(!sendMessagePage.cancelButton.isDisplayed());
    }


    @When("user clicks on the {string} button before sending the message")
    public void userClicksOnTheButtonBeforeSendingTheMessage(String arg0) {

        sendMessagePage.cancelButton.click();
        BrowserUtils.sleep(3);
    }

    @Then("message should not be sent")
    public void messageShouldNotBeSent() {

        Assert.assertTrue(!sendMessagePage.cancelButton.isDisplayed());

    }
}
