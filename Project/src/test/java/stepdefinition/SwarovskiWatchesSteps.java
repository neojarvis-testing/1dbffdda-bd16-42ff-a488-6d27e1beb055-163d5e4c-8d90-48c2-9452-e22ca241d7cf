package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SwarovskiWatchesPage;

public class SwarovskiWatchesSteps {

ExtentTest test=Hooks.reports.createTest("Swarovski Watches");
SwarovskiWatchesPage swarovskiWatchesPage= new SwarovskiWatchesPage(test);

@Given("I hover on watches.")
public void i_hover_on_watches() {
    swarovskiWatchesPage.hoverOverWatches();
}
@When("I click on Imber.")
public void i_click_on_imber() {
    swarovskiWatchesPage.clickOnImber();
}
@When("I verify URL for Imber.")
public void i_verify_url_for_imber() {
    swarovskiWatchesPage.verifyURLforImber();
}
@When("I verify Result.")
public void i_verify_result() {
    swarovskiWatchesPage.verifyResult();
}
@When("I click on Categories.")
public void i_click_on_categories() {
    swarovskiWatchesPage.clickOnCategories();
}
@When("I click on close.")
public void i_click_on_close() {
    swarovskiWatchesPage.clickOnClose();
}
@When("I click on first product.")
public void i_click_on_first_product() {
    swarovskiWatchesPage.clickOnFirstWatchProduct();
}
@Then("I click on add to bag.")
public void i_click_on_add_to_bag() {
    swarovskiWatchesPage.clickOnAddToBag();
}

}
