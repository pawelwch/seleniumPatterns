package page.objects.checkout.page;

import manager.DriverManager;
import org.openqa.selenium.support.PageFactory;

public class CheckoutPageMethods extends CheckoutPageSelectors {
    public CheckoutPageMethods() {
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }
}
