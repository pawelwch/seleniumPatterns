package page.objects.footer.page;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import waits.WaitForElement;

public class FooterPageMethods extends FooterPageSelectors {

    private Logger logger = LogManager.getRootLogger();

    public FooterPageMethods(WebDriver driver) {
        super(driver);
    }

    public boolean isBannerAfterLoginDisplayed() {
        WaitForElement.waitUntilElementIsVisible(bannerAfterLoginLogo);
        boolean isDisplayed = bannerAfterLoginLogo.isDisplayed();
        logger.info("Returning status of banner after login: {}", isDisplayed);
        return isDisplayed;
    }


}
