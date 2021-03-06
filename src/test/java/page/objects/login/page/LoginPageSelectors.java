package page.objects.login.page;

import page.objects.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageSelectors extends TestBase {

    protected WebDriver driver;

    LoginPageSelectors(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(name = "username")
    protected WebElement usernameField;

    @FindBy(name = "password")
    protected WebElement passwordField;

    @FindBy(name = "signon")
    protected WebElement signOnButton;

    @FindBy(css = "#Content ul[class='messages'] li")
    protected WebElement messageLabel;




}
