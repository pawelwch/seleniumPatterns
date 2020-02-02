package PageObjects;

import Manager.DriverManager;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Waits.WaitForElement;

public class ShoppingCartSummaryPage {

    private Logger logger = LogManager.getRootLogger();

    @FindBy(css = "a[href$='newOrderForm=']") private WebElement proceedToCheckoutButton;

    public ShoppingCartSummaryPage(){
        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    public CheckoutPage clickOnProceedToCheckout(){
        WaitForElement.waitUntilElementIsVisible(proceedToCheckoutButton);
        proceedToCheckoutButton.click();
        logger.info("Clicked on Proceed to checkout Button");
        return new CheckoutPage();
    }


}
