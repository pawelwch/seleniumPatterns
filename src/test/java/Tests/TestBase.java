package Tests;

import Configuration.ConfigurationProperties;
import Configuration.PropertiesLoader;
import Manager.DriverManager;
import Manager.DriverUtils;
import PageObjects.CheckoutPage.CheckoutPageMethods;
import PageObjects.FishListPage.FishListPageMethods;
import PageObjects.FooterPage.FooterPageMethods;
import PageObjects.LandingPage.LandingPageMethods;
import PageObjects.LoginPage.LoginPageMethods;
import PageObjects.ShoppingCartSummaryPage.ShoppingCartSummaryPageMethods;
import PageObjects.TopMenuPage.TopMenuPageMethods;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.Properties;

import static Navigation.ApplicationURLs.APPLICATION_URL;

public class TestBase {

    protected WebDriver driver;

    @BeforeClass(alwaysRun = true)
    public void beforeClass() {

        PropertiesLoader propertiesLoader = new PropertiesLoader();
        Properties propertiesFromFile = propertiesLoader.getPropertiesFromFile("configuration.properties");
        ConfigurationProperties.setProperties(propertiesFromFile);
        driver = DriverManager.getWebDriver();
    }

    @BeforeMethod
    public void beforeTest() {
        DriverManager.getWebDriver();
        DriverUtils.setInitialConfiguration();
        DriverUtils.navigateToPage(APPLICATION_URL);
    }

    @AfterMethod
    public void afterTest() {
        DriverManager.disposeDriver();
    }

}
