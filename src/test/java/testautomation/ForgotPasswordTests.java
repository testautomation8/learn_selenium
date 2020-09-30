package testautomation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ForgotPasswordTests extends BaseTests{

    @Test
    public void testRetrievePassword(){
        var forgetPasswordPage = homePage.clickForgotPassword();
        forgetPasswordPage.enterEmail("tau@example.com");
        var emailSentPage = forgetPasswordPage.clickRetrievePassword();
        Assert.assertEquals(emailSentPage.getMessage(),"Your e-mail's been sent!", "Message is incorrect");

    }
}
