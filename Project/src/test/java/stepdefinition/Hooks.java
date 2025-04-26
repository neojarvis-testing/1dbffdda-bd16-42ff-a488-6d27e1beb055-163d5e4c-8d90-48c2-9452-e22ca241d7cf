package stepdefinition;

import com.aventstack.extentreports.ExtentReports;

import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import utils.Base;
import utils.Reporter;

public class Hooks {
public static ExtentReports reports;
@BeforeAll
 /*
     * a.Method Name: openReport
     * b.Author Name: Rehaman
     * c.Description: This method  is used to  generate the reports.
     * d.Parameters: none.
     * e.Return Type: void.
     */
public static void openReport(){
    reports=Reporter.createExtentReport("Swarovski_BDD_Report");
}
 /*
     * a.Method Name: closeReport
     * b.Author Name: Rehaman
     * c.Description: This method  is used to flush the report .
     * d.Parameters: none.
     * e.Return Type: void.
     */
@AfterAll
public static void closeReport(){
    reports.flush();
}
/*
     * a.Method Name: luanchBrowser
     * b.Author Name: Rehaman
     * c.Description: This method  is used to open the browser .
     * d.Parameters: none.
     * e.Return Type: void.
     */

@Before
public static void launchBrowser(){
    Base.openBrowser();
}
/*
     * a.Method Name: closeBrowser
     * b.Author Name: Rehaman
     * c.Description: This method  is used to closeBrowser .
     * d.Parameters: none.
     * e.Return Type: void.
     */

@After
public static void closeBrowser(){
    Base.driver.quit();
}

}