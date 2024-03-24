package com.bleucrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AppreciationMessagePage extends BasePage{

    @FindBy(xpath = "(//span[@class='menu-item-link-text'])[1]")
    public WebElement activityStreamBtn;

    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreTab;

    @FindBy(xpath = "(//span[.='Appreciation'])[2]")
    public WebElement appreciationBtn;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframeArea;

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageContentInput;

    @FindBy(xpath = "//div[.='Thank you!']")
    public WebElement successfulAppreciationMsg;

    @FindBy(xpath = "//span[.='The message title is not specified']")
    public WebElement titleErrorMsg;

    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement removeAllEmployeesBtn;

    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement errorRecipientMsg;

    @FindBy(id = "feed-add-post-destination-container")
    public WebElement toInput;

    //@FindBy(id = "blog-submit-button-save")
    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;

    //@FindBy(id = "blog-submit-button-cancel")
    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;

    @FindBy(xpath = "//span[@data-id='UA' ]")
    public WebElement allEmployeesTab;













}
