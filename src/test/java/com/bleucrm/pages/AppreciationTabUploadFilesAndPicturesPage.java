package com.bleucrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;

public class AppreciationTabUploadFilesAndPicturesPage extends BasePage{

    @FindBy(xpath = "//body[@contenteditable='true']")
    public WebElement messageContentArea;

    @FindBy(xpath = "(//span[@title='Upload files'])[1]")
    public WebElement attachmentButton;

    @FindBy(xpath = "(//input[@multiple='multiple'])[1]")
    public WebElement uploadFilesAndImagesButton;

    @FindBy(xpath = "//span[@class='insert-btn-text']")
    public WebElement insertInTextButton;

    @FindBy(xpath = "//*[contains(@id, 'bxid')]")
    public List<WebElement> insertedItems;

    @FindBy(xpath = "//iframe[@class='bx-editor-iframe']")
    public WebElement iframe;

    @FindBy(xpath = "//span[@class='del-but']")
    public WebElement removeButton;

    @FindBy(xpath = "//span[@class='f-wrap']")
    public WebElement readyToInsertItem ;

    @FindBy(xpath = "//span[contains(@id,'feed-add-post-form-tab')]")
    public List<WebElement> activityStreamButtons;


    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreTab;

    @FindBy(className = "menu-popup-item-text")
    public List<WebElement> moreOptions;

    @FindBy(xpath = "(//span[@class='menu-popup-item-text'])[2]")
    public WebElement appreciationButton;


    public List<WebElement> firstFourOps = new ArrayList<>();

    public void opts() {

        for (int i = 0; i < activityStreamButtons.size() / 2; i++) {
            firstFourOps.add(activityStreamButtons.get(i));
        }
        firstFourOps.add(moreTab);
    }

    public void ActivityStreamOptions(String requiredTabName) {
        List<WebElement> allOptions = new ArrayList<>();
        opts();
        allOptions.addAll(firstFourOps);
        moreTab.click();
        allOptions.addAll(moreOptions);

        for (WebElement eachOption : allOptions) {
            System.out.println(eachOption.getText());
            if (eachOption.getText().equalsIgnoreCase(requiredTabName)) {
                eachOption.click();
                break;
            }
        }

    }

    public void selectFile(String fileName) {

        String projectPath = System.getProperty("user.dir");

        //the path of the file
        String filePathPNG = "src/test/resources/filesToUpload/"+fileName;

        //it concatenates the project path and the file path to obtain the full path of the PNG file
        String fullPathJPG = projectPath + "/" + filePathPNG;
        uploadFilesAndImagesButton.sendKeys(fullPathJPG);


    }
}
