package Manager;

import Configuration.LocalWebDriverProperties;
import Driver.BrowserFactory;
import Driver.BrowserType;
import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static WebDriver driver;

    private DriverManager(){
    }

    public static WebDriver getWebDriver() {

        if (driver == null) {
            driver = BrowserFactory.getBrowser(LocalWebDriverProperties.getLocalBrowser(), true);
        }

        return driver;
    }

    public static void disposeDriver(){
        driver.close();
        if (!LocalWebDriverProperties.getLocalBrowser().equals(BrowserType.FIREFOX)){
            driver.quit();
        }
        driver = null;
    }
}
