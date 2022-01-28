package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static baseMethods.Baseethods.DRIVER;

public class CommonPO
{
    public WebElement getActiveFilter()
        {
            return DRIVER.findElement(By.xpath("//span[@class='active_option']"));
        }
}
