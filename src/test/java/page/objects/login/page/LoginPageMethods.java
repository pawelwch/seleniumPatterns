package page.objects.login.page;

import manager.DriverManager;
import page.objects.footer.page.FooterPageMethods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import waits.WaitForElement;

public class LoginPageMethods extends LoginPageSelectors {

    private Logger logger = LogManager.getRootLogger();

    public LoginPageMethods(WebDriver driver) {
        super(driver);
    }

    public LoginPageMethods typeIntoUserNameField(String username) {
        WaitForElement.waitUntilElementIsVisible(usernameField);
        usernameField.sendKeys(username);
        logger.info("Typed into User Name Field {}", username);
        return this;
    }

    public LoginPageMethods typeIntoPasswordField(String password) {
        passwordField.clear();
        passwordField.sendKeys(password);
        logger.info("Typed into Password Field {}", password);
        return this;
    }

    public FooterPageMethods clickOnLoginButton() {
        signOnButton.click();
        logger.info("Clicked on Login Button");
        return new FooterPageMethods(DriverManager.getWebDriver());
    }

    public String getWarningMessage() {
        WaitForElement.waitUntilElementIsVisible(messageLabel);
        String warningText = messageLabel.getText();
        logger.info("Returned warning message was: {}", warningText);
        return warningText;
    }
}
