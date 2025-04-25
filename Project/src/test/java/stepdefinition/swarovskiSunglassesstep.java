package stepdefinition;
import com.aventstack.extentreports.ExtentTest;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SwarovskiSunglassesPage;
public class swarovskiSunglassesstep {
    public static ExtentTest test=Hooks.reports.createTest("Sunglasses");
    SwarovskiSunglassesPage  swarovskiSunglassesPage=new SwarovskiSunglassesPage(test);
    @When("I hover on Accessories.")
public void i_hover_on_accessories() {
    swarovskiSunglassesPage.hoverOnAccessories();
}
@When("I clicked On Sunglasses.")
public void i_clicked_on_sunglasses() {
    swarovskiSunglassesPage.clickOnSunglasses();
}
@When("I verified Sunglassesurl.")
public void i_verified_sunglassesurl() {

}
@When("I clicked On Material.")
public void i_clicked_on_material() {
    swarovskiSunglassesPage.clickOnMaterial();
}
@When("I clicked  On Acetate.")
public void i_clicked_on_acetate() {
    swarovskiSunglassesPage.clickOnAcetate();
}
@Then("I clicked On ShowResults.")
public void i_clicked_on_show_results() {
    swarovskiSunglassesPage.clickOnShowProduct();
}
   

}
