package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EarringsHomePage;

public class EarringsPage {
    ExtentTest test = Hooks.reports.createTest("Earings");
    EarringsHomePage ehp = new EarringsHomePage(test);
@Given("I verify the Logo.")
public void i_verify_the_logo() {
   ehp.verifyLogo();
}
@When("I click on serachIcon.")
public void i_click_on_serach_icon() {
   ehp.clickOnsearchIcon();
}
@When("I click on SearchBar.")
public void i_click_on_search_bar() {
    ehp.clickOnsearchBar();
}
@When("I send data to Search Bar.")
public void i_send_data_to_search_bar() {
   ehp.sendData();
}
@When("I click on Enter.")
public void i_click_on_enter() {
   ehp.enterAction();
}
@When("I  click on Material.")
public void i_click_on_material() {
  ehp.clickOnMaterial();
}
@When("I  click on Gemstone.")
public void i_click_on_gemstone() {
  ehp.clickOnGemstone();
}
@When("I click on Zircoina.")
public void i_click_on_zircoina() {
    ehp.clickOnZircoina();
}
@When("I click on ShowProduct.")
public void i_click_on_show_product() {
   ehp.clickOnShowProduct();
}
@When("I click on FirstProduct.")
public void i_click_on_first_product() {
   ehp.clickOnFirstProduct();
}
@When("I click on BookAppointment.")
public void i_click_on_book_appointment() {
   ehp.clickOnBookAppointment();
}
@Then("I verify Description.")
public void i_verify_description() {
   ehp.verifyDescription();
}
}
