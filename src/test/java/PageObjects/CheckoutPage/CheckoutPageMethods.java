package PageObjects.CheckoutPage;

import Manager.DriverManager;
import Tests.TestBase;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPageMethods extends CheckoutPageSelectors {
    public CheckoutPageMethods() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }
}
