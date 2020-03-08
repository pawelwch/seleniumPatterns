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

public class PositiveLoginTests extends TestBase {

    @Test
    @Description("The goal of this test is to log in using proper username and password" +
            " and check if Dog Banner is displayed after")
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

