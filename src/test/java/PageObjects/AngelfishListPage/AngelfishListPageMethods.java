package PageObjects.AngelfishListPage;

import Manager.DriverManager;
import PageObjects.ShoppingCartSummaryPage.ShoppingCartSummaryPageMethods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Tests.TestBase;
import Waits.WaitForElement;

public class AngelfishListPageMethods extends AngelfishListPageSelectors {

    public AngelfishListPageMethods(WebDriver driver){
        super(driver);
    }

    private Logger logger = LogManager.getRootLogger();

    public ShoppingCartSummaryPageMethods clickOnAddToCartSmallAngelfish(){
        WaitForElement.waitUntilElementIsVisible(addSmallAngelfishToCartButton);
        addSmallAngelfishToCartButton.click();
        logger.info("Clicked on Small Angelfish Add to cart button");
        return new ShoppingCartSummaryPageMethods(driver);
    }

}
