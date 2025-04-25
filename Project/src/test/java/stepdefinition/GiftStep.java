package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SwarovskiGiftsPage;

public class GiftStep {
    ExtentTest test = Hooks.reports.createTest("Gifts Page Test");
    SwarovskiGiftsPage giftsPage = new SwarovskiGiftsPage(test);

    @Given("I hover on Gifts.")
public void i_hover_on_gifts() {
    giftsPage.hoverOverGifts();
}
@When("I click on wedding gifts.")
public void i_click_on_wedding_gifts() {
    giftsPage.clickOnWeddingGifts();
}
@When("I verify the title text.")
public void i_verify_the_title_text() {
    giftsPage.verifyTitleText();
}
@When("I click On watches.")
public void i_click_on_watches() {
    giftsPage.clickOnWatches();
}
@When("I click on all watches.")
public void i_click_on_all_watches() {
    giftsPage.clickOnAllWatches();
}
@When("click on show products.")
public void click_on_show_products() {
    giftsPage.clickOnShowProducts();
}
@When("I click on Materials.")
public void i_click_on_materials() {
    giftsPage.clickOnMaterial();
}
@When("I click on stainless steel.")
public void i_click_on_stainless_steel() {
    giftsPage.clickOnStainlessSteel();
}
@When("I click on show all.")
public void i_click_on_show_all() {
    giftsPage.clickOnShowAll();
}
@Then("I took a snapshot.")
public void i_took_a_snapshot() {
    giftsPage.takeSnap();
}
}
