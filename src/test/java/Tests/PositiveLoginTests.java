package Tests;

import Manager.DriverUtils;
import org.testng.annotations.Test;
import PageObjects.LoginPage.LoginPageMethods;

import static Navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PositiveLoginTests extends TestBase{

    @Test
    public void asUserLoginUsingValidLoginAndPassword() {

        DriverUtils.navigateToPage(LOGIN_URL);

       // LoginPageMethods loginPageMethods = new LoginPageMethods();

        boolean isBannerAfterLoginDisplayed = loginPageMethods
                .typeIntoUserNameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickOnLoginButton()
                .isBannerAfterLoginDisplayed();

        assertTrue(isBannerAfterLoginDisplayed);
    }
}

