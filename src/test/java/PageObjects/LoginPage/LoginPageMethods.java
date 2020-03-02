package PageObjects.LoginPage;

import PageObjects.FooterPage.FooterPageMethods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import Waits.WaitForElement;


public class LoginPageMethods extends LoginPageSelectors {

    public LoginPageMethods(WebDriver driver) {
        super(driver);
    }

    private Logger logger = LogManager.getRootLogger();

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
        return new FooterPageMethods(driver);

    }

    public String getWarningMessage() {

        WaitForElement.waitUntilElementIsVisible(messageLabel);
        String warningText = messageLabel.getText();
        logger.info("Returned warning message was: {}", warningText);
        return warningText;

    }
}
