package PageObjects.FishListPage;

import Manager.DriverManager;
import PageObjects.AngelfishListPage.AngelfishListPageMethods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Tests.TestBase;
import Waits.WaitForElement;

public class FishListPageMethods extends TestBase {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "tr:nth-child(2) a") private WebElement angelfishLinkId;

    public FishListPageMethods(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public AngelfishListPageMethods clickOnAngelfishId(){
        WaitForElement.waitUntilElementIsVisible(angelfishLinkId);
        angelfishLinkId.click();
        logger.info("Clicked on Angelfish Link");
        return new AngelfishListPageMethods();
    }

}
