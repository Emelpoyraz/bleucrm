package com.bleucrm.step_definitions;

import com.bleucrm.pages.LoginPage;
import com.bleucrm.pages.UploadFilePicturePage;
import com.bleucrm.utilities.ConfigurationReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadFilePicture_StepDefinition {


    LoginPage loginPage = new LoginPage();
    UploadFilePicturePage uploadFilePicturePage = new UploadFilePicturePage();

    @Given("the user with {string} logs in and is on the Active Stream page")
    public void the_user_with_logs_in_and_is_on_the_active_stream_page(String userType) {

        if(userType.equals("hr")){

            loginPage.userName.sendKeys(ConfigurationReader.getProperty("hr_username"));

            loginPage.password.sendKeys(ConfigurationReader.getProperty("hr_password"));

            loginPage.submit.click();

        }else if(userType.equals("helpdesk")){

            loginPage.userName.sendKeys(ConfigurationReader.getProperty("help_desk_username"));

            loginPage.password.sendKeys(ConfigurationReader.getProperty("help_desk_password"));

        }else{
            loginPage.userName.sendKeys(ConfigurationReader.getProperty("marketing_username"));

            loginPage.password.sendKeys(ConfigurationReader.getProperty("marketing_password"));

        }
    }


    @When("the user clicks on the Message tab")
    public void the_user_clicks_on_the_message_tab() {

        uploadFilePicturePage.messageTab.click();
    }

    @Then("the user should click on the upload icon")
    public void the_user_should_click_on_the_upload_icon() {

        uploadFilePicturePage.uploadIcon.click();
    }
    @Then("the user should click on upload files and images button")
    public void the_user_should_click_on_upload_files_and_images_button() {

        uploadFilePicturePage.uploadFileImageButton.click();
    }
    @Then("the user uploads {string} and and see it under upload files and images button")
    public void the_user_uploads_and_and_see_it_under_upload_files_and_images_button(String fileType) {

        uploadFilePicturePage.uploadedFile.getText().endsWith(fileType);


    }


}
