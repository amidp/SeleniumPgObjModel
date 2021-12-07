package org.example;
import org.testng.annotations.Test;

//create testsuit class = all the methods to run and create objects related to methods
public class TestSuit extends BaseTest{
    //objects declaration
    HomePage homePg = new HomePage();
    RegistrationPage registrationPg = new RegistrationPage();
    RegistrationResultPage registrationResultPage = new RegistrationResultPage();
    NewsCommentPage detailPage = new NewsCommentPage();
    NewsCommentResult newsCommentResult = new NewsCommentResult();
    ComputersPage computersPage = new ComputersPage();
    DesktopResult desktopResult = new DesktopResult();
    ReferProductToFriendResultPage referProductToFriendResultPage = new ReferProductToFriendResultPage();
    BuildYourOwnComputer buildYourOwnComputer = new BuildYourOwnComputer();
    EmailAFriendPage emailAFriendPage = new EmailAFriendPage();


    @Test
    //test case for registration requirement
    public void userShouldBeAbleToRegisterSuccessfully(){
        homePg.clickOnTheRegister();
        registrationPg.verifyUserShouldBeRegisterSuccessfully();
        registrationResultPage.verifyUserRegisterSuccessfully();


    }
    @Test
    //test case for news comment requirement
    public void userShouldBeAbleToAddTheCommentSuccessfully(){
       homePg.clickOnTheNewsComment();
       detailPage.userShouldBeAbleToAddCommentSuccessfully();
       newsCommentResult.userShouldBeAbleToAddNewsComment();
    }


    @Test
    //test case for desktop navigation requirement
    public void verifyUserShouldBeAbleToNavigateToDesktopPage(){
    homePg.clickOnElementComputers();
    computersPage.clickOnTheDesktopButton();
    desktopResult.clickOnDesktop();
    desktopResult.verifyUserNavigatesToDeskTopPage();
    }


    @Test
    //test case for refer a product to friend requirement
    public void verifyUserShouldReferAProductToAFriend(){
       // homePg.clickOnTheRegister();
        //registrationPg.verifyUserShouldBeRegisterSuccessfully();
         userShouldBeAbleToRegisterSuccessfully();
         verifyUserShouldBeAbleToNavigateToDesktopPage();
       // computersPage.clickOnTheDesktopButton();
        desktopResult.clickOnBuildYourOwnComputer();
        buildYourOwnComputer.verifyUserIsOnBuildYourOwncomputerPage();
        buildYourOwnComputer.clickOnEmailFriend();
        emailAFriendPage.detailsToAddForReferProduct();
        referProductToFriendResultPage.userShouldBeAbleToSendEmailToFriendSuccessfully();

    }
}
