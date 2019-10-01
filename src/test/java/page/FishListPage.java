package page;

import manager.DriverManager;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FishListPage{

    @FindBy(css = "tr:nth-child(2) a") private WebElement angelfishLinkId;

    public FishListPage(){
        PageFactory.initElements(DriverManager.getWebDriver(), this);
    }

    public void clickOnAngelfish(){
        angelfishLinkId.click();
    }

}
