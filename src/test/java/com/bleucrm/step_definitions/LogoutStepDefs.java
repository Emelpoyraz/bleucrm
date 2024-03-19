package com.bleucrm.step_definitions;

import com.bleucrm.pages.HomePage;
import com.bleucrm.utilities.BrowserUtils;
import org.junit.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.List;

public class LogoutStepDefs {

    HomePage homePage = new HomePage();

    @When("The user clicks the userName button")
    public void the_user_clicks_the_user_name_button() {
        homePage.profileName.click();
    }

    @When("The user clicks the logout button")
    public void the_user_clicks_the_logout_button() {
        homePage.logoutButton.click();
    }

    @Then("The User sees below list")
    public void the_user_sees_below_list(List<String> expectedOptions) {

        if (expectedOptions.size() == homePage.nameItem.size()) {
            System.out.println("The user sees 5 options under the profile name.");
        } else {
            System.out.println("The user does NOT see 5 options under the profile name.");
        }

        Assert.assertEquals(expectedOptions, BrowserUtils.getElementsText(homePage.nameItem));


    }
}


