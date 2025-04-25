package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePageFooter;

public class StepHomePageFooter {
    ExtentTest test = Hooks.reports.createTest("Home Page Footer");
    HomePageFooter hpf = new HomePageFooter(test);
    @Given("clickOnCustomerServiceOverview.")
public void click_on_customer_service_overview() {
    hpf.clickOnCustomerServiceOverview();
}
@When("verify URL Of CustomerServiceOverview.")
public void verify_url_of_customer_service_overview() {
   hpf.verifyURLOfCustomerServiceOverview();
}
@When("verify TitleOfCustomerServiceOverview.")
public void verify_title_of_customer_service_overview() {
  hpf.verifyTitleOfCustomerServiceOverview();
}
@When("backward.")
public void backward() {
   hpf.backward();
}
@When("click On OrderStatus.")
public void click_on_order_status() {
    hpf.clickOnOrderStatus();
}
@When("verify URL OfOrderStatus.")
public void verify_url_of_order_status() {
    hpf.verifyURLOfOrderStatus();
}
@When("verify Title Of OrderStatus.")
public void verify_title_of_order_status() {
   hpf.verifyTitleOfOrderStatus();
}
@When("click On GiftCardBalance.")
public void click_on_gift_card_balance() {
    hpf.clickOnGiftCardBalance();
}
@When("verify URL Of GiftCardBalance.")
public void verify_url_of_gift_card_balance() {
    hpf.verifyURLOfGiftCardBalance();
}
@When("verify Title Of GiftCardBalance.")
public void verify_title_of_gift_card_balance() {
   hpf.verifyTitleOfGiftCardBalance();
}
@When("click On Shipping.")
public void click_on_shipping() {
   hpf.clickOnShipping();
}
@When("verify URL Of Shipping.")
public void verify_url_of_shipping() {
   hpf.verifyURLOfShipping();
}
@When("verify Title Of Shipping.")
public void verify_title_of_shipping() {
    hpf.verifyTitleOfShipping();
}
@When("click On ReturnsAndExchange.")
public void click_on_returns_and_exchange() {
   hpf.clickOnReturnsAndExchange();
}
@When("verify URL Of ReturnsAndExchange.")
public void verify_url_of_returns_and_exchange() {
    hpf.verifyURLOfReturnsAndExchange();
}
@When("verify Title Of ReturnsAndExchange.")
public void verify_title_of_returns_and_exchange() {
    hpf.verifyTitleOfReturnsAndExchange();
}
@When("click On ContactUs.")
public void click_on_contact_us() {
   hpf.clickOnContactUs();
}
@When("verify URL Of ContactUs.")
public void verify_url_of_contact_us() {
   hpf.verifyURLOfContactUs();
}
@When("verify Title Of ContactUs.")
public void verify_title_of_contact_us() {
   hpf.verifyTitleOfContactUs();
}
@When("click On SizeGuide.")
public void click_on_size_guide() {
   hpf.clickOnSizeGuide();
}
@When("verify URL Of SizeGuide.;")
public void verify_url_of_size_guide() {
    hpf.verifyURLOfSizeGuide();
}
@When("verifyTitle Of SizeGuide.")
public void verify_title_of_size_guide() {
   hpf.verifyTitleOfSizeGuide();
}
@When("click On StoreFinder.")
public void click_on_store_finder() {
   hpf.clickOnStoreFinder();;
}
@When("verify URL Of StoreFinder.")
public void verify_url_of_store_finder() {
    hpf.clickOnStoreFinder();
}
@When("verify Title Of StoreFinder.")
public void verify_title_of_store_finder() {
    hpf.verifyTitleOfStoreFinder();
}
@Then("verifyMembership.")
public void verify_membership() {
    hpf.verifyMembership();
}
}
