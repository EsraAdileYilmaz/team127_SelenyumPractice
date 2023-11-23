package day02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P01 {

    public static void main(String[] args) {
         /*
    1- http://babayigit.net/testdocs/ adresine gidilir
    2- INFO FORM butonuna tıklanır
    3- Form verileri girilir
    4- Save butonuna tıklanır
    5- Sonuç yazdırılır
     */

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        //1- http://babayigit.net/testdocs/ adresine gidilir
        driver.get("http://babayigit.net/testdocs/");

        // 2- INFO FORM butonuna tıklanır
        driver.findElement(By.xpath("//img[@src='img/info.png']")).click();


        //3- Form verileri girilir
        //driver.findElement(By.id("firstName")).sendKeys("Tarık");
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Esra");
        driver.findElement(By.id("lastName")).sendKeys("yilmaz");
        driver.findElement(By.id("email")).sendKeys("yigit@yigit.com");
        driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("00905556667788");
        driver.findElement(By.xpath("//input[@id='age']")).sendKeys("41");
        driver.findElement(By.xpath("//input[@name='occupation']")).sendKeys("engineer");
        driver.findElement(By.id("female")).click();
        driver.findElement(By.id("city")).sendKeys("Bursa");
        driver.findElement(By.id("country")).sendKeys("Turkiye");

        //4- Save butonuna tıklanır
        driver.findElement(By.xpath("//button[@type='button']")).click();

        //5- Sonuç yazdırılır
        System.out.println("Result message: "+driver.findElement(By.xpath("//p[@id='resultMessage']")).getText());

        driver.quit();






    }


}
