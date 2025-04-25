package stepdefinition;

import com.aventstack.extentreports.ExtentTest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SwarovskiAboutUsPage;

public class SwarovskiAboutUs  {
    ExtentTest test=Hooks.reports.createTest("AboutUs");
    SwarovskiAboutUsPage about =new SwarovskiAboutUsPage(test);
    @Given("I scroll To About swarovski")
public void i_scroll_to_about_swarovski() {
    about.scrollToAboutswarovski();
}
@When("I click On About Swarovski")
public void i_click_on_about_swarovski() {
    about.clickOnAboutSwarovski();
}
@When("I verify AboutSwarovski Title")
public void i_verify_about_swarovski_title() {
    about.verifyAboutSwarovskiTitle();
}
@When("I verify AboutSwarovski Url")
public void i_verify_about_swarovski_url() {
    about.verifyAboutSwarovskiUrl();
}
@When("I click On Sustainability")
public void i_click_on_sustainability() {
    about.clickOnSustainability();
}
@When("I verify Sustainability Title")
public void i_verify_sustainability_title() {
    about.verifySustainabilityTitle();
}
@When("I verify Sustainability Url")
public void i_verify_sustainability_url() {
    about.verifySustainabilityUrl();
}
@When("I click On JobsAndCareer")
public void i_click_on_jobs_and_career() {
    about.clickOnJobsAndCareer();
}
@When("I verify JobsAndCareer Title")
public void i_verify_jobs_and_career_title() {
    about.verifyJobsAndCareerTitle();
}
@When("I verify JobsAndCareer Url")
public void i_verify_jobs_and_career_url() {
    about.verifyJobsAndCareerUrl();
}
@When("I click On AlumniCommunity And Switch")
public void i_click_on_alumni_community_and_switch() {
    about.clickOnAlumniCommunityAndSwitch();
}
@When("I verify AlumniCommunity Title")
public void i_verify_alumni_community_title() {
    about.verifyAlumniCommunityTitle();
}
@When("I verify AlumniCommunity Url")
public void i_verify_alumni_community_url() {
    about.verifyAlumniCommunityUrl();
}
@When("I click On Corporategifts")
public void i_click_on_corporategifts() {
    about.clickOnCorporategifts();
}
@When("I verify Corporategifts Title")
public void i_verify_corporategifts_title() {
    about.verifyCorporategiftsTitle();
}
@When("I verify Corporategifts Url")
public void i_verify_corporategifts_url() {
    about.verifyCorporategiftsUrl();
}
@When("I click ForProfessional")
public void i_click_for_professional() {
    about.clickForProfessional();
}
@When("I verify ForProfessional Title")
public void i_verify_for_professional_title() {
    about.verifyForProfessionalTitle();
}
@When("I verify ForProfessional Url")
public void i_verify_for_professional_url() {
    about.verifyForProfessionalUrl();
}
@When("I click On Sitemap")
public void i_click_on_sitemap() {
    about.clickOnSitemap();
}
@When("I verify Sitemap Title")
public void i_verify_sitemap_title() {
    about.verifySitemapTitle();
}
@When("I verify SitemapUrl")
public void i_verify_sitemap_url() {
    about.verifySitemapUrl();
}
@Then("I verify AboutUs")
public void i_verify_about_us() {
    about.verifyAboutUs();
}
}
