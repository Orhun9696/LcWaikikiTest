package page;

import base.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginPage extends BaseTest {
    public void beLogin() {
        WebElement logInElement = driver.findElement(By.className("dropdown-toggle"));
        logInElement.click();
        WebElement popUpElement = driver.findElement(By.className("pull-rightleft"));
        popUpElement.click();
        if (driver.getCurrentUrl().contains("giris")) {
            System.out.println("Login sayfasındasınız");
            System.out.println("-----------------------------");
        } else {
            System.out.println("Login sayfasına gidemediniz");
            System.out.println("-----------------------------");
        }
        driver.findElement(By.id("LoginEmail")).sendKeys("orhunyildirim1@hotmail.com");
        driver.findElement(By.id("Password")).sendKeys("123456orhun");
        driver.findElement(By.id("loginLink")).click();

    }
}