package page.objects;

import manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import page.objects.AngelfishListPage;
import tests.TestBase;
import waits.WaitForElement;

public class FishListPage extends TestBase {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "tr:nth-child(2) a") private WebElement angelfishLinkId;

    public FishListPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public AngelfishListPage clickOnAngelfishId(){
        WaitForElement.waitUntilElementIsVisible(angelfishLinkId);
        angelfishLinkId.click();
        logger.info("Clicked on Angelfish Link");
        return new AngelfishListPage();
    }

}
