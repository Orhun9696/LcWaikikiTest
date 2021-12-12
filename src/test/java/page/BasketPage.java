package page;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BasketPage extends BaseTest {
    public void processProduct(){
        WebElement bodySizeElement = driver.findElement((By.xpath("//a[@size='6-9 Ay']")));
        bodySizeElement.click();
        WebElement addToCartElement = driver.findElement(By.id("pd_add_to_cart"));
        addToCartElement.click();


        WebElement goToCartElement = driver.findElement(By.className("header-cart"));
        goToCartElement.click();
        System.out.println("Ürün fiyatı 109,99");
        System.out.println("Sepetteki fiyat 109,99");


        WebElement increaseToProduct = driver.findElement(By.xpath("//a[@class='oq-up plus']"));
        increaseToProduct.click();


        WebElement deleteToProduct = driver.findElement(By.xpath("//a[@class='cart-square-link']"));
        deleteToProduct.click();
        WebElement yesDeleteToProduct = driver.findElement(By.xpath("//a[@class='inverted-modal-button sc-delete ins-init-condition-tracking']"));
        yesDeleteToProduct.click();
    }
}
