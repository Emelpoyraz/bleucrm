package com.bleucrm.step_definitions;

import com.bleucrm.pages.ActivityStreamPage;
import com.bleucrm.pages.SendMessagePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.WebDriverWait;

import static com.bleucrm.utilities.BrowserUtils.waitFor;
import static com.bleucrm.utilities.BrowserUtils.waitForVisibility;
import static com.bleucrm.utilities.Driver.getDriver;

public class LinkAttachmentAndNavigateToUrl_StepDefinitions {

    SendMessagePage sendMessagePage = new SendMessagePage();
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();

    @When("the user clicks on the message tab")
    public void the_user_clicks_on_the_tab() {

        sendMessagePage.messageTab.click();
    }

    @And("the user clicks on the Add Link Button")
    public void the_user_clicks_on_the_Add_Link_Button() {

        sendMessagePage.addLinkButton.click();
    }

    @And("the user enters {string} and {string}")
    public void the_user_enters_and(String linkText, String link) {
        sendMessagePage.linkTextBox.sendKeys(linkText);
        sendMessagePage.linkUrlBox.sendKeys(link);
    }

    @And("the user clicks on the Save button")
    public void the_user_clicks_on_the_Save_button() {
        waitForVisibility(sendMessagePage.linkSaveButton, 10).click();

    }

    @And("the user clicks on the Send button")
    public void the_user_clicks_on_the_Send_button() {
        waitForVisibility(sendMessagePage.sendButton, 10).click();

    }

    @Then("the {string} should be displayed on the activity stream")
    public void the_message_should_be_displayed_on_the_activity_stream(String linkText) {
        waitFor(2);
        Assert.assertTrue(activityStreamPage.findLinkInMessage(linkText));
    }

    @Then("the user clicks on the created Link {string}")
    public void the_user_clicks_on_the_created_Link(String createdLink) {

        activityStreamPage.clickMessageLink(createdLink);

    }

    @Then("the {string} should be displayed")
    public void the_should_be_displayed(String title) {
        String mainWindowHandle = getDriver().getWindowHandle();
        for(String windowHandle: getDriver().getWindowHandles()) {
            if (!windowHandle.equals(mainWindowHandle)) {
                getDriver().switchTo().window(windowHandle);
            }
        }
        Assert.assertEquals(title,getDriver().getTitle());
    }





}