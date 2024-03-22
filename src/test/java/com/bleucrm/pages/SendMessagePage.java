package com.bleucrm.pages;

import com.bleucrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SendMessagePage {

    public SendMessagePage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "//a[@title='Activity Stream']")
    public WebElement activityStreamPage;


    @FindBy(xpath = "(//span[.='Message'])[2]")
    public WebElement messageTab;


    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement messageIframeArea;


    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageContentArea;


    @FindBy(xpath = "(//a[.='Add persons, groups or department'])[1]")
    public WebElement addRecipients;


    @FindBy(xpath = "//span[@class='feed-add-post-del-but']")
    public WebElement removeAllEmployeesFirst;


    @FindBy(xpath = "//a[.='Add more']")
    public WebElement addMore;

    @FindBy(xpath = "(//span[.='All employees'])[1]")
    public WebElement AllEmployees;


    @FindBy(xpath = "//button[@id='blog-submit-button-save']")
    public WebElement sendButton;


    @FindBy(xpath = "(//div[.='Hello, Team!'])[1]")
    public WebElement proofOfSucessfullMessage;


    @FindBy(xpath = "//div/span[.='The message title is not specified']")
    public WebElement errorContentMessage;


    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement errorRecipientMessage;



    @FindBy(xpath = "//button[@id='blog-submit-button-cancel']")
    public WebElement cancelButton;


    @FindBy(xpath = "//div/span[.='Send message …']")
    public WebElement notSentMessageVerification;

    @FindBy(xpath = "//span[@title='Link']")
    public WebElement addLinkButton;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-text")
    public WebElement linkTextBox;

    @FindBy(id = "linkidPostFormLHE_blogPostForm-href")
    public WebElement linkUrlBox;

    @FindBy(id = "undefined")
    public WebElement linkSaveButton;




}
