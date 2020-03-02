package Tests;

import Configuration.ConfigurationProperties;
import Configuration.PropertiesLoader;
import Manager.DriverManager;
import Manager.DriverUtils;
import PageObjects.CheckoutPage.CheckoutPageMethods;
import PageObjects.FishListPage.FishListPageMethods;
import PageObjects.FooterPage.FooterPageMethods;
import PageObjects.FooterPage.FooterPageSelectors;
import PageObjects.LandingPage.LandingPageMethods;
import PageObjects.LoginPage.LoginPageMethods;
import PageObjects.ShoppingCartSummaryPage.ShoppingCartSummaryPageMethods;
import PageObjects.TopMenuPage.TopMenuPageMethods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.Properties;
import java.util.logging.LogManager;
import java.util.logging.Logger;

import static Navigation.ApplicationURLs.APPLICATION_URL;

public class TestBase {

    protected WebDriver driver;

    public static CheckoutPageMethods checkoutPageMethods;
    public static FishListPageMethods fishListPageMethods;
    public static FooterPageMethods footerPageMethods;
    public static LandingPageMethods landingPageMethods;
    public static LoginPageMethods loginPageMethods;
    public static ShoppingCartSummaryPageMethods shoppingCartSummaryPageMethods;
    public static TopMenuPageMethods topMenuPageMethods;


    @BeforeClass(alwaysRun = true)
    public void beforeClass() {
        PropertiesLoader propertiesLoader = new PropertiesLoader();
        Properties propertiesFromFile = propertiesLoader.getPropertiesFromFile("configuration.properties");
        ConfigurationProperties.setProperties(propertiesFromFile);
        checkoutPageMethods = new CheckoutPageMethods();
        fishListPageMethods = new FishListPageMethods(driver);
        footerPageMethods = new FooterPageMethods(driver);
        landingPageMethods = new LandingPageMethods(driver);
        loginPageMethods = new LoginPageMethods(driver);
        shoppingCartSummaryPageMethods = new ShoppingCartSummaryPageMethods(driver);
        topMenuPageMethods = new TopMenuPageMethods(driver);

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
