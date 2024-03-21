package com.bleucrm.step_definitions;

import com.bleucrm.pages.LoginPage;
import com.bleucrm.pages.UploadFilePicturePage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class UploadFilePicture_StepDefinition {


    LoginPage loginPage = new LoginPage();
    UploadFilePicturePage uploadFilePicturePage = new UploadFilePicturePage();


    @Given("the user with username {string} and with password {string} logs in and is on the Active Stream page")
    public void the_user_with_username_and_with_password_logs_in_and_is_on_the_active_stream_page(String UserName, String Password) {

        loginPage.userName.sendKeys(UserName);
        loginPage.password.sendKeys(Password);
        loginPage.submit.click();

    }


    @When("the user clicks on the Message tab")
    public void the_user_clicks_on_the_message_tab() {



    }


    @Then("the user should see and click on the upload icon")
    public void the_user_should_see_and_click_on_the_upload_icon() {

    }

    @Then("the user should see and click on upload files and images button")
    public void the_user_should_see_and_click_on_upload_files_and_images_button() {

    }

    @Then("the user should be able to upload a supported {string} and and see it under upload files and images button")
    public void the_user_should_be_able_to_upload_a_supported_and_and_see_it_under_upload_files_and_images_button(String string) {

    }



}
