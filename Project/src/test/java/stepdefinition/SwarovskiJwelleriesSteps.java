package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SwarovskiJwelleriesPage;

public class SwarovskiJwelleriesSteps {


ExtentTest test= Hooks.reports.createTest("Test Swarovski jwelleries");
SwarovskiJwelleriesPage swarovskiJwelleriesPage= new SwarovskiJwelleriesPage(test);


@Given("I hover on jwelleries.")
public void i_hover_on_jwelleries() {
   swarovskiJwelleriesPage.hoverOverJwelleries();
}
@When("I click on Pendants.")
public void i_click_on_pendants() {
    swarovskiJwelleriesPage.clickOnPendants();
}
@When("I verify URL for Pendants.")
public void i_verify_url_for_pendants() {
   swarovskiJwelleriesPage.verifyURLforPendants();
}
@When("I click on Meterial.")
public void i_click_on_meterial() {
   swarovskiJwelleriesPage.clickOnMeterial();
}
@When("I click on Crystal.")
public void i_click_on_crystal() {
   swarovskiJwelleriesPage.clickOnCrystal();
}
@When("I click on ShowProduc.")
public void i_click_on_show_produc() {
    swarovskiJwelleriesPage.clickOnShowProduct();
}
@When("I verify URL for Crystal.")
public void i_verify_url_for_crystal() {
    swarovskiJwelleriesPage.verifyURLforCrystal();
}
@When("I click on color.")
public void i_click_on_color() {
    swarovskiJwelleriesPage.clickOnColor();
}
@When("I click on White.")
public void i_click_on_white() {
    swarovskiJwelleriesPage.clickOnWhite();
}
@Then("I click on ShowProduct for color.")
public void i_click_on_show_product_for_color() {
    swarovskiJwelleriesPage.clickOnShowProduct49();
}
@Then("I verify the url for color.")
public void i_verify_the_url_for_color() {
    swarovskiJwelleriesPage.verifyURLforColor();
}

}
