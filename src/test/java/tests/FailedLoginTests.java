package tests;

import org.testng.annotations.Test;
import page.objects.LandingPage;
import page.objects.LoginPage;
import page.objects.TopMenuPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FailedLoginTests extends TestBase{

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {

        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        TopMenuPage topMenuPage = new TopMenuPage();
        topMenuPage.clickOnSignInLink();

        LoginPage loginPage = new LoginPage();
        loginPage.typeIntoUserNameField("User1");
        loginPage.typeIntoPasswordField("Password1234");
        loginPage.clickOnLoginButton();

        String warningMessage = loginPage.getWarningMessage();
        assertEquals(warningMessage, "Invalid username or password. Signon failed.");
    }

}
