package automationTest.stepDefinitions;

import baseMethods.DriverConfiguations;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="src/test/resources/feature",
        glue = "automationTest.stepDefinitions",
        tags="@MyStore_LogIn")
public class TestRunner
{
    private static WebDriver driver = null;
    //@BeforeClass
//    public static void initialSetup()
//    {
//        driver = DriverConfiguations.getDRIVER();
//    }

//    @AfterClass
//    public static void endSetup()
//    {
//        driver.quit();
//    }
}
