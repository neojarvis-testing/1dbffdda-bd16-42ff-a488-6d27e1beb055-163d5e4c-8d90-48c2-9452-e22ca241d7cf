package pages;
import org.junit.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.SwarovskiSunglassesPageLocators;
import utils.AssertionUtility;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;
public class SwarovskiSunglassesPage {
    ExtentTest test;
    WebDriverHelper helper;
    public SwarovskiSunglassesPage(ExtentTest test){
        this.test=test;
        helper=new WebDriverHelper(Base.driver);
    }
     /*
     * a.Method Name:hoverOnAccessories
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to hover On Accessories.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void hoverOnAccessories(){
        try{
            helper.waitForElementToBeVisible(SwarovskiSunglassesPageLocators.hoverOnAccessories, 10);
            helper.hoverElement(SwarovskiSunglassesPageLocators.hoverOnAccessories);
            LoggerHandler.logInfo("Hover on Accessories");
            test.log(Status.PASS, "Hover on Accessories");
        }
        catch(Exception e){
            LoggerHandler.logError(e.getMessage());
            LoggerHandler.logError(" not hover on Accessories");
            test.log(Status.FAIL,"not hover on Accessories");
        }   
    }
     /*
     * a.Method Name:clickOnSunglasses()
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to clickOnSunglasses.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void clickOnSunglasses(){
        try{
            helper.waitForElementToBeVisible(SwarovskiSunglassesPageLocators.clickOnSunglasses, 10);
            helper.clickOnElement(SwarovskiSunglassesPageLocators.clickOnSunglasses);
            LoggerHandler.logInfo("clickOnSunglasses");
            test.log(Status.PASS, "clickOnSunglasses");
        }
        catch(Exception e){
            LoggerHandler.logError(e.getMessage());
            LoggerHandler.logError(" not clickOnSunglasses");
            test.log(Status.FAIL,"not clickOnSunglasses");
        }
    }
      /*
     * a.Method Name:verifyUrlSunglasses
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to verify the sunglasses.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void verifyUrlSunglasses(){
        String url=Base.driver.getCurrentUrl();
        //AAssert.assertTrue(url.contains("Sunglasses"));
        AssertionUtility.verifyCondition(test, url,"Sunglasses");
    }
      /*
     * a.Method Name:clickOn Material
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to click on material.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void clickOnMaterial(){
        try{
            helper.waitForElementToBeVisible(SwarovskiSunglassesPageLocators.clickOnMaterial, 10);
            helper.clickOnElement(SwarovskiSunglassesPageLocators.clickOnMaterial);
            LoggerHandler.logInfo("clickOnMaterial");
            test.log(Status.PASS, "clickOnMaterial");
        }
        catch(Exception e){
            LoggerHandler.logError(e.getMessage());
            LoggerHandler.logError(" not click On Material");
            test.log(Status.FAIL,"not click On Material");
        }
    }
      /*
     * a.Method Name:clickOnAcetate
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to clickOnAcetate
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void clickOnAcetate(){
        try{
            helper.waitForElementToBeVisible(SwarovskiSunglassesPageLocators.clickOnAcetate, 10);
            helper.clickOnElement(SwarovskiSunglassesPageLocators.clickOnAcetate);
            LoggerHandler.logInfo("click On Acetate");
            test.log(Status.PASS, "click On Acetate");
        }
        catch(Exception e){
            LoggerHandler.logError(e.getMessage());
            LoggerHandler.logError(" not click On Acetate");
            test.log(Status.FAIL,"not click On Acetate");
        }
    }
      /*
     * a.Method Name:clickOnShowProduct
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to click on showProduct.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void clickOnShowProduct(){
        try{
            helper.waitForElementToBeVisible(SwarovskiSunglassesPageLocators.clickOnShowProducts, 10);
            helper.clickOnElement(SwarovskiSunglassesPageLocators.clickOnShowProducts);
            String url=Base.driver.getCurrentUrl();
            Assert.assertTrue(url.contains("material-acetate"));
            LoggerHandler.logInfo("click On ShowProducts");
            test.log(Status.PASS, "click OnShowProducts");
        }
        catch(Exception e){
            LoggerHandler.logError(e.getMessage());
            LoggerHandler.logError(" not click On ShowProducts");
            test.log(Status.FAIL,"not click On ShowProducts");
        }
    }
      /*
     * a.Method Name:clickOn First Product
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to clickOn First product.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void clickOnFirstProduct(){
        try{
            helper.waitForElementToBeVisible(SwarovskiSunglassesPageLocators.clickOnFirstProduct, 10);
            helper.clickOnElement(SwarovskiSunglassesPageLocators.clickOnFirstProduct);
            String title=Base.driver.getTitle();
            Assert.assertTrue(title.contains("Sunglasses"));
            LoggerHandler.logInfo("click On FirstProduct");
            test.log(Status.PASS, "click On FirstProduct");
        }
        catch(Exception e){
            LoggerHandler.logError(e.getMessage());
            LoggerHandler.logError(" not click On FirstProduct");
            test.log(Status.FAIL,"not click On FirstProduct");
        }
    }
      /*
     * a.Method Name:clickOnCareAndMaintainece
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to clickOnCareand Maintainence
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void clickOnCareandMaintanece(){
        try{
            helper.waitForElementToBeVisible(SwarovskiSunglassesPageLocators.clickonCareandMaintainence, 10);
            helper.clickOnElement(SwarovskiSunglassesPageLocators.clickonCareandMaintainence);
            LoggerHandler.logInfo("click On CareandMaintainence");
            test.log(Status.PASS, "click On CareandMaintainence");
        }
        catch(Exception e){
            LoggerHandler.logError(e.getMessage());
            LoggerHandler.logError(" not click On FirstProduct");
            test.log(Status.FAIL,"not click On FirstProduct");
        }
    }
      /*
     * a.Method Name:verifying book an appointment
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to verifying book an appointment.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void verifyBookanAppointment(){
        String data=helper.getText(SwarovskiSunglassesPageLocators.bookAnAppointmnet);
        AssertionUtility.verifyText(test, data,"Book an appointment");
    }
     /*
     * a.Method Name:verifying  the login
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to verifying  login text.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void verifyLogin(){
        String data=helper.getText(SwarovskiSunglassesPageLocators.verifyLogin);
        AssertionUtility.verifyText(test, data, "Login");
    }
    // public void testSunglass(){
    //     hoverOnAccessories();
    //     clickOnSunglasses();
    //     verifyUrlSunglasses();
    //     clickOnMaterial();
    //     clickOnAcetate();
    // }
}
