package PageObjects.TopMenuPage;

import Manager.DriverManager;
import PageObjects.LoginPage.LoginPageMethods;
import Tests.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Waits.WaitForElement;

public class TopMenuPageMethods extends TopMenuPageSelectors {

    public TopMenuPageMethods(WebDriver driver){
        super(driver);
    }

    private Logger logger = LogManager.getRootLogger();

    public LoginPageMethods clickOnSignInLink(){
        WaitForElement.waitUntilElementIsClickable(signOnLink);
        signOnLink.click();
        logger.info("Clicked on Sign on Link");
        return new LoginPageMethods(driver);
    }


}
