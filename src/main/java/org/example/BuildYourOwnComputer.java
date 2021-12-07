package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

//create class Buildyourowncomputer for new page as per page object model
public class BuildYourOwnComputer extends Utils
{
    public void verifyUserIsOnBuildYourOwncomputerPage()
    {
        Assert.assertTrue(driver.getCurrentUrl().contains("build-your-own-computer"));
    }
    public void clickOnEmailFriend(){
        clickOnElement(By.xpath("//button[@class=\"button-2 email-a-friend-button\"]"));

    }
}
