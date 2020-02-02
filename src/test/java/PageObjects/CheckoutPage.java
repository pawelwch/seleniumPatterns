package PageObjects;

import Manager.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    public CheckoutPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }
}
