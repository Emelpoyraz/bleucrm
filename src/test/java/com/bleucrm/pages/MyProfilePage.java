package com.bleucrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MyProfilePage extends BasePage{

  @FindBy(id = "user-block")
    public WebElement userAccount;

  @FindBy(css = "tr td.user-profile-nowrap-second")
  public WebElement actualEmail;


  @FindBy(xpath = "//span[.='My Profile']")
  public WebElement MyProfilePage;

  @FindBy(xpath = "//a[contains(@class,'profile-menu-item')]")
  public List<WebElement> profilePageOptions;




}
