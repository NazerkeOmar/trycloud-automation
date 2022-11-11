package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US13_Page {
    public US13_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }


    @FindBy (xpath = "//a[@aria-label='Contacts']")
    public WebElement contactsBtn;

    @FindBy(xpath = "//div[@class='app-content-list-item-line-one']")

    public List<WebElement> contactList;



}


