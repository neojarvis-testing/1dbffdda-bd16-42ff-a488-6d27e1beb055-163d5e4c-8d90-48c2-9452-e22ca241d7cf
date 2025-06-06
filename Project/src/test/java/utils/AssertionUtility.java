package utils;

import org.junit.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class AssertionUtility {
    /*
     * a.Method Name: verifyText.
     * b.Author Name: Md Safiur Rahaman
     * c.Description: This method  is used to assert two text and log the status.
     * d.Parameters: ExtentTest test,String actual,String expected
     * e.Return Type: void
     */
 
    public static void verifyText(ExtentTest test,String actual,String expected){
        try {
            Assert.assertEquals(expected, actual);
            test.log(Status.PASS, "Verified: "+expected);
            LoggerHandler.logInfo("Verified: "+expected);
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Can not Verify: "+expected);
            test.log(Status.INFO, "Actual is this: "+actual);
            LoggerHandler.logError("Can not Verify: "+expected);
            LoggerHandler.logInfo("Actual is this: "+actual);
        }

    }

    /*
     * a.Method Name: verifyCondition.
     * b.Author Name: Md Safiur Rahaman
     * c.Description: This method  is used to verify that a particular text conatains in the actual text or not.
     * d.Parameters: ExtentTest test,String actual,String expected
     * e.Return Type: void
     */
    public static void verifyCondition(ExtentTest test,String actual,String containsPart){
        try {
            Assert.assertTrue(actual.contains(containsPart));
            test.log(Status.PASS, "Verified that the text contains: "+containsPart);
            LoggerHandler.logInfo("Verified that the text contains: "+containsPart);
        } catch (AssertionError e) {
            test.log(Status.FAIL, "Can not Verify that the text contains: "+containsPart);
            test.log(Status.INFO, "Actual is this: "+actual);
            LoggerHandler.logError("Can not Verify that the text contains: "+containsPart);
            LoggerHandler.logInfo("Actual is this: "+actual);
        }
    }

}
