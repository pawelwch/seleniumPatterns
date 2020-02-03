package Tests;

import Manager.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import PageObjects.LoginPage.LoginPageMethods;

import static Navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class FailedLoginTests extends TestBase{


    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {
        DriverUtils.navigateToPage(LOGIN_URL);

       // LoginPageMethods loginPageMethods = new LoginPageMethods();
        loginPageMethods
                .typeIntoUserNameField("User1")
                .typeIntoPasswordField("Password1234")
                .clickOnLoginButton();
        String warningMessage = loginPageMethods.getWarningMessage();

        assertEquals(warningMessage, "Invalid username or password. Signon failed.");
    }
}
