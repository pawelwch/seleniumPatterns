package tests;

import io.qameta.allure.Description;
import manager.DriverManager;
import manager.DriverUtils;
import org.testng.annotations.Test;
import page.objects.TestBase;
import page.objects.login.page.LoginPageMethods;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FailedLoginTests extends TestBase {

    @Test
    @Description("The goal of this test is to log in using not proper username and password" +
            " and check if warning message Invalid username or password is displayed")
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
