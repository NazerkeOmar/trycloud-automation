package com.trycloud.step_definitions;

import com.trycloud.pages.US4_Page;
import com.trycloud.utilities.BrowserUtils;
import com.trycloud.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US4_StepDef {

    US4_Page us4_page = new US4_Page();


    @When("the user clicks the {string} module")
    public void the_user_clicks_the_module(String string) {
        BrowserUtils.waitFor(3);
        us4_page.fileButton.click();

    }
    @Then("verify the page title is \"Files - Trycloud QA.”")
    public void verify_the_page_title_is_files_trycloud_qa() {
        BrowserUtils.waitFor(3);
        BrowserUtils.verifyTitle(Driver.getDriver(),"Files - Trycloud QA.");
    }

    @And("user click the top-left checkbox of the table")
    public void userClickTheTopLeftCheckboxOfTheTable() {
        BrowserUtils.waitFor(3);
        us4_page.checkAllFileButton.click();
    }

    @Then("verify all the files are selected")
    public void verifyAllTheFilesAreSelected() {
        BrowserUtils.waitFor(3);
        //  userS4Page.assertCheckButtonsisChecked();
        Assert.assertTrue(BrowserUtils.isAllSelected(us4_page.checkFileButtons));
    }
}
