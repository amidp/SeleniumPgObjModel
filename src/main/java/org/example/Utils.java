package org.example;
import org.openqa.selenium.By;
import java.text.SimpleDateFormat;
import java.util.Date;

//create utils class - all methods to be performed in this class
public class Utils extends BrowserManager{
    public static void clickOnElement(By by){
        driver.findElement(by).click();
    }
    public static void typeText(By by,String text){
        driver.findElement(by).sendKeys(text);
    }
    public static String getTextFromElement(By by){
        return driver.findElement(by).getText();
    }
    public static String currentTimeStamp()
    {
        Date date =new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyhhmmss");
        return sdf.format(date);
    }
}
