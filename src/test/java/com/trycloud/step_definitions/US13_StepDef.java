package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.US13_Page;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US13_StepDef extends BasePage {
    US13_Page us13Page = new US13_Page();



     /*
    @Given("user on the dashboard page")

    public void user_on_the_dashboard_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        loginPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        loginPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        loginPage.loginBtn.click();
}

     */




    @When("the user clicks the contacts module")
    public void the_user_clicks_the_contacts_module() {
        us13Page.contactsBtn.click();
    }
    @Then("verify the contact names are in the list")
    public void verify_the_contact_names_are_in_the_list() {

        BrowserUtils.waitFor(5);
        Assert.assertTrue(us13Page.contactList.size()>=2);


        for (WebElement each: us13Page.contactList){

            Assert.assertTrue(each.isDisplayed());

        }

    }}
