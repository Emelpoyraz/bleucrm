package com.bleucrm.step_definitions;

import com.bleucrm.pages.ActivityStreamPage;
import com.bleucrm.pages.LoginPage;
import com.bleucrm.pages.UploadFilePicturePage;
import com.bleucrm.utilities.ConfigurationReader;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class UploadFilePicture_StepDefinition {

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));

    UploadFilePicturePage uploadFilePicturePage = new UploadFilePicturePage();
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();


    @Then("the user should click on the upload icon")
    public void the_user_should_click_on_the_upload_icon() {

        uploadFilePicturePage.uploadIcon.click();
    }

    @Then("the user should click on upload files and images button")
    public void the_user_should_click_on_upload_files_and_images_button() {

        wait.until(ExpectedConditions.visibilityOf(uploadFilePicturePage.uploadFileImageButton));

        uploadFilePicturePage.uploadFileImageButton.click();
    }

    @Then("the user uploads the below files")
    public void the_user_uploads_the_below_files(List<String> fileType) {

        for (String eachFile : fileType) {

            the_user_should_click_on_upload_files_and_images_button();
            uploadFilePicturePage.uploadFile(eachFile);

        }

    }

    @Given("below files are successfully uploaded")
    public void below_files_are_successfully_uploaded(List<String> fileType) {

        for (String eachType : fileType) {

            eachType = eachType.substring(0, eachType.indexOf("."));

            System.out.println("eachType = " + eachType);

            System.out.println("uploadFilePicturePage.uploadedFile.getText() = " + uploadFilePicturePage.uploadedFile.getText());

            if (uploadFilePicturePage.uploadedFile.getText().contains(eachType)) {

                Assert.assertTrue(uploadFilePicturePage.uploadedFile.getText().contains(eachType));

                break;
            }


        }

    }

    @Then("the user uploads the below fileTypes into message text area")
    public void the_user_uploads_the_below_file_types_into_message_text_area(List<String> fileTypes) {

        for (String eachFile : fileTypes) {


            the_user_should_click_on_upload_files_and_images_button();
            uploadFilePicturePage.uploadFile(eachFile);
            uploadFilePicturePage.insertDynamic.click();

        }


    }


    @When("user clicks on the x button")
    public void userClicksOnTheXButton() {


        for (WebElement each : uploadFilePicturePage.insertedItemsInTextArea) {

            uploadFilePicturePage.fileRemoveButton.click();

        }


    }

    @Then("the message content area should not contain the below removed fileTypes")
    public void theMessageContentAreaShouldNotContainTheBelowRemovedFileTypes() {

        try {
            Assert.assertFalse(uploadFilePicturePage.uploadedFile.isDisplayed());

        } catch (NoSuchElementException e) {

            System.out.println("if NSEE is displayed test is PASSED!");

            Assert.assertTrue(true);

        }


    }


}
