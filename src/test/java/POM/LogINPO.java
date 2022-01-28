package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static baseMethods.Baseethods.DRIVER;

public class LogINPO
{
    public WebElement getCrendetialsTextArea(String fieldName)
    {
        return DRIVER.findElement(By.xpath("//input[@placeholder='" + fieldName + "']"));
    }

public WebElement getCredentialsButton(String buttonName)
{
    return DRIVER.findElement(By.xpath("//input[@value='" + buttonName + "']"));
}
}
