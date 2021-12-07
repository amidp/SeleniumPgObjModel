package org.example;
import org.openqa.selenium.By;

//create new class emailfriend as new page action
public class EmailAFriendPage extends Utils{
    public void detailsToAddForReferProduct(){
        //input text for required fields
        typeText(By.id("FriendEmail"),"tomnjerry1+"+currentTimeStamp()+"@gmail.com");
        //type personalised message
        typeText(By.id("PersonalMessage"),"This product is worth having a look, I hope you will like it.");
        //click on send email
        clickOnElement(By.xpath("//div[@class='buttons']/button"));
    }
}
