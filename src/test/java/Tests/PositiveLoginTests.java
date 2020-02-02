package Tests;

import Manager.DriverUtils;
import org.testng.annotations.Test;
import PageObjects.LoginPage;

import static Navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PositiveLoginTests extends TestBase{

    @Test
    public void asUserLoginUsingValidLoginAndPassword() {

        DriverUtils.navigateToPage(LOGIN_URL);

        LoginPage loginPage = new LoginPage();

        boolean isBannerAfterLoginDisplayed = loginPage
                .typeIntoUserNameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickOnLoginButton()
                .isBannerAfterLoginDisplayed();

        assertTrue(isBannerAfterLoginDisplayed);
    }
}

