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
public static void openReport(){
    reports=Reporter.createExtentReport("Swarovski_BDD_Report");
}
@AfterAll
public static void closeReport(){
    reports.flush();
}

@Before
public static void luanchBrowser(){
    Base.openBrowser();
}

@After
public static void closeBrowser(){
    Base.driver.quit();
}

}
