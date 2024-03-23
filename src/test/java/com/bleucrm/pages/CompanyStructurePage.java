package com.bleucrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CompanyStructurePage extends BasePage{

    @FindBy(className = "main-buttons-item-text-title")
    public WebElement companyStructureModule;

    @FindBy(xpath = "//span[.='Add department']")
    public WebElement addDepartmentButton;


}
