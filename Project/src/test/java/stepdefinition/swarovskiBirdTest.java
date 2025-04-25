package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Then;

import io.cucumber.java.en.When;
import pages.SwarovskiBirdPage;
public class swarovskiBirdTest {
    public static ExtentTest test=Hooks.reports.createTest("Sunglasses");
    SwarovskiBirdPage swarovskiBirdPage=new SwarovskiBirdPage(test);
    @When("I hover on Decorations.")
public void i_hover_on_decorations() {
    swarovskiBirdPage.hoverOnDecorations();
}
@When("I clicked On Birds.")
public void i_clicked_on_birds() {
    swarovskiBirdPage.clickOnBirds();
}
@When("I clicked On DropdownMaterial.")
public void i_clicked_on_dropdown_material() {
    swarovskiBirdPage.clickOnMaterial();
}
@When("I clicked  On Metal.")
public void i_clicked_on_metal() {
    swarovskiBirdPage.clickOnMetal();
}
@Then("I clicked On ViewResults.")
public void i_clicked_on_view_results() {
    swarovskiBirdPage.clickOnResults();
}
}
