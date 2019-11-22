package page.objects;

import manager.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPage {
    public CheckoutPage() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }
}
