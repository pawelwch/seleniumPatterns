package PageObjects.ShoppingCartSummaryPage;

import Manager.DriverManager;
import PageObjects.CheckoutPage.CheckoutPageMethods;
import Tests.TestBase;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Waits.WaitForElement;

public class ShoppingCartSummaryPageMethods extends ShoppingCartSummaryPageSelectors {

    private Logger logger = LogManager.getRootLogger();

    public ShoppingCartSummaryPageMethods(WebDriver driver){
        super(driver);
    }

    public CheckoutPageMethods clickOnProceedToCheckout(){
        WaitForElement.waitUntilElementIsVisible(proceedToCheckoutButton);
        proceedToCheckoutButton.click();
        logger.info("Clicked on Proceed to checkout Button");
        return new CheckoutPageMethods();
    }


}
