package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.time.Duration.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestAssertClass {
    WebDriver driver = null;
    @BeforeMethod
    public  void browseropen(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oadewusi\\IdeaProjects\\SeleniumIntro\\src\\chromedriver.exe");
        //launch browser
         driver = new ChromeDriver();
        //navigate to url
        driver.manage().window().maximize();
    }
@Test
    public void testifynav() throws InterruptedException {
        driver.get("https://testifyltd.com/");
        Wait wa = new WebDriverWait(driver, 60);
         wa.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='conv109158']/div[1]/div[4]")));
        Thread.sleep(5000);
         driver.findElement(By.xpath("//div[@id='conv109158']/div[1]/div[4]")).click();
        JavascriptExecutor ja = (JavascriptExecutor) driver;
        ja.executeScript("window.scrollBy(0,2000)");
     String email= driver.findElement(By.xpath("/html/body/div[@class='body_wrap']/div[@class='page_wrap']/footer/div[1]/div/div[@class='vc_column-inner']/div/div/div/div[2]/div[1]/div[@class='vc_column-inner']/div[@class='wpb_wrapper']/div[2]/div[@class='wpb_wrapper']/p/a[@href='mailto:info@testifyltd.com']")).getText();
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(email,"info@testifyltd.com");
        System.out.println("This is Testify Ltd's Email: "+email+" ");
   String location= driver.findElement(By.xpath("/html/body/div[@class='body_wrap']/div[@class='page_wrap']/footer/div[1]/div/div[@class='vc_column-inner']/div/div/div/div[2]/div[1]/div[@class='vc_column-inner']/div[@class='wpb_wrapper']/div[2]/div[@class='wpb_wrapper']/p/span[@class='contacts_address']")).getText();
  sa.assertEquals(location,"LOCATION: Nigeria");
    System.out.println(location);
    String phone= driver.findElement(By.xpath("/html/body/div[@class='body_wrap']/div[@class='page_wrap']/footer/div[1]/div/div[@class='vc_column-inner']/div/div/div/div[2]/div[1]/div[@class='vc_column-inner']/div[@class='wpb_wrapper']/div[2]/div[@class='wpb_wrapper']/p/span[@class='contacts_phone']/a[@href='tel:+2349058820971']")).getText();
    sa.assertEquals(phone,"(+234)905-882-0971");
    System.out.println(phone);
    sa.assertAll();

    //   FluentWait wait = new FluentWait<>(driver) .withTimeout(30, SECONDS) .pollingEvery(5, SECONDS) .ignoring(NoSuchElementException.class);

    }
}