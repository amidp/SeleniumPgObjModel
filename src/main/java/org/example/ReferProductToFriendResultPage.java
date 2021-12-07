package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

//create referprodtcttofriendresultpage
public class ReferProductToFriendResultPage extends Utils
{
    public void userShouldBeAbleToSendEmailToFriendSuccessfully(){
        String actualResult = getTextFromElement(By.xpath("//div[@class='result']"));
        String expResult = "Your message has been sent.";
        //verify the expected and actual result
        Assert.assertTrue(actualResult.equals(expResult),"Your message has not been sent.");

    }
}
