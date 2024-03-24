package com.bleucrm.step_definitions;

import com.bleucrm.pages.LoginPage;
import com.bleucrm.utilities.ConfigurationReader;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefs {


    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("Login to app in Before method");

    }

    LoginPage loginPage =  new LoginPage();

    @Given("the user logged in as {string}")
    public void the_user_logged_in_as(String userType) {
        //based on input enter that user information
        String username="";
        String password="";

        if(userType.equalsIgnoreCase("hr")){
            username = ConfigurationReader.getProperty("hr_username");
            password = ConfigurationReader.getProperty("hr_password");
        }else if(userType.equalsIgnoreCase("help desk")){
            username = ConfigurationReader.getProperty("help_desk_username");
            password = ConfigurationReader.getProperty("help_desk_password");
        }else if(userType.equalsIgnoreCase("marketing")){
            username = ConfigurationReader.getProperty("marketing_username");
            password = ConfigurationReader.getProperty("marketing_password");
        }
        //send username and password and login
        new LoginPage().login(username,password);
    }

    @Given("the user logged in with username as {string} and password as {string}")
    public void the_user_logged_in_with_username_as_and_password_as(String username, String password) {
      LoginPage loginPage=new LoginPage();
      loginPage.login(username,password);
    }


    @Then("user lands on the {string} successfully")
    public void userLandsOnTheSuccessfully(String homepageUrl) {
        String expectedHomePageLink= ConfigurationReader.getProperty(homepageUrl);
        String actualHomePageLink = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualHomePageLink.contains(expectedHomePageLink));
    }


    @When("user logged in with username as {string} and password as {string}")
    public void userLoggedInWithUsernameAsAndPasswordAs(String usernameType, String passwordType) {

        String username="";
        String password="";

        if(usernameType.equalsIgnoreCase("valid email") && passwordType.equalsIgnoreCase("invalid password")){
            username = ConfigurationReader.getProperty("hr_username");
            password = passwordType.replace(" ","");
        }else if(usernameType.equalsIgnoreCase("invalid email") && passwordType.equalsIgnoreCase("valid password")){
            username = ConfigurationReader.getProperty("hr_username").replace("hr",usernameType.replace(" ",""));
            password = ConfigurationReader.getProperty("hr_password");
        }else if(usernameType.equalsIgnoreCase("invalid email") && passwordType.equalsIgnoreCase("invalid password")){
            username = ConfigurationReader.getProperty("hr_username").replace("hr",usernameType.replace(" ",""));
            password = passwordType.replace(" ","");

        }else if(usernameType.equalsIgnoreCase("email") && passwordType.equalsIgnoreCase("no password")){
            username = ConfigurationReader.getProperty("hr_username");
        }else if(usernameType.equalsIgnoreCase("no email") && passwordType.equalsIgnoreCase("password")){
            password = ConfigurationReader.getProperty("help_desk_password");
        }else if(usernameType.equalsIgnoreCase("no email") && passwordType.equalsIgnoreCase("no password")){
            username = "";
            password ="";
        }
        //send username and password and login
        new LoginPage().login(username,password);

    }

    @Then("user should be able to see error message {string}")
    public void userShouldBeAbleToSeeErrorMessage(String errorMessage) {
        Assert.assertEquals(errorMessage,loginPage.incorrectLoginOrPasswordMessage.getText());
    }

    @Then("user should be able to see remember me box")
    public void userShouldBeAbleToSeeRememberMeBox() {
        Assert.assertTrue(loginPage.rememberMeCheckBox.isDisplayed());
    }

    @When("user clicks Remember me checkbox")
    public void userClicksRememberMeCheckbox() {
        loginPage.rememberMeCheckBox.click();
    }

    @Then("user should be able to see Remember me checkbox clicked")
    public void userShouldBeAbleToSeeRememberMeCheckboxClicked() {
        Assert.assertTrue(loginPage.rememberMeCheckBox.isSelected());
    }

    @Then("user should be able to see password is in bullet signs by default")
    public void userShouldBeAbleToSeePasswordIsInBulletSignsByDefault() {
        Assert.assertEquals(loginPage.password.getAttribute("type"),"password");
    }
}
