package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserStory10_Page extends BasePage {

   // private Object fileModule;

    public UserStory10_Page() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//*[@id=\"appmenu\"]/li[2]")
    public WebElement filesModule;


    @FindBy(xpath = "//button[@class='settings-button']")
    public WebElement settingModule;


    @FindBy(xpath = "//*[@id=\"recommendations-setting-enabled\"]")
    public WebElement anyButtons;

    @FindBy(xpath = "//div[@id='files-setting-richworkspace']/label[.='Show rich workspaces']")
    public WebElement checkbox1;


    @FindBy(xpath = "//div[@id='recommendations-setting-enabled']/label[.='Show recommendations']")
    public WebElement checkbox2;


    @FindBy(xpath = "//div[@id='files-setting-showhidden']/label[.='Show hidden files']")
    public WebElement checkbox3;



    // go back to settings and click settingBtn

    @FindBy(xpath = "//*[@id=\"quota\"]/a/p")
    public WebElement storageUsage;



    @FindBy(xpath = "//*[@id='controls']/div[2]/a/span[1]")
    public WebElement addFiles;



    @FindBy (xpath = "//input[@type='file']")
    public WebElement uploadFiles;


    @FindBy(xpath = "//*[@id='oc-dialog-fileexists-content']/div/div[2]/div[2]/label")
    public WebElement fileConflict;

    @FindBy(xpath = "//*[@id=\"quota\"]/a/p")
    public WebElement newFileCheckBox ;

    @FindBy(xpath = "//*[@id='body-user']/div[9]/div[2]/button[2]")
    public WebElement continueBtn;



}
