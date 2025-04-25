package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.FooterPage;
import pages.SwarovskiAboutUsPage;

public class Footer {
    ExtentTest test=Hooks.reports.createTest("Footer");
    FooterPage footer =new FooterPage(test);
    @Given("I scroll To Footer")
public void i_scroll_to_footer() {
    footer.scrollToFooter();
}
@When("I click On Terms Of Use")
public void i_click_on_terms_of_use() {
    footer.clickOnTermsOfUse();
}
@When("I verify Terms Of Use Title")
public void i_verify_terms_of_use_title() {
    footer.verifyTermsOfUseTitle();
}
@When("I verify Terms Of Use Url")
public void i_verify_terms_of_use_url() {
    footer.verifyTermsOfUseUrl();
}
@When("I click On Terms And Conditions")
public void i_click_on_terms_and_conditions() {
    footer.clickOnTermsAndConditions();
}
@When("I verify Terms And Conditions Title")
public void i_verify_terms_and_conditions_title() {
    footer.verifyTermsAndConditionsTitle();
}
@When("I  verify Terms And Conditions Url")
public void i_verify_terms_and_conditions_url() {
    footer.verifyTermsAndConditionsUrl();
}
@When("I click On Privacy Policy")
public void i_click_on_privacy_policy() {
    footer.clickOnPrivacyPolicy();
}
@When("I verify Privacy Policy Title")
public void i_verify_privacy_policy_title() {
    footer.verifyPrivacyPolicyTitle();
}
@When("I verify Privacy Policy Url")
public void i_verify_privacy_policy_url() {
    footer.verifyPrivacyPolicyUrl();
}
@When("I click On Imprint")
public void i_click_on_imprint() {
    footer.clickOnImprint();
}
@When("I verify imprint Title")
public void i_verify_imprint_title() {
    footer.verifyimprintTitle();
}
@When("I verify imprint Url")
public void i_verify_imprint_url() {
    footer.verifyimprintUrl();
}
@When("I click On Accessibility")
public void i_click_on_accessibility() {
    footer.clickOnAccessibility();
}
@When("I verify Accessibility Title")
public void i_verify_accessibility_title() {
    footer.verifyAccessibilityTitle();
}
@When("I verify Accessibility Url")
public void i_verify_accessibility_url() {
    footer.verifyAccessibilityUrl();
}
@When("I click On California Supply Chain Act")
public void i_click_on_california_supply_chain_act() {
    footer.clickOnCaliforniaSupplyChainAct();
}
@When("I verify California Supply Chain Act Title")
public void i_verify_california_supply_chain_act_title() {
    footer.verifyCaliforniaSupplyChainActTitle();
}
@When("I verify California Supply Chain Act Url")
public void i_verify_california_supply_chain_act_url() {
    footer.verifyCaliforniaSupplyChainActUrl();
}
@When("I click On California PrivacyRights")
public void i_click_on_california_privacy_rights() {
    footer.clickOnCaliforniaPrivacyRights();
}
@When("I verify California PrivacyRights Title")
public void i_verify_california_privacy_rights_title() {
    footer.verifyCaliforniaPrivacyRightsTitle();
}
@When("I verify California PrivacyRights Url")
public void i_verify_california_privacy_rights_url() {
    footer.verifyCaliforniaPrivacyRightsUrl();
}
@Then("I verify Legal")
public void i_verify_legal() {
    footer.verifyLegal();
}
}
