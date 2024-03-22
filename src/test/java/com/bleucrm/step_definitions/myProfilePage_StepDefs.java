package com.bleucrm.step_definitions;

import com.bleucrm.pages.MyProfilePage;
import com.bleucrm.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class myProfilePage_StepDefs {

    MyProfilePage myProfilePage = new MyProfilePage();

    @When("user click to user account name")
    public void user_click_to_user_account_name() {

        myProfilePage.userAccount.click();
    }



    @When("user clicks to my profile option")
    public void user_clicks_to_my_profile_option() {
        myProfilePage.MyProfilePage.click();
    }

    @Then("user sees the following options")
    public void user_sees_the_following_options(List<String> expectedOptions) {

        List<String> actualPageOptions = new ArrayList<>();

        for (WebElement eachOption: myProfilePage.profilePageOptions) {
            actualPageOptions.add(eachOption.getText());
        }

        Assert.assertEquals(expectedOptions, actualPageOptions);

    }



    @Then("the user verify that the displayed {string} is the same as the user's account")
    public void theUserVerifyThatTheDisplayedIsTheSameAsTheUserSAccount(String expectedEmail) {

        String actualEmail = myProfilePage.actualEmail.getText();

        Assert.assertEquals(expectedEmail,actualEmail);

    }
}
