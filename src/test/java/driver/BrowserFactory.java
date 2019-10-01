package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserFactory {

    public static WebDriver getBrowser(BrowserType browserType){
        switch (browserType){
            case CHROME:
                System.setProperty("webdriver.chrome.driver", "/home/maryna/drivers/chromedriverNowy");
                return new ChromeDriver();
            case FIREFOX:
                System.setProperty("webrdiver.gecko.driver", "");
                return new FirefoxDriver();
            case IE:
                System.setProperty("webdriver.ie.driver", "");
                return new InternetExplorerDriver();
            default:
                throw new IllegalStateException("Unknown browser type! Please check your configuration");
        }
    }
}
