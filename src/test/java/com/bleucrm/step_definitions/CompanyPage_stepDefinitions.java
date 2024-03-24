package com.bleucrm.step_definitions;

import com.bleucrm.pages.CompanyPage;
import com.bleucrm.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CompanyPage_stepDefinitions {
    

    CompanyPage companyPage = new CompanyPage();

    @When("user click on the Company button")
    public void user_click_on_the_company_button() {
        companyPage.companyBtn.click();

       /* Actions actions = new Actions(Driver.getDriver());
        actions.keyDown(Keys.CONTROL)
                .sendKeys(Keys.SUBTRACT)
                .keyUp(Keys.CONTROL)
                .perform();

        */
    }

    @Then("user sees the following modules")
    public void user_sees_the_following_modules(List<String> expectedCompanyModules) {

        List<String> actualCompanyModules = new ArrayList<>();

        /*Dimension windowSize = Driver.getDriver().manage().window().getSize();;
        int width = windowSize.getWidth();
        int height = windowSize.getHeight();
        System.out.println("size: " + width + "x" + height); // size: 1366x663
         */

        /*Dimension newSize = new Dimension(1280,800);
        Driver.getDriver().manage().window().setSize(newSize);
         */

        for (WebElement eachCompanyModule : companyPage.allCompanyModules) {
            //actualCompanyModules.add(eachCompanyModule.getText());

            if (!(eachCompanyModule.getText().isEmpty())) { // Skip empty strings
                actualCompanyModules.add(eachCompanyModule.getText());
            }

        }

        /*if (companyPage.companyModuleMore.isDisplayed()) {
            String moreModuleText = companyPage.companyModuleMore.getText().trim();
            if (!moreModuleText.isEmpty()) {
                actualCompanyModules.add(moreModuleText);
            }
        }

         */

        companyPage.companyModuleMore.click();
        actualCompanyModules.add(companyPage.businessNewsModule.getText());
        actualCompanyModules.add(companyPage.companyModuleMore.getText());

        Assert.assertEquals(expectedCompanyModules,actualCompanyModules);

        }


        //test result:
    // Expected :[Official Information, Our Life, About Company, Photo Gallery, Video, Career, Business News (RSS), More]
    //Actual   :[Official Information, Our Life, About Company, Photo Gallery, Video, Career, , More]




    }








