package PageObjects.TopMenuPage;

import Manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TopMenuPageSelectors {

    protected WebDriver driver;

    TopMenuPageSelectors(WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#MenuContent a[href*='signonForm']")
    protected WebElement signOnLink;


}
