package page;

import base.BaseTest;


public class HomePage extends BaseTest {
    public void homeUrl(){
        if (driver.getCurrentUrl().contains("tr-TR")) {
            System.out.println("Ana sayfasındasınız");
            System.out.println("-----------------------------");
        } else {
            System.out.println("Ana sayfaya gidemediniz");
            System.out.println("-----------------------------");
        }
    }
}
