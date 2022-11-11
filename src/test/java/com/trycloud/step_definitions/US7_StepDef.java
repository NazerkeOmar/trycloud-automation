package com.trycloud.step_definitions;

import com.trycloud.pages.US7_Page;
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

public class US7_StepDef {
    US7_Page us7_page = new US7_Page();
    LocalTime myObj = LocalTime.now();
    //  WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 5);
    String folderName = myObj.toString().replaceAll(":", "");
    String uploadedFilename = "test";

    @Given("user on the dashboard page")
    public void user_on_the_dashboard_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("env"));
        us7_page.username.sendKeys(ConfigurationReader.getProperty("username"));
        us7_page.password.sendKeys(ConfigurationReader.getProperty("password"));
        us7_page.loginBtn.click();
    }

    @When("the user clicks the Files module")
    public void theUserClicksTheFilesModule() {
        //Action action = new Action();
        BrowserUtils.waitFor(3);
        us7_page.fileBtn.click();
    }

    @When("user clicks the add icon on the top")
    public void user_clicks_the_add_icon_on_the_top() {
        BrowserUtils.waitFor(5);
        us7_page.addBtn.click();


    }

    @When("user click \"new folder”")
    public void user_click_new_folder() {
        BrowserUtils.waitFor(3);
        us7_page.newFolderBtn.click();


    }

    @When("user write a folder name")
    public void user_write_a_folder_name() {
        us7_page.arrowBtn.click();
        us7_page.inputFolder.clear();

    }

    @When("the user click submit icon")
    public void the_user_click_submit_icon() {
        us7_page.inputFolder.sendKeys(folderName + Keys.ENTER);

    }

    public int newFolderIndex;

    @Then("Verify the folder is displayed on the page")
    public void verify_the_folder_is_displayed_on_the_page() {
        BrowserUtils.waitFor(3);
        boolean a = false;
        for (int i = 0; i < us7_page.folderNameList.size(); i++) {
            if (us7_page.folderNameList.get(i).getText().equals(folderName)) {
                a = true;
                newFolderIndex = i + 1;
                break;
            }
        }
        Assert.assertTrue(a);
    }

    @And("delete new folder")
    public void deleteNewFolder() {
        WebElement newFolderCheckBox = Driver.getDriver()
                .findElement(By
                        .xpath("(//span[@class='innernametext'])[" + newFolderIndex + "]/../../../..//td[1]"));
        newFolderCheckBox.click();
        BrowserUtils.waitFor(1);
        us7_page.actionsBtn.click();
        BrowserUtils.waitFor(1);
        us7_page.deleteBtn.click();
        BrowserUtils.waitFor(5);


    }

    @When("the user clicks  the add button")
    public void theUserClicksTheAddButton() {
        us7_page.addBtn.click();

    }


    @When("the user uploads a file with the upload file option")
    public void the_user_uploads_a_file_with_the_upload_file_option() {
        BrowserUtils.waitFor(2);
        us7_page.uploadFile.click();
        BrowserUtils.waitFor(2);
        us7_page.inputFile.sendKeys("/Users/leylanasirova/Desktop/test.txt");
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.invisibilityOf(us7_page.loadBar));

    }

    @Then("Verify the file is displayed on the page")
    public void verify_the_file_is_displayed_on_the_page() {
        boolean result = false;
        for (WebElement each : us7_page.textNameList) {
            if (each.getText().equals(uploadedFilename)) {
                result = true;
                break;
            }
        }
        Assert.assertTrue(result);
    }
}





