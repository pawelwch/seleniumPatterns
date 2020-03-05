package tests;

import manager.DriverManager;
import manager.DriverUtils;
import org.testng.annotations.Test;
import page.objects.login.page.LoginPageMethods;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FailedLoginTests extends TestBase{

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {
        LoginPageMethods loginPageMethods = new LoginPageMethods(DriverManager.getWebDriver());

        DriverUtils.navigateToPage(LOGIN_URL);

        loginPageMethods
                .typeIntoUserNameField("User1")
                .typeIntoPasswordField("Password1234")
                .clickOnLoginButton();
        String warningMessage = loginPageMethods.getWarningMessage();

        assertEquals(warningMessage, "Invalid username or password. Signon failed.");
    }
}
