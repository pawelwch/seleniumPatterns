package tests;

import org.testng.annotations.Test;
import page.*;
import page.objects.*;

public class ShoppingCartTest extends TestBase{

    @Test
    public void asNotLoggedInUserIShallNotProceedToCheckout() {
        LandingPage landingPage = new LandingPage();
        landingPage.clickOnEnterStoreLink();

        LoginPage loginPage = new LoginPage();
        loginPage.clickOnFishImageButton();

        FishListPage fishListPage = new FishListPage();
        fishListPage.clickOnAngelfish();

        AngelfishListPage angelfishListPage = new AngelfishListPage();
        angelfishListPage.addSmallAngelfishtoChart();

        ShoppingCartSummaryPage shoppingCartSummaryPage = new ShoppingCartSummaryPage();
        shoppingCartSummaryPage.clickProceedToCheckoutButton();
    }


}
