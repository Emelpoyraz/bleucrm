package com.bleucrm.pages;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class DrivePage extends BasePage{

   @FindBy(xpath = "//a[@class='main-buttons-item-link']")
    public List<WebElement> DrivePageModules;


}
