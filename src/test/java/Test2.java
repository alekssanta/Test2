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

public class Test2  {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://market.yandex.ru/");
        driver.findElement(By.id("header-search")).clear();
        driver.findElement(By.id("header-search")).click();
        driver.findElement(By.id("header-search")).sendKeys("macbook");

        driver.findElement(By.cssSelector(".button2_type_submit")).click();

        driver.findElement(By.className("wishlist-control")).click();
driver.get("https://market.yandex.ru/my/wishlist?track=rmmbr");

         //driver.findElement(By.xpath("//a[contains(@href, '/my/wishlist?track=rmmbr')]")).click();
//xpath=//a[contains(@href, '/my/wishlist?track=rmmbr')]  клик по отложенным
        Thread.sleep(2000);
        driver.quit();

    }
//    private boolean isDisplayedOnPage(WebElementFacade wef){
//        try{
//            return wef.isDisplayed();
//        } catch (NoSuchElementException nsee){
//            return false;
//        }
//    }


}
