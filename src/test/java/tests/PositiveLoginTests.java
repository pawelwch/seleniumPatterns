package tests;

import manager.DriverManager;
import manager.DriverUtils;
import org.testng.annotations.Test;
import page.objects.footer.page.FooterPageMethods;
import page.objects.login.page.LoginPageMethods;

import static navigation.ApplicationURLs.LOGIN_URL;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class PositiveLoginTests extends TestBase {

    @Test
    public void asUserLoginUsingValidLoginAndPassword() {
        LoginPageMethods loginPageMethods = new LoginPageMethods(DriverManager.getWebDriver());

        DriverUtils.navigateToPage(LOGIN_URL);

        boolean isBannerAfterLoginDisplayed = loginPageMethods
                .typeIntoUserNameField("j2ee")
                .typeIntoPasswordField("j2ee")
                .clickOnLoginButton()
                .isBannerAfterLoginDisplayed();

        assertTrue(isBannerAfterLoginDisplayed);
    }
}

