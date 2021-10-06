package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;

import java.util.concurrent.TimeUnit;

public class TestAnnotiation {

    WebDriver driver = null;
    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oadewusi\\IdeaProjects\\SeleniumIntro\\src\\chromedriver.exe");
        //launch browser
         driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @Test
    public void googlenav() throws InterruptedException {

        //navigate to url
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body//form[@role='search']//div[@class='A8SBwf']//div[@class='a4bIc']/input[@role='combobox']")).sendKeys("Testify ltd");
        System.out.println("go to google and search for testify");
    }

       @Test
    public void gmailnav() throws InterruptedException {
        driver.get("https://www.facebook.com/");
           Thread.sleep(5000);
        System.out.println("................open face book ................");

    }
    @AfterMethod
    public void closegmailnav(){
        driver.quit();
        System.out.println("Close each browser");
    }
}
