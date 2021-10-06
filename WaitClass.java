package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class WaitClass {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","C:\\Users\\oadewusi\\IdeaProjects\\SeleniumIntro\\src\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait( 40, TimeUnit.SECONDS);
        //maximize window
        driver.manage().window().maximize();
        //navigate to url
        driver.get("https://gmail.com/");
        driver.findElement(By.xpath("/html//input[@id='identifierId']")).sendKeys("olubusolaogungbemi");
        driver.findElement(By.xpath("//div[@id='identifierNext']//button[@type='button']/span[@class='VfPpkd-vQzf8d']")).click();
        driver.findElement(By.xpath("//div[@id='next']/div[1]/button")).click();
        driver.findElement(By.cssSelector(".button.button--medium.button--mobile-before-hero-only")).click();
        driver.findElement(By.xpath("/html//input[@id='identifierId']")).sendKeys("olubusolaogungbemi");
        driver.findElement(By.xpath("//div[@id='identifierNext']//button[@type='button']/span[@class='VfPpkd-vQzf8d']")).click();
        driver.findElement(By.xpath("//div[@id='next']/div[1]/button")).click();
    }
}
