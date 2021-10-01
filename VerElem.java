package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerElem {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\oadewusi\\IdeaProjects\\SeleniumIntro\\src\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //navigate to url
        driver.get("https://demoqa.com/");
        Thread.sleep(5000);
        JavascriptExecutor je = (JavascriptExecutor) driver;
        je.executeScript("window.scrollBy(0,300)");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("div:nth-of-type(2) > div > .avatar.mx-auto.white > svg")).click();
        Thread.sleep(5000);
        JavascriptExecutor ja = (JavascriptExecutor) driver;
        ja.executeScript("window.scrollBy(0,300)");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']//div[@class='accordion']/div[2]/span[@class='group-header']/div[@class='header-wrapper']/div[@class='header-text']")).click();
        driver.findElement(By.xpath("//div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']//div[@class='accordion']/div[2]/div/ul[@class='menu-list']/li/span[@class='text']")).click();
       JavascriptExecutor jw = (JavascriptExecutor) driver;
        jw.executeScript("window.scrollBy(0,300)");
        Thread.sleep(5000);
       boolean state=  driver.findElement(By.xpath("//div[@id='state']/div/div[1]/div[.='Select State']")).isEnabled();
       System.out.println(state);
       boolean city=  driver.findElement(By.cssSelector("div.body-height:nth-child(2) div.container.playgound-body div.row div.col-12.mt-4.col-md-6:nth-child(2) div.practice-form-wrapper form:nth-child(2) div.mt-2.row:nth-child(10) > div.col-md-4.col-sm-12:nth-child(3)")).isEnabled();
       System.out.println(city);




    }
}


