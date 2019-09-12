import org.junit.After;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.WebDriver.*;
// сделать before & after в тесте


public class Test2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;


//        @After
//        public void End{
//if (driver !=null)
//    driver.quit();


        WebDriverManager.chromedriver().setup();

        driver = new ChromeDriver();

        driver.get("https://market.yandex.ru/"); // открываем страницу браузера
        driver.findElement(By.id("header-search")).clear(); // очищаеем строку поиска
        driver.findElement(By.id("header-search")).sendKeys("macbook Pro 15"); // отправляем запрос
        Thread.sleep(2000);
        driver.findElement(By.cssSelector(".button2_type_submit")).click();  // клацаем по кнопке "найти"
        Thread.sleep(2000);
        driver.findElement(By.className("wishlist-control")).click(); // клацаем по кнопке "добавить в отложенные"
        Thread.sleep(2000);
        driver.get("https://market.yandex.ru/my/wishlist"); // заходим в "отложенные

        // driver.findElement(By.xpath("//span[text()='₽']"));



        Thread.sleep(2000);



//        try {
//            Assert.assertTrue(driver.findElement(By.xpath("//html")).getText().contains("Macbook Pro 15"));
//
//        } catch (Error e) {
//            System.out.println("Не нашел");
//        }


        boolean isPresent = driver.findElements(By.cssSelector(".shop-history__link")).size() >0;
       // boolean isPresent = driver.findElements(By.xpath("//a[contains(@href,'https://market-click2.yandex.ru/redir/')]")).size() > 0;

        if (isPresent) System.out.println("Товар со ссылкой в отложенных");
        else {
            System.out.println("Товара нет");
        }

//        Boolean checkTitle = driver.findElement(By.xpath("//*[contains(@text(),'Macbook Pro')]")) > 0;
//        if (checkTitle = true) {
//            System.out.println("Находится Macbook Pro");
//        }
//        else System.out.println("Товар с другим наименованием");
        driver.quit();
    }


}



