package com.bleucrm.pages;

import com.bleucrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class CompanyPage extends BasePage {


    @FindBy(xpath = "//a[@title='Company']")
    public WebElement companyBtn;

    //public void List<String> getCompanyModulesName(){
       // List<String> companyModules = new ArrayList<>();
       // List<WebElement> modules = Driver.getDriver().findElements();

    @FindBy(css = ".main-buttons-item-text-title")
    public List<WebElement> allCompanyModules;

    @FindBy(xpath = "//span[.='More']")
    public WebElement companyModuleMore;

    @FindBy(xpath = "(//span[.='Business News (RSS)'])[2]")
    public WebElement businessNewsModule;









    }













