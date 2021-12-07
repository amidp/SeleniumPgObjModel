package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

//create base test class to perform methods such as before method after method
public class BaseTest extends Utils{
    BrowserManager browserManager= new BrowserManager();

    @AfterMethod
    public void tearDownBrowser()
    {
        browserManager.closeBrowser();
    }

    @BeforeMethod
    public void setUpBrowser()
    {
       browserManager.openBrowser();

    }


}
