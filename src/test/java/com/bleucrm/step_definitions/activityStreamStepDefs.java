package com.bleucrm.step_definitions;

import com.bleucrm.pages.ActivityStreamPage;
import com.bleucrm.pages.BasePage;
import com.bleucrm.pages.LoginPage;
import com.bleucrm.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class activityStreamStepDefs extends BasePage {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    LoginPage loginPage = new LoginPage();

    @Given("user is on the homepage")
    public void user_is_on_the_homepage() {
        loginPage.login("marketing26@cydeo.com","UserUser");
    }

    @When("user sees below five options on Activity stream page")
    public void userSeesBelowFiveOnActivityStreamPage(List<String> expectedOptions) {

        activityStreamPage.opts();
        Assert.assertEquals(expectedOptions, BrowserUtils.getElementsText(activityStreamPage.firstFourOps));
    }

    @And("user clicks more option button")
    public void userClicksMoreOptionButton() {
        activityStreamPage.moreTab.click();
    }

    @Then("user sees below four MoreOptions under the MORE tab")
    public void userSeesBelowFourMoreOptionsUnderTheMORETab(List<String> expectedOptions) {
        userClicksMoreOptionButton();
        Assert.assertEquals(expectedOptions,BrowserUtils.getElementsText(activityStreamPage.moreOptions));
    }


}
