package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SwarovskiDiamondsPage;

public class DiamondsStep {
    ExtentTest test = Hooks.reports.createTest("Diamond Page Test");
    SwarovskiDiamondsPage diamondsPage = new SwarovskiDiamondsPage(test);

    @Given("I hover on Diamonds.")
public void i_hover_on_diamonds() {
    diamondsPage.hoverOnSwarovskiCreatedDiamonds();
}
@When("I click on eternity.")
public void i_click_on_eternity() {
    diamondsPage.clickOnEternity();
}
@When("I verify the text in URL.")
public void i_verify_the_text_in_url() {
    diamondsPage.verifyURLText();
}
@When("I click on categories.")
public void i_click_on_categories() {
    diamondsPage.clickOnCategories();
}
@When("I click on Rings.")
public void i_click_on_rings() {
    diamondsPage.clickOnRings();
}
@When("I click on show products button.")
public void i_click_on_show_products_button() {
    diamondsPage.clickOnShowProducts();
}
@When("I click on Material.")
public void i_click_on_material() {
    diamondsPage.clickOnMaterial();
}
@When("I click on Sterling Silver.")
public void i_click_on_sterling_silver() {
    diamondsPage.clickOnSterlingSilver();
}
@When("I click on show all products.")
public void i_click_on_show_all_products() {
    diamondsPage.clickOnShowProductsButton();
}
@Then("I captured a screenshot.")
public void i_captured_a_screenshot() {
    diamondsPage.takeASanpshot();
}
}
