package com.bleucrm.step_definitions;

import com.bleucrm.pages.BasePage;
import com.bleucrm.pages.CreatePollPage;
import com.bleucrm.pages.SendMessagePage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class CreatePoll_StepDefinition {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    CreatePollPage createPollPage = new CreatePollPage();
    SendMessagePage sendMessagePage = new SendMessagePage();


    @When("the user clicks on the Poll tab")
    public void the_user_clicks_on_the_poll_tab() {
        createPollPage.pollTab.click();
    }


    @And("the user enters the message title below")
    public void theUserEntersTheMessageTitleBelow(List<String> msg) {


        Driver.getDriver().switchTo().frame(sendMessagePage.messageIframeArea);

        sendMessagePage.messageContentArea.sendKeys(msg.get(0));

        Driver.getDriver().switchTo().parentFrame();
    }

    @Then("the user adds the question below")
    public void theUserAddsTheQuestionBelow(List<String> quest) {

        createPollPage.questionInput.sendKeys(quest.get(0));
    }

    @Then("the user adds the answer below")
    public void theUserAddsTheAnswerBelow(List<String> answer) {

        createPollPage.asnwer1Input.sendKeys(answer.get(0));
    }

    @And("the user clicks on add question button")
    public void theUserClicksOnAddQuestionButton() {

        createPollPage.addQuestionButton.click();
    }

    @And("the user clicks on Allow multiple choice button")
    public void theUserClicksOnAllowMultipleChoiceButton() {

        createPollPage.allowMultipleChoiceButton.click();

    }

    @And("the user does not enters a message title")
    public void theUserDoesNotEntersAMessageTitle() {

        Driver.getDriver().switchTo().frame(sendMessagePage.messageIframeArea);

        sendMessagePage.messageContentArea.clear();

        Driver.getDriver().switchTo().parentFrame();

    }

    @Then("the error message below should be displayed")
    public void theErrorMessageBelowShouldBeDisplayed(List<String> errorTitle) {

        //wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='feed-add-info-text']")));

        wait.until(ExpectedConditions.visibilityOf(createPollPage.errorMessageTitle));


        Assert.assertEquals(errorTitle.get(0), createPollPage.errorMessageTitle.getText());
    }

    @And("the user does not choose a recipient")
    public void theUserDoesNotChooseARecipient() {

        sendMessagePage.removeAllEmployeesFirst.click();
    }

    @And("the user enters a {string}")
    public void theUserEntersA(String quest) {

        createPollPage.questionInput.sendKeys(quest);

        BrowserUtils.waitFor(3);
    }

    @And("the user does not enter an answer")
    public void theUserDoesNotEnterAnAnswer() {

        createPollPage.asnwer1Input.clear();
    }

    @Then("an error message below should be displayed")
    public void anErrorMessageBelowShouldBeDisplayed(List<String> mesg) {

        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='feed-add-info-text']")));

        System.out.println("createPollPage.errorQuestion.getText() = " + createPollPage.errorQuestion.getText());

        System.out.println("mesg.get(0) = " + mesg.get(0));

        Assert.assertTrue(createPollPage.errorQuestion.getText().contains(mesg.get(0)));
    }

    @And("the user does not enter a question")
    public void theUserDoesNotEnterAQuestion() {

        createPollPage.questionInput.clear();
    }
}
