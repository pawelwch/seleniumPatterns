package PageObjects.CheckoutPage;

import Manager.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPageMethods {
    public CheckoutPageMethods() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }
}
