package com.trycloud.step_definitions;


import com.trycloud.pages.US5_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.velocity.util.introspection.VelPropertySet;
import org.joda.time.LocalTime;
import org.junit.Assert;

public class US5_StepDef {
    US5_Page us5_page = new US5_Page();

    LocalTime myObj = LocalTime.now();
    //  WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);

    String uploadedFilename = "test";

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        us5_page.username.sendKeys(ConfigurationReader.getProperty("username"));
        us5_page.password.sendKeys(ConfigurationReader.getProperty("password"));
        us5_page.loginBtn.click();
    }
    @When("the user clicks the Files module")
    public void theUserClicksTheFilesModule() {
        //Action action = new Action();
        BrowserUtils.waitFor(3);
        us5_page.fileBtn.click();
    }
    @When ("the user clicks action-icon from any file on the page")
    public void  clickActionsIcon(){
        BrowserUtils.waitFor(3);
        us5_page.actionIcon.click();

    }
    @And("user choose the \"Add to favorites\" option")
    public void addToFavorites(){
        BrowserUtils.waitFor(3);
        us5_page.addToFavorites.click();
    }
    @And("user click the \"Favorites\" sub-module on the left side")
    public void favoriteSubModule(){
        BrowserUtils.waitFor( 3);
        us5_page.favoriteSubModules.click();
    }
    @Then("Verify the chosen file is listed on the table")
    public void verifyTable() {
        BrowserUtils.waitFor(3);
        if (us5_page.favoritesTable.equals(us5_page.verifyTable)) ;
        System.out.println("True");

    }

}


