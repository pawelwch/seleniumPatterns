package PageObjects.TopMenuPage;

import Manager.DriverManager;
import PageObjects.LoginPage.LoginPageMethods;
import Tests.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Waits.WaitForElement;

public class TopMenuPageMethods extends TestBase {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    private WebElement signOnLink;

    public TopMenuPageMethods() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public LoginPageMethods clickOnSignInLink(){
        WaitForElement.waitUntilElementIsClickable(signOnLink);
        signOnLink.click();
        logger.info("Clicked on Sign on Link");
        return new LoginPageMethods();
    }


}