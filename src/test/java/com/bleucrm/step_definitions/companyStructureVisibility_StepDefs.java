package com.bleucrm.step_definitions;

import com.bleucrm.pages.ActivityStreamPage;
import com.bleucrm.pages.CompanyStructurePage;
import com.bleucrm.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class companyStructureVisibility_StepDefs {

    CompanyStructurePage companyStructurePage = new CompanyStructurePage();

    ActivityStreamPage activityStreamPage = new ActivityStreamPage();


    @When("user click on Employees page")
    public void user_click_on_employees_page() {

        activityStreamPage.clickMainMenuOption("Employees");

    }

    @Then("user sees the Company Structure module displayed")
    public void userSeesTheCompanyStructureModuleDisplayed() {


        Assert.assertTrue(companyStructurePage.companyStructureModule.isDisplayed());

    }

    @Then("the hr user sees the ADD DEPARTMENT button displayed")
    public void theHrUserSeesTheADDDEPARTMENTButtonDisplayed() {

        Assert.assertTrue(companyStructurePage.addDepartmentButton.isDisplayed());

    }

    @Then("the help desk user does not see the ADD DEPARTMENT button displayed")
    public void theHelpDeskUserDoesNotSeeTheADDDEPARTMENTButtonDisplayed() {


        try{

            Assert.assertFalse(companyStructurePage.addDepartmentButton.isDisplayed());
        }catch (NoSuchElementException n){
            System.out.println("NoSuchElementException is thrown. It means that the ADD DEPARTMENT button is not on the page.");

        }


    }

    @Then("the marketing user does not see the ADD DEPARTMENT button displayed")
    public void theMarketingUserDoesNotSeeTheADDDEPARTMENTButtonDisplayed() {

        try{

            Assert.assertFalse(companyStructurePage.addDepartmentButton.isDisplayed());
        }catch (NoSuchElementException n){
            System.out.println("NoSuchElementException is thrown. It means that the ADD DEPARTMENT button is not on the page.");

        }


    }
}
