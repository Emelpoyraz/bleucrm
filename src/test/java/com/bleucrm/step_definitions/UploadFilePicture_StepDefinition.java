package com.bleucrm.step_definitions;

import com.bleucrm.pages.ActivityStreamPage;
import com.bleucrm.pages.LoginPage;
import com.bleucrm.pages.UploadFilePicturePage;
import com.bleucrm.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class UploadFilePicture_StepDefinition {


    UploadFilePicturePage uploadFilePicturePage = new UploadFilePicturePage();
    ActivityStreamPage activityStreamPage = new ActivityStreamPage();



    @When("the user clicks on the {string} tab")
    public void theUserClicksOnTheTab(String messageTab) {

        activityStreamPage.ActivityStreamOptions(messageTab);

    }

    @Then("the user uploads the below files")
    public void theUserUploadsTheBelowFileTypes(List<String> expectedFiles) {



        for (String eachFile : expectedFiles) {

            theUserShouldClickOnUploadFilesAndImagesButton();
            uploadFilePicturePage.uploadFile(eachFile);
            uploadFilePicturePage.insertDynamic.click();

        }


    }




    @Then("the user should click on the upload icon")
    public void theUserShouldClickOnTheUploadIcon() {


        uploadFilePicturePage.uploadIcon.click();

    }

    @Then("the user should click on upload files and images button")
    public void theUserShouldClickOnUploadFilesAndImagesButton() {

        uploadFilePicturePage.uploadFileImageButton.click();
    }





    @Given("Given the {string} successfully uploads a {string}")
    public void givenTheSuccessfullyUploadsA(String arg0, String arg1) {
    }

    @Then("the user clicks on the insert button to upload the below fileTypes into message text area")
    public void theUserClicksOnTheInsertButtonToUploadTheBelowFileTypesIntoMessageTextArea() {
    }

    @Given("the {string} inserted below fileTypes successfully into message text area")
    public void theInsertedBelowFileTypesSuccessfullyIntoMessageTextArea(String arg0) {
    }

    @When("user clicks on the x button")
    public void userClicksOnTheXButton() {
    }

    @Then("the message content area should not contain the below removed fileTypes")
    public void theMessageContentAreaShouldNotContainTheBelowRemovedFileTypes() {
    }

}
