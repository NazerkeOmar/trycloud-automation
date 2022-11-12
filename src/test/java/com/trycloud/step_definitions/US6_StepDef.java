package com.trycloud.step_definitions;
import com.trycloud.pages.US6_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.joda.time.LocalTime;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import javax.xml.transform.Source;

public class US6_StepDef {

    US6_Page us6_page = new US6_Page();
    LocalTime myObj = LocalTime.now();
    //  WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
    String uploadedFilename = "test";

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        us6_page.username.sendKeys(ConfigurationReader.getProperty("username"));
        us6_page.password.sendKeys(ConfigurationReader.getProperty("password"));
        us6_page.loginBtn.click();
    }
    @When("the user clicks the Files module")
    public void theUserClicksTheFilesModule() {
        //Action action = new Action();
        BrowserUtils.waitFor(3);
        us6_page.fileBtn.click();
    }
    @When("the users click action-icon from any file on the page to remove")
    public void clickActionIconFromAnyFileOnThePageToRemove(){
        BrowserUtils.waitFor(3);
        us6_page.actionIcon.click();
    }
    @And(" user choose the \"Remove from favorites\" option")
    public void removeFromFavorites(){
        BrowserUtils.waitFor(3);
        us6_page.removeFromFavorites.click();
    }
    @And("user click the \"Favorites\" sub-module on the left side")
    public void clickFavoritesSubModule(){
        BrowserUtils.waitFor(3);
        us6_page.clickFavoritesSubModule.click();
    }
    @Then("Verify that the file is removed from the Favorites sub-module’s table")
    public void verifyRemovedFromFavoritesFile(){
        BrowserUtils.waitFor(3);
        if( us6_page.emptyFavoritesPage.contains("No favorites yet"))

    }else{
        System.out.println("False");
    }

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        us6_page.username.sendKeys(ConfigurationReader.getProperty("username"));
        us6_page.password.sendKeys(ConfigurationReader.getProperty("password"));
        us6_page.loginBtn.click();
    }
    @When("the user clicks the Files module")
    public void theUserClicksTheFilesModule() {
        //Action action = new Action();
        BrowserUtils.waitFor(3);
        us6_page.fileBtn.click();
    }
    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        BrowserUtils.waitFor(5);
        us6_page.addBtn.click();


    }
    @And("users uploads file with the “upload file” option")
    public void  uploadsFileWithTheUploadFileOption(){
        BrowserUtils.waitFor(3);
        us6_page.uploadFile.click();
        BrowserUtils.waitFor(2);
        us6_page.inputFile.sendKeys("C:/Users/leann/OneDrive/Pictures/Documentst");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 20);
        wait.until(ExpectedConditions.invisibilityOf(us6_page.loadingBar));
    }
    @Then("verify the file is displayed on the page")
public void verifyTheFileDisplayedOnPage(){
        if( us6_page.fileName.contains("Something to uplode"))
    }else{
        System.out.println("False");
    }
}

