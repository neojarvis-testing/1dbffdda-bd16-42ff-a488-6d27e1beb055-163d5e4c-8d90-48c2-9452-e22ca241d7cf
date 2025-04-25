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
@When("I clicked On ViewResults.")
public void i_clicked_on_view_results() {
    swarovskiBirdPage.hoverOnDecorations();
}
@When("I clicked On firstProduct.")
public void i_clicked_on_first_product() {
    swarovskiBirdPage.clickOnFirstProduct();
}
@When("I clicked on findInstore.")
public void i_clicked_on_find_instore() {
    swarovskiBirdPage.clickOnFindInStore();
}
@When("I clicked on ClickAvailbility.")
public void i_clicked_on_click_availbility() {
    swarovskiBirdPage.clickOnClickAvailbility();
}
@Then("I verified DeliveryText.")
public void i_verified_delivery_text() {

}


}
