package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class US7_Page {

    public US7_Page() {
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

    @FindBy(xpath = "//a[@class='button new']")
    public WebElement addBtn;

    @FindBy(xpath = "//a[@data-action='folder']")
    public WebElement newFolderBtn;

    @FindBy(xpath = "//input[@class='icon-confirm']")
    public WebElement arrowBtn;

    @FindBy(id = "view13-input-folder")
    public WebElement inputFolder;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List<WebElement> folderNameList;

    @FindBy(xpath = "//span[@id ='selectedActionsList']")
    public WebElement actionsBtn;

    @FindBy(xpath = "//span[.='Delete']")
    public WebElement deleteBtn;

    @FindBy(css = "label[for='file_upload_start']")
    public WebElement uploadFile;

    @FindBy(xpath = "//input[@type='file']")
    public WebElement inputFile;

    @FindBy(css = "#uploadprogressbar")
    public WebElement loadBar;

    @FindBy(xpath = "//span[@class='innernametext']")
    public List <WebElement> textNameList;

}
