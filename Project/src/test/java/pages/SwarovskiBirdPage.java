package pages;
import org.junit.Assert;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import uistore.SwarovskiBirdPageLocators;
import uistore.SwarovskiSunglassesPageLocators;
import utils.Base;
import utils.LoggerHandler;
import utils.Screenshot;
import utils.WebDriverHelper;
public class SwarovskiBirdPage {
    ExtentTest test;
    WebDriverHelper helper;
    public SwarovskiBirdPage(ExtentTest test){
        this.test=test;
        helper=new WebDriverHelper(Base.driver);
    }
    /*
     * a.Method Name: hoverOnDecorations.
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to hover On Decorations.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void hoverOnDecorations(){
        try{
            helper.waitForElementToBeVisible(SwarovskiSunglassesPageLocators.hoverOnDecorations, 10);
            helper.hoverElement(SwarovskiSunglassesPageLocators.hoverOnDecorations);
            LoggerHandler.logInfo("hover on Decorations");
            test.log(Status.PASS, "hover on Decorations");
        }
        catch(Exception e){
             LoggerHandler.logError(e.getMessage());
            LoggerHandler.logError(" not hover on  Decorations");
            test.log(Status.FAIL,"not hover on Decorations");
        }   
    }
     /*
     * a.Method Name:clickOnBirds
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to click On Birds.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void clickOnBirds(){
        try{
            helper.waitForElementToBeVisible(SwarovskiSunglassesPageLocators.clickOnBirds, 10);
            helper.clickOnElement(SwarovskiSunglassesPageLocators.clickOnBirds);
            LoggerHandler.logInfo("click On clickOnBirds");
            test.log(Status.PASS, "click On clickOnBirds");

        }
        catch(Exception e){
             LoggerHandler.logError(e.getMessage());
            LoggerHandler.logError(" not click On Birds");
            test.log(Status.FAIL,"not click On Birds");
        }
    }
    /*
     * a.Method Name:click On Material.
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to click On Material.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    
    public void clickOnMaterial(){
        try{
            helper.waitForElementToBeVisible(SwarovskiSunglassesPageLocators.clickOnMaterial, 10);
            helper.clickOnElement(SwarovskiSunglassesPageLocators.clickOnMaterial);
            LoggerHandler.logInfo("click On Material");
            test.log(Status.PASS, "click On Material");
        }
        catch(Exception e){
             LoggerHandler.logError(e.getMessage());
            LoggerHandler.logError(" not click On Material");
            test.log(Status.FAIL,"not click On Material");
        }
    }
    /*
     * a.Method Name:clickOnMetal
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to click On Metal.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void clickOnMetal(){
        try{
            helper.waitForElementToBeVisible(SwarovskiBirdPageLocators.clickOnMetal, 10);
            helper.clickOnElement(SwarovskiBirdPageLocators.clickOnMetal);
           
            LoggerHandler.logInfo("click On Metal");
            test.log(Status.PASS, "click On Metal");
        }
        catch(Exception e){
             LoggerHandler.logError(e.getMessage());
            LoggerHandler.logError(" not click On Metal");
            test.log(Status.FAIL,"not click On Metal");
        }
    }
    /*
     * a.Method Name:clickOnResults
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to click On Results.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void clickOnResults(){
        try{
            helper.waitForElementToBeVisible(SwarovskiBirdPageLocators.clickOnResults, 10);
            helper.clickOnElement(SwarovskiBirdPageLocators.clickOnResults);
            LoggerHandler.logInfo("click On Resuuts");
            test.log(Status.PASS, "click On Results");
           
        }
        catch(Exception e){
             LoggerHandler.logError(e.getMessage());
            LoggerHandler.logError(" not click On Results");
            test.log(Status.FAIL,"not click OnclickOnBirds");
        }
    }
    /*
     * a.Method Name:click On FirstProduct
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to click On Product.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void clickOnFirstProduct(){
        try{
            helper.waitForElementToBeVisible(SwarovskiBirdPageLocators.clickOnFirstProduct, 10);
            helper.clickOnElement(SwarovskiBirdPageLocators.clickOnFirstProduct);
            LoggerHandler.logInfo("click On FirstProduct");
            test.log(Status.PASS, "click On First Product");
        }
        catch(Exception e){
            LoggerHandler.logError(" not click On FirstProduct");
            test.log(Status.FAIL,"not click On FirstProduct");
        }
    }
    /*
     * a.Method Name:clickOnFindInStore
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to click On Find IN STORE.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    public void clickOnFindInStore(){
        try{
            helper.waitForElementToBeVisible(SwarovskiBirdPageLocators.clickOnFindinstore, 10);
            helper.clickOnElement(SwarovskiBirdPageLocators.clickOnFindinstore);
            LoggerHandler.logInfo("click On FindInstore");
            test.log(Status.PASS, "click On  FindInstore");
        }
        catch(Exception e){
            LoggerHandler.logError(" not click On  FindInstores");
            test.log(Status.FAIL,"not click  FindInstores");
        }
    }
    /*
     * a.Method Name:clickOn ClickAvailbility
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to click On ClickAvailbility.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
    
    public void clickOnClickAvailbility(){
        try{
            helper.waitForElementToBeVisible(SwarovskiBirdPageLocators.clickOnAvailability, 10);
            helper.clickOnElement(SwarovskiBirdPageLocators.clickOnAvailability);
            LoggerHandler.logInfo("click On Resuuts");
            test.log(Status.PASS, "click On Results");
            Screenshot.captureScreenShot("clickeResult");
        }
        catch(Exception e){
             LoggerHandler.logError(e.getMessage());
            LoggerHandler.logError(" not click On clickOnBirds");
            test.log(Status.FAIL,"not click OnclickOnBirds");
        }
    }
     /*
     * a.Method Name:verifyDelivery
     * b.Author Name: Poojitha Sudini
     * c.Description: This method  is used to verify the text.
     * d.Parameters:NA.
     * e.Return Type:NULL.
     */
     public void verifyDelivery(){
        String data=helper.getText(SwarovskiBirdPageLocators.verifyDeliveryoptions);
        //AssertionUtility.verifyText(test, data, "Delivery Options");
        Assert.assertTrue(data.contains("Delivery"));
        LoggerHandler.logInfo("verified the delivery");
        test.log(Status.PASS,"verified the delivery");
    }
    // public void Birds(){
    //     hoverOnDecorations();
    //     clickOnBirds();
    //     clickOnMaterial();
    //     clickOnMetal();
    //     clickOnResults();
    // }
}
