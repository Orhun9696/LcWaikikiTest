package tests;

import base.BaseTest;
import org.junit.Test;
import page.BasketPage;
import page.HomePage;
import page.LoginPage;
import page.ProductPage;

public class TestCase extends BaseTest {
    @Test
    public void startTest(){
        LoginPage loginPage = new LoginPage();
        HomePage homePage = new HomePage() ;
        ProductPage productPage = new ProductPage() ;
        BasketPage basketPage = new BasketPage() ;
        homePage.homeUrl();
        loginPage.beLogin();
        productPage.findProduct();
        basketPage.processProduct();
    }

}
