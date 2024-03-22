package com.bleucrm.pages;

import com.bleucrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class EmployeesPage extends BasePage{

    @FindBy(xpath = "//*[@id=\"bx_left_menu_menu_company\"]/a/span")
    public WebElement EmployeesButton;

    @FindBy(xpath = "//div[@id='top_menu_id_company']//span[@class='main-buttons-item-text']/span[2]")
    public static List<WebElement> EmployeesModules;

    @FindBy(xpath = "//div[@class='pagetitle']//span[text()='Company Structure']")
    public WebElement CompanyStructure;
}
