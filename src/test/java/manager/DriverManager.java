package manager;

import configuration.LocalWebDriverProperties;
import driver.BrowserFactory;
import driver.BrowserType;
import org.openqa.selenium.WebDriver;

public class DriverManager {

    private static WebDriver driver;

    private DriverManager() {
    }

    //Metoda dostarczająca WebDriver do testów
    public static WebDriver getWebDriver() {

        if (driver == null) {
            /*
             * Konkretną implementację WebDrivera (ChromeDriver/FireFoxDriver itp.) dostarcza metoda getBrowser() z klasy BrowserFactory na podstawie wartości pobranej z
             * metody getLocalBrowser() (klasa LocalWebDriverProperties), która dostarcza wartość nazwy przeglądarki, która ma zostać uruchomiona.
             */
            driver = BrowserFactory.getBrowser(LocalWebDriverProperties.getLocalBrowser());
        }
        return driver;
    }


    //Metoda niszcząca procesy WebDrivera;
    public static void disposeDriver(){
        driver.close();
        if (!LocalWebDriverProperties.getLocalBrowser().equals(BrowserType.FIREFOX)) {
            driver.quit();
        }
        driver = null;
    }
}
