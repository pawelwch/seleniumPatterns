package page.objects.login.page;

import io.qameta.allure.Step;
import manager.DriverManager;
import page.objects.footer.page.FooterPageMethods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import waits.WaitForElement;

public class LoginPageMethods extends LoginPageSelectors {

    private Logger logger = LogManager.getLogger(LoginPageMethods.class);

    public LoginPageMethods(WebDriver driver) {
        super(driver);
    }

    @Step("Type into User Name Field {username}")
    public LoginPageMethods typeIntoUserNameField(String username) {
        WaitForElement.waitUntilElementIsVisible(usernameField);
        usernameField.sendKeys(username);
        logger.info("Typed into User Name Field {}", username);
        return this;
    }

    @Step("Type into Password Field {password}")
    public LoginPageMethods typeIntoPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        logger.info("Typed into Password Field {}", password);
        return this;
    }

    @Step("Click on Login Button")
    public FooterPageMethods clickOnLoginButton() {
        signOnButton.click();
        logger.info("Clicked on Login Button");
        return new FooterPageMethods(DriverManager.getWebDriver());
    }

    @Step("Getting warning message from Login Page")
    public String getWarningMessage() {
        WaitForElement.waitUntilElementIsVisible(messageLabel);
        String warningText = messageLabel.getText();
        logger.info("Returned warning message was: {}", warningText);
        return warningText;
    }
}
