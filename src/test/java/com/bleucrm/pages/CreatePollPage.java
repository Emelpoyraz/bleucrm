package com.bleucrm.pages;

import com.bleucrm.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePollPage extends BasePage {

    public CreatePollPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }



    @FindBy(xpath = "(//span[.='Poll'])[2]")
    public WebElement pollTab;


    @FindBy(xpath = "//input[@id='question_0']")
    public WebElement questionInput;


    @FindBy(xpath = "(//input[@id='answer_0__0_'])[1]")
    public WebElement asnwer1Input;



    @FindBy(xpath = "//a[.='Add question']")
    public WebElement addQuestionButton;


    @FindBy(xpath = "//input[@id='multi_0']")
    public WebElement allowMultipleChoiceButton;


    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement errorMessageTitle;


    @FindBy(xpath = "//span[@class='feed-add-info-text']")
    public WebElement errorQuestion;


    @FindBy(xpath = "//span[.='Please specify at least one person.']")
    public WebElement errorRecipient;



}
