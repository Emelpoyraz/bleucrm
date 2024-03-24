package com.bleucrm.pages;

import com.bleucrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage extends BasePage{


    @FindBy(xpath = "//span[@id='user-name']")
    public WebElement profileName;

    @FindBy(xpath = "//span[.='Log out']")
    public WebElement logoutButton;

    @FindBy(xpath = "//*[contains(@class, 'menu-popup-item menu-popup-no-icon ')]")
    public List<WebElement> nameItem;


}
