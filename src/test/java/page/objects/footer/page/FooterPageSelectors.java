package page.objects.footer.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FooterPageSelectors {

    protected WebDriver driver;

    FooterPageSelectors(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#Banner img[src*='dog']")
    protected WebElement bannerAfterLoginLogo;
}
