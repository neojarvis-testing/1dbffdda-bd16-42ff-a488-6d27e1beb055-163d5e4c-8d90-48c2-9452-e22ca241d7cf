package pages;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import uistore.SwarovskiGiftPageLocator;
import utils.AssertionUtility;
import utils.Base;
import utils.LoggerHandler;
import utils.Reporter;
import utils.Screenshot;
import utils.WebDriverHelper;

public class SwarovskiGiftsPage {
    WebDriverHelper helper;
    ExtentTest test;
    public SwarovskiGiftsPage(ExtentTest test){
        helper = new WebDriverHelper(Base.driver);
        this.test=test;
    }
     /*
     * Method Name: hoverOverGifts
     * Author name: Kartik Bameta
     * Description: Performs hover action on Gifts present in the navigation bar.
     * Parameters: none
     * Return type: void
     */
    public void hoverOverGifts(){
        try {
            helper.waitForElementToBeVisible(SwarovskiGiftPageLocator.hoverOnGifts,10);
            helper.hoverElement(SwarovskiGiftPageLocator.hoverOnGifts);
            test.log(Status.PASS,"Hover on Gifts");
            LoggerHandler.logInfo("Hover on Gifts");
        } catch (Exception e) {
            test.log(Status.FAIL,"Cannot Hover on Gifts");
            LoggerHandler.logError("Cannot Hover on Gifts");
        }
    }
    /*
     * Method Name: clickOnWeddingGifts
     * Author name: Kartik Bameta
     * Description: Clicks on Wedding Gifts option under Gifts.
     * Parameters: none
     * Return type: void
     */
    public void clickOnWeddingGifts(){

       try {
            helper.waitForElementToBeVisible(SwarovskiGiftPageLocator.clickOnWeddingGifts,10);
            helper.clickOnElement(SwarovskiGiftPageLocator.clickOnWeddingGifts);
            AssertionUtility.verifyText(test, Base.driver.getTitle(), "Wedding Gifts, Bridal Party Gifts & Gifts For The Bride | Swarovski");
            test.log(Status.PASS, "Click on Wedding Gifts");
            LoggerHandler.logInfo("Click on Wedding Gifts");
       } catch (Exception e) {
            test.log(Status.FAIL, "could not Click on Wedding Gifts");
            LoggerHandler.logError("could not Click on Wedding Gifts");

       }
    }
    /*
     * Method Name: verifyTitleText
     * Author name: Kartik Bameta
     * Description: Verifies the page title contains the keyword "Categories".
     * Parameters: none
     * Return type: void
     */
    public void verifyTitleText(){
        try {
            String str = Base.driver.getCurrentUrl();
            AssertionUtility.verifyCondition(test, str, "Categories");
            test.log(Status.PASS, "Title text Verified");
            LoggerHandler.logInfo("Title text Verified");

        } catch (AssertionError e) {
            test.log(Status.FAIL, "Title text cannot be Verified");
            LoggerHandler.logError("Title text cannot be Verified");
        }
    }
    /*
     * Method Name: clickOnCtaegories
     * Author name: Kartik Bameta
     * Description: Clicks on Categories drop down option
     * Parameters: none
     * Return type: void
     */
    public void clickOnCtaegories(){
        try {
            helper.waitForElementToBeVisible(SwarovskiGiftPageLocator.clickOnCategories,10);
            helper.clickOnElement(SwarovskiGiftPageLocator.clickOnCategories);
            test.log(Status.PASS, "Click on Categories");
            LoggerHandler.logInfo("Click on Categories");
        } catch (Exception e) {
            test.log(Status.FAIL, "could not Click on Categories");
            LoggerHandler.logInfo("could not Click on Categories");
        }
    }
    /*
     * Method Name: clickOnWatches
     * Author name: Kartik Bameta
     * Description: Clicks on watches option under Categories.
     * Parameters: none
     * Return type: void
     */
    public void clickOnWatches(){
        try {
            helper.waitForElementToBeVisible(SwarovskiGiftPageLocator.clickOnWatches,10);
            helper.clickOnElement(SwarovskiGiftPageLocator.clickOnWatches);
            test.log(Status.PASS, "Click on Watches");
            LoggerHandler.logInfo("Click on Watches");
        } catch (Exception e) {
            test.log(Status.FAIL, "could not Click on Watches");
            LoggerHandler.logError("could not Click on Watches");
        }
    }
    /*
     * Method Name: clickOnAllWatches
     * Author name: Kartik Bameta
     * Description: Clicks on All Watches option.
     * Parameters: none
     * Return type: void
     */
    public void clickOnAllWatches(){
       try {
        helper.waitForElementToBeVisible(SwarovskiGiftPageLocator.clickOnAllWatches,10);
        helper.clickOnElement(SwarovskiGiftPageLocator.clickOnAllWatches);
        test.log(Status.PASS,"Click on all watches");
        LoggerHandler.logInfo("Click on all watches");
       } catch (Exception e) {
        test.log(Status.FAIL,"could not Click on all watches");
        LoggerHandler.logInfo("could not Click on all watches");
       }
    }
    /*
     * Method Name: clickOnShowProducts
     * Author name: Kartik Bameta
     * Description: Clicks on the Show product button and shows a list of all products after applying certain filters.
     * Parameters: none
     * Return type: void
     */
    public void clickOnShowProducts(){
        try {
            helper.waitForElementToBeVisible(SwarovskiGiftPageLocator.clickOnShowAll,10);
            helper.clickOnElement(SwarovskiGiftPageLocator.clickOnShowAll);
            AssertionUtility.verifyText(test,Base.driver.getTitle(),"Featured products | Swarovski");
            test.log(Status.INFO,"Click on Show Products");
            LoggerHandler.logInfo("Click on Show Products");
        } catch (Exception e) {
            test.log(Status.FAIL,"could not Click on Material");
            LoggerHandler.logError("could not Click on Material");
        }
    }
    /*
     * Method Name: clickOnMaterial
     * Author name: Kartik Bameta
     * Description: Clicks on Material Dropdown.
     * Parameters: none
     * Return type: void
     */
    public void clickOnMaterial(){
        try {
            helper.waitForElementToBeVisible(SwarovskiGiftPageLocator.clickOnMaterialDropDown,10);
            helper.clickOnElement(SwarovskiGiftPageLocator.clickOnMaterialDropDown);
            test.log(Status.PASS,"Click on Material");
            LoggerHandler.logInfo("Click on Material");
        } catch (Exception e) {
            test.log(Status.FAIL,"could not Click on Material");
            LoggerHandler.logError("could not Click on Material");
        }
    }
    /*
     * Method Name: clickOnStainlessSteel
     * Author name: Kartik Bameta
     * Description: Clicks on Stainless Steel option.
     * Parameters: none
     * Return type: void
     */
    public void clickOnStainlessSteel(){
        try {
            helper.waitForElementToBeVisible(SwarovskiGiftPageLocator.clickOnStainlessSteel,10);
            helper.clickOnElement(SwarovskiGiftPageLocator.clickOnStainlessSteel);
            test.log(Status.PASS,"Click on Material");
            LoggerHandler.logInfo("Click on Material");
        } catch (Exception e) {
            test.log(Status.FAIL,"could not Click on Material");
            LoggerHandler.logError("could not Click on Material");
        }
    }
    /*
     * Method Name: clickOnShowAll
     * Author name: Kartik Bameta
     * Description: Clicks on the Show product button and shows a list of all products after applying certain filters.
     * Parameters: none
     * Return type: void
     */
    public void clickOnShowAll(){
        try {
            helper.waitForElementToBeVisible(SwarovskiGiftPageLocator.clickOnShowAllButton,10);
            helper.clickOnElement(SwarovskiGiftPageLocator.clickOnShowAllButton);
            AssertionUtility.verifyText(test,Base.driver.getTitle(),"Featured products | Swarovski");
            test.log(Status.INFO,"Click on Show All Products");
            LoggerHandler.logInfo("Click on Show All Products");
        } catch (Exception e) {
            test.log(Status.FAIL,"could not Click on Show All Products");
            LoggerHandler.logError("could not Click on Show All Products");
        }
    }
    /*
     * Method Name: clickOnFirstProduct
     * Author name: Kartik Bameta
     * Description: Clicks on the first product that'll appear after clicking on the Show Products button.
     * Parameters: none
     * Return type: void
     */
    public void clickOnFirstProduct(){
        try {
            helper.waitForElementToBeVisible(SwarovskiGiftPageLocator.clickOnFirstProductWatch,10);
            helper.clickOnElement(SwarovskiGiftPageLocator.clickOnFirstProductWatch);
            test.log(Status.INFO,"Click on First Product");
            LoggerHandler.logInfo("Click on First Product");
        } catch (Exception e) {
            test.log(Status.FAIL,"could not Click on First Product");
            LoggerHandler.logError("could not Click on First Product");
        }
    }
    /*
     * Method Name: verify
     * Author name: Kartik Bameta
     * Description: Verifies the key word "Add to bag" and record the logs.
     * Parameters: none
     * Return type: void
     */
    public void verify(){
        try {
            String str = helper.getText(SwarovskiGiftPageLocator.addToCartText);
            AssertionUtility.verifyText(test, str, "Add to bag");
            test.log(Status.PASS,"Add To Bag Text Verified");
            LoggerHandler.logInfo("Add To Bag Text Verified");
        } catch (AssertionError e) {
            test.log(Status.FAIL,"Add To Bag Text cannot be Verified");
            LoggerHandler.logError("Add To Bag Text cannot be Verified");
        }
    }
    /*
     * Method Name: takeSnap
     * Author name: Kartik Bameta
     * Description: Captures a screenshot of the current page.
     * Parameters: none
     * Return type: void
     */
    public void takeSnap(){
            Screenshot.captureScreenShot("Watches");
            Reporter.logScreenshottoReport("Watches",test,"attached to report");
    }

}
