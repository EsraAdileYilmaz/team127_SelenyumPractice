package day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class P02_DriverMethodlari {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/resources/chromedriver");
        WebDriver driver=new ChromeDriver();
        //driver.navigate().to("https://www.google.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize(); // Pencereyi menüleri gizlemeden büyük hale getiriyor.
        // driver.manage().window().fullscreen(); //menüleri de gizleyerek tüm ekranı kaplar

        driver.quit();
    }
}
