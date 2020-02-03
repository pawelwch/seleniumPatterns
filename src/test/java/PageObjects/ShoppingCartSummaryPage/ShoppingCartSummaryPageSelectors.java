package PageObjects.ShoppingCartSummaryPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartSummaryPageSelectors {

    protected WebDriver driver;

    protected ShoppingCartSummaryPageSelectors(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href$='newOrderForm=']") protected WebElement proceedToCheckoutButton;

}
