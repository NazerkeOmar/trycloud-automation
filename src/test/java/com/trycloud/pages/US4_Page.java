package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class US4_Page {

    public US4_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")
    public List<WebElement> contactNamesElements;


    @FindBy(xpath = "//*[@id=\"headerSelection\"]/label")
    public WebElement checkAllFileButton;

    @FindBy (css = "li[data-id='files'] > a > svg > image")
    public WebElement fileButton;

    @FindBy(xpath = "//label[contains(@for,'select-files')]/../input")
    public List<WebElement> checkFileButtons;


    public List<String> getContactNames() {
        List<String> contactNames = new ArrayList<>();
        for (WebElement namesElement : contactNamesElements) {
            contactNames.add(namesElement.getText());
        }
        return contactNames;
    }

    public  void assertCheckButtonsisChecked(){
        for (WebElement checkFileButton : checkFileButtons) {
            Assert.assertTrue(checkFileButton.isSelected());
        }
    }

}
