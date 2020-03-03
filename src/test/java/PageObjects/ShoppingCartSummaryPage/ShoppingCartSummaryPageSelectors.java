package PageObjects.ShoppingCartSummaryPage;

import Manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartSummaryPageSelectors {

    protected WebDriver driver;

    ShoppingCartSummaryPageSelectors(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a[href$='newOrderForm=']") protected WebElement proceedToCheckoutButton;

}
