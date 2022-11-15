package com.trycloud.step_definitions;

import com.trycloud.pages.LoginPage;
import com.trycloud.pages.Dilmurod11_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

public class DilmurodUS11_StepDef {

  LoginPage loginPage = new LoginPage();

  Dilmurod11_Page us11_page = new Dilmurod11_Page();



    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

      loginPage.login();

    }
    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {

      BrowserUtils.waitFor(3);

      switch (string){

        case "Talk":
          us11_page.talkModuleBtn.click();
          break;
      }


    }
    @Then("verify the page title is {string}")
    public void verify_the_page_title_is(String expectedTitle) {

      BrowserUtils.waitFor(3);
      String actualTitle = Driver.getDriver().getTitle();

      Assert.assertEquals(expectedTitle, actualTitle);


    }

    @When("user search user from the search box")
    public void user_search_user_from_the_search_box() {
      us11_page.searchBox.click();
      us11_page.searchBox.sendKeys("Talk updates");
      us11_page.searchBox.click();
      us11_page.userFromSearchBox.click();


    }
     @When("user write a message")
     public void user_write_a_message() {

     us11_page.inputMessageBox.sendKeys("Hello");
    }
    @When("user clicks to submit button")
    public void user_clicks_to_submit_button() {
        us11_page.submitBtn.click();
    }
    @Then("the user should be able to see the message is displayed on the conversation log")
    public void the_user_should_be_able_to_see_the_message_is_displayed_on_the_conversation_log() {

     Assert.assertTrue("Message was not displayed", us11_page.inputMessageBox.isDisplayed());

    }





}
