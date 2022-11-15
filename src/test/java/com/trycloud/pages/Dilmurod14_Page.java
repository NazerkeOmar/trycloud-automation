package com.trycloud.pages;

import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class Dilmurod14_Page extends BasePage {


    public Dilmurod14_Page (){
        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy (xpath = "//span[@aria-label='Magnify icon']//*[name()='svg']")
    public WebElement magnifierIcon;

    @FindBy (xpath = "//input[@type='search']")
    public WebElement inputTextHolder;

    @FindBy (xpath = "//h3[@class='unified-search__result-line-one']/span")
    public WebElement folderPackage;










}
