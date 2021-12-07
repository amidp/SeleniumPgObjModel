package org.example;
import org.openqa.selenium.By;

//create newscommentpage for required action to do on page
public class NewsCommentPage extends HomePage{
    // By _newReleasecomment = By.xpath("//div[@class='buttons']/a[@href='nopcommerce-new-release']");
        By _titleType = By.id("AddNewComment_CommentTitle");
        By _commentType =By.id("AddNewComment_CommentText");
        By _clickOnNewComment = By.xpath("//div[@class='buttons']/button");

        public void userShouldBeAbleToAddCommentSuccessfully(){
          //  clickOnElement(_newReleasecomment);
            typeText(_titleType,"This is new comment.");
            typeText(_commentType,"This website is very useful.");
            clickOnElement(_clickOnNewComment);


        }



 }


