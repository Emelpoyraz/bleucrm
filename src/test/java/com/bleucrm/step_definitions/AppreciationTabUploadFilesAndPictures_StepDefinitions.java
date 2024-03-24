package com.bleucrm.step_definitions;

import com.bleucrm.pages.ActivityStreamPage;
import com.bleucrm.pages.AppreciationTabUploadFilesAndPicturesPage;
import com.bleucrm.utilities.BrowserUtils;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AppreciationTabUploadFilesAndPictures_StepDefinitions {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    AppreciationTabUploadFilesAndPicturesPage uploadFilesAndPicturesPage = new AppreciationTabUploadFilesAndPicturesPage();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    @When("user clicks {string}")
    public void user_clicks(String PageName) {
        activityStreamPage.clickMainMenuOption(PageName);
    }

    @When("user clicks More in activity stream")
    public void user_clicks_More_in_activity_stream() {
        Driver.getDriver().navigate().refresh();
        activityStreamPage.moreTab.click();

    }

    @When("user clicks {string} under more in activity stream")
    public void user_clicks_under_more_in_activity_stream(String tabName) {

        activityStreamPage.ActivityStreamOptions(tabName);
    }

    @When("user enter a message {string}")
    public void user_enter_a_message(String message) {
        Driver.getDriver().switchTo().frame(uploadFilesAndPicturesPage.iframe);
        uploadFilesAndPicturesPage.messageContentArea.sendKeys(message);
        Driver.getDriver().switchTo().defaultContent();
    }

    @When("user clicks attachment button")
    public void user_clicks_attachment_button() {
        uploadFilesAndPicturesPage.attachmentButton.click();
    }

    @When("user upload the files {string}")
    public void user_upload_the_files(String fileName) {
        uploadFilesAndPicturesPage.selectFile(fileName);
    }

    @Then("user should be able to see {string} in the uploaded files")
    public void user_should_be_able_to_see_in_the_uploaded_files(String expectedFileName) {
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[@class='f-wrap']")));

        //wait.until(ExpectedConditions.elementToBeClickable(uploadFilesAndPicturesPage.readyToInsertItem));
        String actualFileName = uploadFilesAndPicturesPage.readyToInsertItem.getText();
        Assert.assertTrue(actualFileName.contains(expectedFileName));
    }

    @And("user clicks insert in text button")
    public void userClicksInsertInTextButton() {
        uploadFilesAndPicturesPage.insertInTextButton.click();
    }

    @Then("user should be able to see {string} in the message")
    public void userShouldBeAbleToSeeInTheMessage(String expectedText) {
        Driver.getDriver().switchTo().frame(uploadFilesAndPicturesPage.iframe);
        //Driver.getDriver().switchTo().frame(appreciationPage.messageContentArea);

        for (WebElement eachItem : uploadFilesAndPicturesPage.insertedItems) {
            if (expectedText.contains("jpg") || expectedText.contains("png")){
                System.out.println(eachItem.getAttribute("src").toString());
            }

            if (expectedText.contains("docx") || expectedText.contains("txt")|| expectedText.contains("pdf")){
                BrowserUtils.sleep(2);
                Assert.assertTrue(eachItem.getText().contains(expectedText));//txt, pdf, docx

            }else if (expectedText.contains("jpg") || expectedText.contains("png")){
                Assert.assertTrue(eachItem.getAttribute("src").contains(expectedText.substring(0,expectedText.indexOf("."))));
            }
        }
        Driver.getDriver().switchTo().defaultContent();

    }

    @And("user clicks RemoveDelete button")
    public void userClicksRemoveDeleteButton() {
        uploadFilesAndPicturesPage.removeButton.click();
    }

    @Then("user should not be able to see {string} in the uploaded files")
    public void userShouldNotBeAbleToSeeInTheUploadedFiles(String fileType) {
        try {
            //assertFalse method is expecting a "false" boolean value to PASS the test.
            Assert.assertFalse(uploadFilesAndPicturesPage.readyToInsertItem.isDisplayed());

        } catch (NoSuchElementException n) {
            //n.printStackTrace();
            System.out.println("NoSuchElementException is thrown. It means that "+fileType+" is not on the page.");
            Assert.assertTrue(true);
        }
    }
}
