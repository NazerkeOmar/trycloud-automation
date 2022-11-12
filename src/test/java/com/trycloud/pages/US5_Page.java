package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import io.cucumber.java.en.Then;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class US5_Page {
    public US5_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement username;

    @FindBy(id = "password")
    public WebElement password;

    @FindBy(id = "submit-form")
    public WebElement loginBtn;

    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement fileBtn;

    @FindBy(xpath = " //a[@class='icon icon-more']")
    public WebElement actionIcon;

    @FindBy(xpath = "//a[@class='nenueitem action action-favoritepermanent']")
    public WebElement addToFavorites;

    @FindBy(xpath = "//a[@class='nav-icon-favorites svg']")
    public WebElement favoriteSubModules;

    @FindBy(xpath = "//a[@class='nametext']")
    public WebElement verifyTable;

    @FindBy(xpath = "//a[@id='app-content']")
    public WebElement favoritesTable;

}



