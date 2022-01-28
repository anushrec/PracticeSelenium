package automationTest.stepDefinitions;

import POM.CommonPO;
import POM.LogINPO;
import baseMethods.DriverConfiguations;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.io.IOException;

import static baseMethods.Baseethods.DRIVER;

public class CommonTest
{
LogINPO logINPO = new LogINPO();
CommonPO commonPO = new CommonPO();

@Given("User is on {string} website")
public void user_is_on_website(String applicationName) throws IOException

{

 DRIVER.get(DriverConfiguations.getStringFromConfig(applicationName));
}

public void logInToApplication(String username, String password, String action) throws IOException {
 WebElement usernameTextBox = logINPO.getCrendetialsTextArea(username);
 usernameTextBox.sendKeys(DriverConfiguations.getStringFromConfig(username));

 WebElement passwordTextBox = logINPO.getCrendetialsTextArea(password);
 passwordTextBox.sendKeys(DriverConfiguations.getStringFromConfig(password));

 WebElement loginButton = logINPO.getCredentialsButton(action);
 loginButton.click();

 }
public void applyFilter(String filterName)
{
  WebElement activeFilter = commonPO.getActiveFilter();

  if (filterName.equalsIgnoreCase(activeFilter.getText()))
  {
   System.out.println("Filter - " + filterName + " is already selected.");
  }
  else
  {
      Select filters = new Select(DRIVER.findElement(By.xpath("@class='product_sort_container'")));
      filters.selectByVisibleText(filterName);
      System.out.println("Filter - " + filterName + " is successfully selected.");
  }
}
 @And("User applies filter {string}")
 public void userAppliesFilter(String filterName)
 {
    applyFilter(filterName);
 }
}
