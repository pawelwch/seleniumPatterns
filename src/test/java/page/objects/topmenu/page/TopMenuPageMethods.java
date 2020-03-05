package page.objects.topmenu.page;

import manager.DriverManager;
import page.objects.login.page.LoginPageMethods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import waits.WaitForElement;

public class TopMenuPageMethods extends TopMenuPageSelectors {

    private Logger logger = LogManager.getRootLogger();

    public TopMenuPageMethods(WebDriver driver){
        super(driver);
    }

    public LoginPageMethods clickOnSignInLink(){
        WaitForElement.waitUntilElementIsClickable(signOnLink);
        signOnLink.click();
        logger.info("Clicked on Sign on Link");
        return new LoginPageMethods(DriverManager.getWebDriver());
    }


}
