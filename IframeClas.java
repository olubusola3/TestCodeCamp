package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeClas {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\oadewusi\\IdeaProjects\\SeleniumIntro\\src\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //navigate to url
        driver.get("https://jqueryui.com/");
        JavascriptExecutor ja = (JavascriptExecutor) driver;
        ja.executeScript("window.scrollBy(0,500)");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='sidebar']/aside[2]/ul//a[@href='https://jqueryui.com/dialog/']")).click();
        JavascriptExecutor jae = (JavascriptExecutor) driver;
        jae.executeScript("window.scrollBy(0,500)");
        Thread.sleep(5000);
        driver.switchTo().frame(0);
        JavascriptExecutor jw = (JavascriptExecutor) driver;
        jw.executeScript("window.scrollBy(0,500)");
      driver.findElement(By.xpath("//div[@role='dialog']//button[@title='Close']/span[@class='ui-button-icon ui-icon ui-icon-closethick']")).click();

    }
}
