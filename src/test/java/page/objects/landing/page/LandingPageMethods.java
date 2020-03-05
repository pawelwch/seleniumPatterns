package page.objects.landing.page;

import manager.DriverManager;
import page.objects.topmenu.page.TopMenuPageMethods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import waits.WaitForElement;

public class LandingPageMethods extends LandingPageSelectors {

    private Logger logger = LogManager.getRootLogger();

    public LandingPageMethods(WebDriver driver){
        super(driver);
    }

    public TopMenuPageMethods clickOnEnterStoreLink() {
        WaitForElement.waitUntilElementIsClickable(enterStoreLink);
        enterStoreLink.click();
        logger.info("Clicked on Enter Store link");
        return new TopMenuPageMethods(DriverManager.getWebDriver());
    }


}
