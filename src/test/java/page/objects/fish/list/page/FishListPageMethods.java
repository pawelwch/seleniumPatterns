package page.objects.fish.list.page;

import page.objects.angelfish.list.page.AngelfishListPageMethods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import waits.WaitForElement;

public class FishListPageMethods extends FishListPageSelectors {

    public FishListPageMethods(WebDriver driver){
        super(driver);
    }

    private Logger logger = LogManager.getLogger(FishListPageMethods.class);

    public AngelfishListPageMethods clickOnAngelfishId(){
        WaitForElement.waitUntilElementIsVisible(angelfishLinkId);
        angelfishLinkId.click();
        logger.info("Clicked on Angelfish Link");
        return new AngelfishListPageMethods(driver);
    }

}
