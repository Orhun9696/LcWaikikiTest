package page;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class ProductPage extends BaseTest {
    public void findProduct() {
        WebElement nameElement = driver.findElement(By.id("search_input"));
        nameElement.click();
        nameElement.sendKeys("Pantalon");
        WebElement searchElement = driver.findElement(By.className("searchButton"));
        searchElement.click();


        WebElement moreProductsElement = driver.findElement(By.className("lazy-load-current"));
        moreProductsElement.click();
        WebElement selectProductElement = driver.findElement(By.id("model_1087643_4839007"));
        selectProductElement.click();
    }
}