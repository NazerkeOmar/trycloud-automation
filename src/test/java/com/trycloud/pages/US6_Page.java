package com.trycloud.pages;
import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US6_Page {
    public US6_Page() {
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

    @FindBy(xpath = "//a[@class='icon icon-more']")
    public WebElement actionIcon;

    @FindBy(xpath = "//a[@class='menuitem action action-favorite permanent']")
    public WebElement removeFromFavorites;

    @FindBy(xpath =  "//a[@class='nav-icon-favorites svg']")
    public WebElement clickFavoritesSubModule;

    @FinBy(xpath =  "//a[@class='icon-starred']")
    public WebElement emptyFavoritesPage;

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addBtn;

    @FindBy(css = "label[for='file_upload_start']")
    public WebElement uploadFile;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement inputFile;

    @FindBy(css = "#uploadprogressbar")
    public WebElement loadingBar;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List <WebElement> fileName;

}
