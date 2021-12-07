package org.example;
import org.openqa.selenium.By;
import org.testng.Assert;

//create registrationresultpage
public class RegistrationResultPage extends RegistrationPage {
    public void verifyUserRegisterSuccessfully(){
        String actualRegisterSuccessMessage=getTextFromElement(By.xpath("//div[@class='result']"));
        String expectedRegisterSuccessMessage="Your registration completed";
        //verifying the actual requirement and check if test case is pass or fail
        Assert.assertTrue(actualRegisterSuccessMessage.equals(expectedRegisterSuccessMessage),"Your registration completed");
     }

     public void verifyUserSuccessfullyRegistered(){

        //String expectedResult = "Your registratition completed";
       // String actualResult = getTextFromElement(By.xpath("//div[@class=\"result\"]"));
     }
}
