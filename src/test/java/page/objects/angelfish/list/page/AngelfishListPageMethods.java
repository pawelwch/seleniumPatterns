package page.objects.angelfish.list.page;

import manager.DriverManager;
import page.objects.shoppingcart.summary.page.ShoppingCartSummaryPageMethods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import waits.WaitForElement;

public class AngelfishListPageMethods extends AngelfishListPageSelectors {

    private Logger logger = LogManager.getLogger(AngelfishListPageMethods.class);

    public AngelfishListPageMethods(WebDriver driver){
        super(driver);
    }

    public ShoppingCartSummaryPageMethods clickOnAddToCartSmallAngelfish(){
        WaitForElement.waitUntilElementIsVisible(addSmallAngelfishToCartButton);
        addSmallAngelfishToCartButton.click();
        logger.info("Clicked on Small Angelfish Add to cart button");
        return new ShoppingCartSummaryPageMethods(DriverManager.getWebDriver());
    }

}
