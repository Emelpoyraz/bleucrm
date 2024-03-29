package com.bleucrm.pages;

import com.bleucrm.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class ActivityStreamPage extends BasePage{

    @FindBy(xpath = "//span[@class='menu-item-link-text']")
    public List<WebElement> mainMenuOptions;


    @FindBy(xpath = "//span[contains(@id,'feed-add-post-form-tab')]")
    public List<WebElement> activityStreamButtons;


    @FindBy(id = "feed-add-post-form-link-text")
    public WebElement moreTab;

    @FindBy(className = "menu-popup-item-text")
    public List<WebElement> moreOptions;


    public List<WebElement> firstFourOps= new ArrayList<>();

    public void opts(){

        for (int i = 0; i < activityStreamButtons.size()/2; i++) {
            firstFourOps.add(activityStreamButtons.get(i));
        }
        firstFourOps.add(moreTab);
    }

    public void ActivityStreamOptions(String requiredTabName){
        List<WebElement> allOptions =new ArrayList<>();
        opts();
        allOptions.addAll(firstFourOps);
        moreTab.click();
        allOptions.addAll(moreOptions);

        for (WebElement eachOption : allOptions) {
            if (eachOption.getText().equalsIgnoreCase(requiredTabName)){

                if (requiredTabName.equalsIgnoreCase("file") || requiredTabName.equalsIgnoreCase("Appreciation") || requiredTabName.equalsIgnoreCase("Announcement") || requiredTabName.equalsIgnoreCase("Workflow")){
                    moreTab.click();
                }
                eachOption.click();
                break;
            }
        }

    }

    public void clickMainMenuOption(String requiredOptionName) {

        for (WebElement eachOption : mainMenuOptions) {
            if (eachOption.getText().equalsIgnoreCase(requiredOptionName)) {
                eachOption.click();
                break;
            }
        }
    }


    @FindBy(xpath = "//div[@class='feed-post-text-block-inner-inner']//a")
    public List<WebElement> messageLinks;

    public boolean findLinkInMessage(String expectedText) {
        for (WebElement link : messageLinks) {
            if (link.getText().equals(expectedText)) {
                return true;
            }
        }
        return false;
    }

    public void clickMessageLink(String expectedText) {
        for (WebElement link : messageLinks) {
            if (link.getText().equals(expectedText)) {
                link.click();
            }
        }
    }
}
