package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.Dilmurod14_Page;
import com.trycloud.pages.LoginPage;
import com.trycloud.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import java.util.List;

public class DilmurodUS14_StepDef {

     LoginPage loginPage = new LoginPage();


     Dilmurod14_Page dilmurod14_page = new Dilmurod14_Page();
     String home = "";
     @When("the user clicks the magnifier icon on the right top")
     public void the_user_clicks_the_magnifier_icon_on_the_right_top() {

          dilmurod14_page.magnifierIcon.click();
          BrowserUtils.waitFor(2);


     }

      String sendKey = "folder";

     @And("users search any existing file folder user name")
     public void usersSearchAnyExistingFileFolderUserName() {


          dilmurod14_page.inputTextHolder.sendKeys (sendKey + Keys.ENTER);
          BrowserUtils.waitFor(2);



     }

     @Then("verify the app displays the expected result option")
     public void verify_the_app_displays_the_expected_result_option() {

          String actualFolderName = dilmurod14_page.folderPackage.getText();

          Assert.assertTrue( actualFolderName.contains(sendKey) );

         // List<String> realList = dilmurod14_page.getSearchOptions();
         // System.out.println(realList);
        //  Assert.assertTrue(realList.contains("User"));



     }






}
