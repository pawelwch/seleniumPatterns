package Tests;

import Manager.DriverUtils;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.logging.LogManager;

import static Navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertEquals;


public class FailedLoginTests extends TestBase{

    @Test
    public void asUserTryToLogInWithIncorrectLoginAndPassword() {

        DriverUtils.navigateToPage(LOGIN_URL);

        loginPageMethods
                .typeIntoUserNameField("User1")
                .typeIntoPasswordField("Password1234")
                .clickOnLoginButton();
        String warningMessage = loginPageMethods.getWarningMessage();

        assertEquals(warningMessage, "Invalid username or password. Signon failed.");
    }
}
