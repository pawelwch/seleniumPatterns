package PageObjects.LandingPage;

import Manager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPageSelectors {

    protected WebDriver driver;

    public LandingPageSelectors(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "#Content a") protected WebElement enterStoreLink;
}
