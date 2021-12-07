package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

//create new class desktoptesult as to compare test case results
public class DesktopResult extends Utils{
    public void verifyUserNavigatesToDeskTopPage(){
        Assert.assertTrue(driver.getCurrentUrl().contains("desktops"));
    }
    public void clickOnDesktop(){
        clickOnElement(By.linkText("Desktops"));

    }
    public void clickOnBuildYourOwnComputer(){
        clickOnElement(By.linkText("Build your own computer"));

    }
}
