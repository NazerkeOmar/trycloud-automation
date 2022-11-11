package com.trycloud.step_definitions;

import com.trycloud.pages.BasePage;
import com.trycloud.pages.LoginPage;
import com.trycloud.pages.UserStory10_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.ConfigurationReader;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertTrue;

public class US10_StepDef extends BasePage {


    LoginPage loginPage = new LoginPage();
    UserStory10_Page userPage = new UserStory10_Page();

    String fileInfo;
    String storage1 = "";
    String storage2 = "";

    /*
     String before = "";
    String after = "";
     */

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {

        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        userPage.username.sendKeys(ConfigurationReader.getProperty("username"));
        userPage.password.sendKeys(ConfigurationReader.getProperty("password"));
        userPage.loginBtn.click();
    }


    @When("the user clicks the Files module")
    public void theUserClicksTheFilesModule() {


        userPage.filesModule.click();


    }


    @And("user clicks Settings on the left bottom corner")
    public void userClicksSettingsOnTheLeftBottomCorner() {
        userPage.settingModule.click();
        BrowserUtils.waitFor(1);
    }



    @Then("the user should be able to click any buttons")
    public void theUserShouldBeAbleToClickAnyButtons() {


        System.out.println(userPage.checkbox1.isSelected());
        System.out.println(userPage.checkbox2.isSelected());
        System.out.println(userPage.checkbox3.isSelected());

        userPage.checkbox1.click();
        userPage.checkbox2.click();
        userPage.checkbox3.click();

        System.out.println(userPage.checkbox1.isSelected());
        System.out.println(userPage.checkbox2.isSelected());
        System.out.println(userPage.checkbox3.isSelected());
        BrowserUtils.waitFor(2);





    }






    @When("user checks the current storage usage")
    public void user_checks_the_current_storage_usage() {

      String a = userPage.storageUsage.getText();
      storage1 +=a;
        /*
         String a = userStory10Page.checkStorage.getText();
        before += a;
         */
    }


    @When("user uploads file with the upload file option")
    public void user_uploads_file_with_the_upload_file_option() {

        /*
        BrowserUtils.waitFor(1);
        userPage.addFiles.click();

        String fileInfo = "C:\\Users\\Fiyona\\Desktop\\ALL-INTERVIEW-PREP\\all_Interview_Prep_updated_.pdf";

         */


 BrowserUtils.waitFor(1);
        userPage.uploadFiles.sendKeys("C:\\Users\\Fiyona\\Desktop\\ALL-INTERVIEW-PREP\\all_Interview_Prep_updated_.pdf");
        BrowserUtils.waitFor(3);


      /*
        BrowserUtils.waitFor(4);
        userPage.uploadFiles.sendKeys(fileInfo);
        BrowserUtils.waitFor(2);
        if(userPage.fileConflict.isDisplayed()){
            BrowserUtils.waitFor(2);
            userPage.newFileCheckBox.click();
            BrowserUtils.waitFor(2);
            userPage.continueBtn.click();
        }


        BrowserUtils.waitFor(5);

       */

    }





    @When("user refresh the page")
    public void user_refresh_the_page() {

         Driver.getDriver().navigate().refresh();
        BrowserUtils.waitFor(3);
        String b = userPage.storageUsage.getText();
        storage2 += b;




    }


    @Then("the user should be able to see storage usage is increased")
    public void the_user_should_be_able_to_see_storage_usage_is_increased() {
        /*
        storage2 = userPage.storageUsage.getText().substring(0,userPage.storageUsage.getText().indexOf(" "));

        BrowserUtils.waitFor(10);
        assertTrue(Integer.parseInt(storage1) < Integer.parseInt(storage2));
        BrowserUtils.waitFor(10);

         */

        System.out.println("before upload " + storage1);
        System.out.println("after upload " + storage2);
        Assert.assertFalse(storage1.equalsIgnoreCase(storage2));
    }



}
