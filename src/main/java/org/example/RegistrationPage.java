package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

//create registration page for details to be entered
public class RegistrationPage extends HomePage {
    By _firstName = By.name("FirstName");
    By _lastName = By.name("LastName");
    By _email = By.id("Email");
    By _password = By.id("Password");
    By _confirmPassword = By.id("ConfirmPassword");
    By _registerButton =By.id("register-button");

public void verifyUserShouldBeRegisterSuccessfully(){
    typeText(_firstName,"Minnie");
    typeText(_lastName,"Mouse");
    Select selectDay = new Select(driver.findElement(By.name("DateOfBirthDay")));
    selectDay.selectByVisibleText("6");
    Select selectMonth = new Select(driver.findElement(By.name("DateOfBirthMonth")));
    selectMonth.selectByValue("11");
    Select selectYear = new Select(driver.findElement(By.name("DateOfBirthYear")));
    selectYear.selectByVisibleText("1990");
    typeText(_email,"abc123+"+currentTimeStamp()+"@gmail.com");
    typeText(_password,"abc123");
    typeText(_confirmPassword,"abc123");
    clickOnElement(_registerButton);



}




    }








