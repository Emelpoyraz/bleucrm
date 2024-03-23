package com.bleucrm.step_definitions;

import com.bleucrm.pages.BasePage;
import com.bleucrm.pages.EmployeesPage;
import com.bleucrm.utilities.BrowserUtils;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class EmployeesStepDefs{

    EmployeesPage employeesPage = new EmployeesPage();

    @When("The user clicks the Employees button")
    public void the_user_clicks_the_employees_button() {

        employeesPage.EmployeesButton.click();
    }

    @When("The user sees the modules Employees")
    public void the_user_sees_the_modules_employees(List<String> expectedModules) {


        Assert.assertEquals(expectedModules, BrowserUtils.getElementsText(EmployeesPage.EmployeesModules));


    }

    @When("The user sees the Company Structure")
    public void the_user_sees_the_company_structure() {
       employeesPage.CompanyStructure.isDisplayed();
    }

}
