package page;

import manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartSummaryPage {

    @FindBy(css = "a[href$='newOrderForm='") private WebElement proceedToCheckoutButton;

    public ShoppingCartSummaryPage(){
        PageFactory.initElements(DriverManager.getWebDriver(),this);
    }

    public void clickProceedToCheckoutButton(){
        proceedToCheckoutButton.click();
    }


}
