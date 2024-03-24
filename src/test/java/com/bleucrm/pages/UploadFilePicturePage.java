package com.bleucrm.pages;

import com.bleucrm.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class UploadFilePicturePage {

    public UploadFilePicturePage() {

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


    @FindBy(xpath = "//span[@id='bx-b-uploadfile-blogPostForm']")
    public WebElement uploadIcon;


    @FindBy(xpath = "(//td[@colspan='0'])[1]")
    public WebElement uploadFileImageButton;


    @FindBy(xpath = "//span[@class='files-text']")
    public WebElement uploadedFile;



    public void uploadFile(String fileType) {


        //retrieves the current project path where the application is running, ensuring that the correct project path is obtained regardless of the environment

        String projectPath = System.getProperty("user.dir");

        //the path of the file
        String filePath = "src/test/resources/filesToUpload/" + fileType;

        //it concatenates the project path and the file path to obtain the full path of the PNG file
        String fullFilePath = projectPath + "/" + filePath;

        WebElement fileInput = Driver.getDriver().findElement(By.xpath("(//input[@type='file'])[1]"));

        fileInput.sendKeys(fullFilePath);

    }


    @FindBy(xpath = "//span[contains(@id,'check-in-text-n')]")
    public WebElement insertDynamic;


    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement fileRemoveButton;



    @FindBy(xpath = "//span[contains(@id, 'bxid')]")
    public List<WebElement> insertedItemsInTextArea;




}


