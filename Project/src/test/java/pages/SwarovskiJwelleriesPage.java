package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SwarovskiJwelleriesLocators;
import utils.AssertionUtility;
import utils.Base;
import utils.LoggerHandler;
import utils.WebDriverHelper;

public class SwarovskiJwelleriesPage {
    ExtentTest test;
WebDriverHelper helper= new WebDriverHelper(Base.driver);
public SwarovskiJwelleriesPage(ExtentTest test){
    this.test=test;
}
/*
* a.Method Name: hoverOverJwelleries.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to hover over jwelleries.
* d.Parameters: None
* e.Return Type: void
*/
private void hoverOverJwelleries(){
    try {
        Thread.sleep(1000);
        helper.scrollByPixel(0, 100);
        helper.waitForElementToBeVisible(SwarovskiJwelleriesLocators.hoverOverJwelleries, 10);
        helper.hoverElement(SwarovskiJwelleriesLocators.hoverOverJwelleries);
        test.log(Status.INFO, "Hover Over Jwelleries");
        LoggerHandler.logInfo("Hover Over Jwelleries");
    } catch (Exception e) {
        test.log(Status.FAIL, "Hover Over Jwelleries");
        LoggerHandler.logError("Hover Over Jwelleries");
    }
}

/*
* a.Method Name: clickOnPendants.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on Pendants.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnPendants(){
    try {
        helper.waitForElementToBeVisible(SwarovskiJwelleriesLocators.clickOnPendants, 10);
        helper.waitForElementToBeClickable(SwarovskiJwelleriesLocators.clickOnPendants, 10);
        helper.clickOnElement(SwarovskiJwelleriesLocators.clickOnPendants);
        test.log(Status.INFO, "Click on Pendants");
        LoggerHandler.logInfo("Click on Pendants");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on Pendants");
        LoggerHandler.logError("Click on Pendants");
    }
}

/*
* a.Method Name: verifyURLforPendants.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to verify the URL that ir contains Pendants or not.
* d.Parameters: None
* e.Return Type: void
*/
private void verifyURLforPendants(){
    String url= Base.driver.getCurrentUrl();
    AssertionUtility.verifyCondition(test, url, "Pendants");
}

/*
* a.Method Name: clickOnMeterial.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on Meterial.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnMeterial(){
    try {
        Thread.sleep(1000);
        helper.scrollByPixel(0, 200);
        helper.waitForElementToBeVisible(SwarovskiJwelleriesLocators.clickOnMeterial, 10);
        helper.waitForElementToBeClickable(SwarovskiJwelleriesLocators.clickOnMeterial, 10);
        helper.clickOnElement(SwarovskiJwelleriesLocators.clickOnMeterial);
        test.log(Status.INFO, "Click on Meterial");
        LoggerHandler.logInfo("Click on Meterial");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on Meterial");
        LoggerHandler.logError("Click on Meterial");
    }
}

/*
* a.Method Name: clickOnCrystal.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on Crystal.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnCrystal(){
    try {
        helper.waitForElementToBeVisible(SwarovskiJwelleriesLocators.clickOnCrystal, 10);
        helper.waitForElementToBeClickable(SwarovskiJwelleriesLocators.clickOnCrystal, 10);
        helper.clickOnElement(SwarovskiJwelleriesLocators.clickOnCrystal);
        test.log(Status.INFO, "Click on Crystal");
        LoggerHandler.logInfo("Click on Crystal");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on Crystal");
        LoggerHandler.logError("Click on Crystal");
    }
}

/*
* a.Method Name: clickOnShowProduct.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on Show Product Button.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnShowProduct(){
    try {
        helper.waitForElementToBeVisible(SwarovskiJwelleriesLocators.clickOnShowProduct, 10);
        helper.waitForElementToBeClickable(SwarovskiJwelleriesLocators.clickOnShowProduct, 10);
        helper.clickOnElement(SwarovskiJwelleriesLocators.clickOnShowProduct);
        test.log(Status.INFO, "Click on ShowProduct");
        LoggerHandler.logInfo("Click on ShowProduct");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on ShowProduct");
        LoggerHandler.logError("Click on ShowProduct");
    }
}
private void verifyURLforCrystal(){
    String url= Base.driver.getCurrentUrl();
    AssertionUtility.verifyCondition(test, url, "Crystal");
}

/*
* a.Method Name: clickOnColor.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on Color.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnColor(){
    try {
        helper.waitForElementToBeVisible(SwarovskiJwelleriesLocators.clickOnColor, 10);
        helper.waitForElementToBeClickable(SwarovskiJwelleriesLocators.clickOnColor, 10);
        helper.clickOnElement(SwarovskiJwelleriesLocators.clickOnColor);
        test.log(Status.INFO, "Click on Color");
        LoggerHandler.logInfo("Click on Color");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on Color");
        LoggerHandler.logError("Click on Color");
    }
}

/*
* a.Method Name: clickOnWhite.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on White.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnWhite(){
    try {
        helper.waitForElementToBeVisible(SwarovskiJwelleriesLocators.clickOnWhite, 10);
        helper.waitForElementToBeClickable(SwarovskiJwelleriesLocators.clickOnWhite, 10);
        helper.clickOnElement(SwarovskiJwelleriesLocators.clickOnWhite);
        test.log(Status.INFO, "Click on White");
        LoggerHandler.logInfo("Click on White");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on White");
        LoggerHandler.logError("Click on White");
    }
}

/*
* a.Method Name: clickOnShowProduct49.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on Show Product button.
* d.Parameters: None
* e.Return Type: void
*/
private void clickOnShowProduct49(){
    try {
        Base.driver.navigate().refresh();
        try {
            helper.clickOnElement(SwarovskiJwelleriesLocators.clickOnCrossButton);
        } catch (Exception e) {
        }
        helper.waitForElementToBeVisible(SwarovskiJwelleriesLocators.clickOnShowProduct49, 10);
        helper.waitForElementToBeClickable(SwarovskiJwelleriesLocators.clickOnShowProduct49, 10);
        helper.clickOnElement(SwarovskiJwelleriesLocators.clickOnShowProduct49);
        test.log(Status.INFO, "Click on ShowProduct based on color");
        LoggerHandler.logInfo("Click on ShowProduct based on color");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on ShowProduct based on color");
        LoggerHandler.logError("Click on ShowProduct based on color");
    }
}

private void verifyURLforColor(){
    String url= Base.driver.getCurrentUrl();
    AssertionUtility.verifyCondition(test, url, "Color");
}

/*
* a.Method Name: clickOnFirstProduct.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on First Product.
* d.Parameters: None
* e.Return Type: void
*/
public void clickOnFirstProduct(){
    try {
        try {
            helper.clickOnElement(SwarovskiJwelleriesLocators.clickOnCrossButton);
        } catch (Exception e) {
        }
        helper.scrollByPixel(0, 200);
        helper.waitForElementToBeVisible(SwarovskiJwelleriesLocators.clickOnPendentFirstProduct, 10);
        helper.waitForElementToBeClickable(SwarovskiJwelleriesLocators.clickOnPendentFirstProduct, 10);
        helper.clickOnElement(SwarovskiJwelleriesLocators.clickOnPendentFirstProduct);
        test.log(Status.INFO, "Click on FirstProduct");
        LoggerHandler.logInfo("Click on FirstProduct");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on FirstProduct");
        LoggerHandler.logError("Click on FirstProduct");
    }
}

/*
* a.Method Name: clickOnAddToBag.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to click on Add to bag.
* d.Parameters: None
* e.Return Type: void
*/
public void clickOnAddToBag(){
    try {
        helper.scrollByPixel(0, 100);
        try {
            helper.clickOnElement(SwarovskiJwelleriesLocators.clickOnCrossButton);
        } catch (Exception e) {
        }
        helper.waitForElementToBeVisible(SwarovskiJwelleriesLocators.clickOnAddToBag, 10);
        helper.waitForElementToBeClickable(SwarovskiJwelleriesLocators.clickOnAddToBag, 10);
        helper.clickOnElement(SwarovskiJwelleriesLocators.clickOnAddToBag);
        test.log(Status.INFO, "Click on AddToBag");
        LoggerHandler.logInfo("Click on AddToBag");
    } catch (Exception e) {
        test.log(Status.FAIL, "Click on AddToBag");
        LoggerHandler.logError("Click on AddToBag");
    }
}

/*
* a.Method Name: verifyFindInStore.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to verify FindInStore.
* d.Parameters: None
* e.Return Type: void
*/
public void verifyFindInStore(){
    helper.waitForElementToBeVisible(SwarovskiJwelleriesLocators.verifyFindInStore, 10);
    String textFindStore= helper.getText(SwarovskiJwelleriesLocators.verifyFindInStore);
    AssertionUtility.verifyText(test, textFindStore, "Find in store");
}


/*
* a.Method Name: testPendants.
* b.Author Name: Md Safiur Rahaman
* c.Description: This method  is used to cluster all the methods in this class.
* d.Parameters: None
* e.Return Type: void
*/
public void testPendants(){
    hoverOverJwelleries();
    clickOnPendants();
    verifyURLforPendants();
    clickOnMeterial();
    clickOnCrystal();
    clickOnShowProduct();
    verifyURLforCrystal();
    clickOnColor();
    clickOnWhite();
    clickOnShowProduct49();
    verifyURLforColor();

}


}
