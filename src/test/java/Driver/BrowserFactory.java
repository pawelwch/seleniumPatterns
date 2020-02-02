package Driver;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;


public class BrowserFactory {

    private static WebDriver driver;

    public BrowserFactory(WebDriver driver){
        this.driver = driver;
    }

    public static WebDriver getBrowser(BrowserType browserType, boolean webDriverManager) {
        if (!webDriverManager) {
            switch (browserType) {
                case CHROME:
                    System.setProperty("webdriver.chrome.driver", "/home/maryna/drivers/chromedriver");
                    return new ChromeDriver();
                case FIREFOX:
                    System.setProperty("webdriver.gecko.driver", "/home/maryna/drivers/geckodriver");
                    return new FirefoxDriver();
//                case IE:
//                    System.setProperty("webdriver.ie.driver", "");
//                    return new InternetExplorerDriver();
                default:
                    throw new IllegalStateException("Unknown browser type! Please check your configuration");
            }
        } else {
            switch (browserType) {
                case CHROME:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
                case FIREFOX:
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
//                case IE:
//                    WebDriverManager.iedriver().setup();
//                    driver = new InternetExplorerDriver();
//                    break;
                default:
                    throw new IllegalStateException("None of drivers has been setup");
            }
        }
        return driver;
    }
}


