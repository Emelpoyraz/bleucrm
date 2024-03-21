package com.bleucrm.step_definitions;

import com.bleucrm.pages.ActivityStreamPage;
import com.bleucrm.pages.DrivePage;
import com.bleucrm.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class DriveStepDefs {

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();
    DrivePage drivePage = new DrivePage();

    @When("user navigates to {string} page")
    public void user_navigates_to_page(String pageName) {
        activityStreamPage.clickMainMenuOption(pageName);
    }
    @Then("user sees below six modules on the Drive page.")
    public void user_sees_below_six_modules_on_the_page(List<String> expectedModules) {

        List<String> actualModules= new ArrayList<>();

        for (WebElement module : drivePage.DrivePageModules) {
            if (!(module.getText().equalsIgnoreCase("more")) ){
                actualModules.add(module.getText());
            }
        }

        Assert.assertEquals(actualModules,expectedModules);

    }
}
