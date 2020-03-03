package PageObjects.AngelfishListPage;

import Manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AngelfishListPageSelectors {

    protected WebDriver driver;

    AngelfishListPageSelectors(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "a.Button[href$='EST-2'") protected WebElement addSmallAngelfishToCartButton;
}
