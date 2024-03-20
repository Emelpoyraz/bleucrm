package com.bleucrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyProfilePage extends BasePage{

  @FindBy(id = "user-block")
    public WebElement userAccount;

  @FindBy(xpath = "//span[.='My Profile']")
    public WebElement myProfileOption;

  @FindBy(css = ".profile-menu-item")
  public List<WebElement> allOptions;

  @FindBy(css = "tr td.user-profile-nowrap-second")
  public WebElement actualEmail;




}
