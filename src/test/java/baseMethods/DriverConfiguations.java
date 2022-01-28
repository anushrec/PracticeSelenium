package baseMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class DriverConfiguations
{
static Properties config = new Properties();
static FileInputStream fileInputStream;
private static String url;

    static {
        try {
            fileInputStream = new FileInputStream(System.getProperty("user.dir") + "//src//test//resources//Config.properties");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
public static WebDriver getDRIVER()
{
    System.setProperty("webdriver.chrome.driver","C:/Users/ACER/IdeaProjects/PracticeSelenium/driver/chromedriver.exe");
    WebDriver driver  = new ChromeDriver();
    driver.manage().window().fullscreen();
    return driver;
}

    public static String getStringFromConfig(String key) throws IOException
    {
    config.load(fileInputStream);
    return  config.getProperty(key);
}

//public static WebDriver setup(String key) throws IOException {
  // System.setProperty("webdriver.chrome.driver","C:/Users/ACER/IdeaProjects/PracticeSelenium/driver/chromedriver.exe");
//    WebDriver driver = new ChromeDriver();
//    driver.get(getStringFromConfig(key));
//    return driver;
//}

}
