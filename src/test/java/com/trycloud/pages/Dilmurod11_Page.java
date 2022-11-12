package com.trycloud.pages;

import com.trycloud.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dilmurod11_Page {

  public Dilmurod11_Page(){
      PageFactory.initElements(Driver.getDriver(), this);
  }

 @FindBy (xpath = "//ul[@id='appmenu']//a[@aria-label='Talk']//*[name()='svg']//*[name()='image' and contains(@class,'app-icon')]")
    public WebElement talkModuleBtn;

 @FindBy (xpath = "//input[@placeholder='Search conversations or users']")
    public WebElement searchBox;

 @FindBy (xpath = "//ul[@class='conversations']")
    public WebElement userFromSearchBox;

@FindBy (xpath = "//div[@role='textbox']")
    public WebElement inputMessageBox;

@FindBy (xpath = "//button[@type='submit']")
    public WebElement submitBtn;


@FindBy (xpath = "(//div[@class='message__main__text'])[24]")
    public WebElement inputText;





}
