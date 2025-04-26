package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EarringsHomePage;

public class EarringsPage {
    ExtentTest test = Hooks.reports.createTest("Earings");
    EarringsHomePage earringsHomePage = new EarringsHomePage(test);
@Given("I verify the Logo.")
public void i_verify_the_logo() {
   earringsHomePage.verifyLogo();
}
@When("I click on serachIcon.")
public void i_click_on_serach_icon() {
   earringsHomePage.clickOnsearchIcon();
}
@When("I click on SearchBar.")
public void i_click_on_search_bar() {
    earringsHomePage.clickOnsearchBar();
}

@When("I send data to Search Bar as {string}.")
public void i_send_data_to_search_bar_as(String string) {
   earringsHomePage.sendData(string);
}


@When("I click on Enter.")
public void i_click_on_enter() {
   earringsHomePage.enterAction();
}
@When("I  click on Material.")
public void i_click_on_material() {
  earringsHomePage.clickOnMaterial();
}
@When("I  click on Gemstone.")
public void i_click_on_gemstone() {
  earringsHomePage.clickOnGemstone();
}
@When("I click on Zircoina.")
public void i_click_on_zircoina() {
    earringsHomePage.clickOnZircoina();
}
@When("I click on ShowProduct.")
public void i_click_on_show_product() {
   earringsHomePage.clickOnShowProduct();
}
@When("I click on FirstProduct.")
public void i_click_on_first_product() {
   earringsHomePage.clickOnFirstProduct();
}
@When("I click on BookAppointment.")
public void i_click_on_book_appointment() {
   earringsHomePage.clickOnBookAppointment();
}
@Then("I verify Description.")
public void i_verify_description() {
   earringsHomePage.verifyDescription();
}
}
