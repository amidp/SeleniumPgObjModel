package org.example;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import static org.example.Utils.currentTimeStamp;

    //creating Browsermanager class to handle all action that happens in browser
    public class BrowserManager extends BasePage
    {
    //create String variable for input purpose of different browser
    public String browserName="chrome";
   // public String browserName = System.getProperty("Browser");
    public void openBrowser()
    {
        System.out.println(currentTimeStamp());
        //applying conditional loop for the selection of right browser
        if (browserName.equalsIgnoreCase("chrome"))
        {
            System.setProperty("webdriver.chrome.driver", "src/test/java/drivers/chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "src/test/java/drivers/msedgedriver.exe");
            driver = new EdgeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", "src/test/java/drivers/geckodriver.exe");
            driver = new FirefoxDriver();
        } else {
            System.out.println("Wrong Browser....!");
        }

        driver.manage().window().maximize();
        //type URL
        driver.get("https://demo.nopcommerce.com/");
    }
        //close browser
        public void closeBrowser()
        {
             driver.close();
        }


    }
