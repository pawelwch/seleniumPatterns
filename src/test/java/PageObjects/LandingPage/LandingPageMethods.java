package PageObjects.LandingPage;

import Manager.DriverManager;
import PageObjects.TopMenuPage.TopMenuPageMethods;
import Tests.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Waits.WaitForElement;

public class LandingPageMethods extends LandingPageSelectors {

    public LandingPageMethods(WebDriver driver){
        super(driver);
    }

    private Logger logger = LogManager.getRootLogger();

    public TopMenuPageMethods clickOnEnterStoreLink() {
        WaitForElement.waitUntilElementIsClickable(enterStoreLink);
        enterStoreLink.click();
        logger.info("Clicked on Enter Store link");
        return new TopMenuPageMethods(driver);
    }


}
