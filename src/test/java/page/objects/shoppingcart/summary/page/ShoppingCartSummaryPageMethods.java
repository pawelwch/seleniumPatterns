package page.objects.shoppingcart.summary.page;

import page.objects.checkout.page.CheckoutPageMethods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import waits.WaitForElement;

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
