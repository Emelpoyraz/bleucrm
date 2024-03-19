package com.bleucrm.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.ArrayList;
import java.util.List;

public class ActivityStreamPage extends BasePage{

    /* @FindBy(id = "feed-add-post-form-tab-message")
    public WebElement messageTab;

    @FindBy(id = "feed-add-post-form-tab-tasks")
    public WebElement taskTab;

    @FindBy(id = "feed-add-post-form-tab-calendar")
    public WebElement eventTab;

    @FindBy(id = "feed-add-post-form-tab-vote")
    public WebElement pollTab;*/

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
        allOptions.addAll(firstFourOps);
        allOptions.add(moreTab);
        allOptions.addAll(moreOptions);

        for (WebElement eachOption : allOptions) {
            if (eachOption.getText().equals(requiredTabName)){
                eachOption.click();
                break;
            }
        }

    }
}
