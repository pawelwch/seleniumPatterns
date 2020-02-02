package PageObjects.FishListPage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishListPageSelectors {
    protected WebDriver driver;

    protected FishListPageSelectors(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(css = "tr:nth-child(2) a") protected  WebElement angelfishLinkId;
}
