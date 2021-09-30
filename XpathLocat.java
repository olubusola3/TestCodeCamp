package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class XpathLocat {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\oadewusi\\IdeaProjects\\SeleniumIntro\\src\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //navigate to url
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.xpath("/html//input[@id='user-name']")).sendKeys("problem_user");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html//input[@id='password']")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html//input[@id='login-button']")).click();
        Thread.sleep(5000);
       driver.findElement(By.xpath("/html//button[@id='add-to-cart-sauce-labs-backpack']")).click();
        Thread.sleep(5000);
       driver.findElement(By.xpath("//div[@id='shopping_cart_container']/a[@class='shopping_cart_link']")).click();
        Thread.sleep(5000);
      driver.findElement(By.xpath("/html//button[@id='checkout']")).click();


        // Thread.sleep(5000);
        // driver.findElement(By.className("ic")).click();
      //  Thread.sleep(5000);
      //  driver.findElement(By.cssSelector(".btn._prim._md.-mls")).click();
    }
}