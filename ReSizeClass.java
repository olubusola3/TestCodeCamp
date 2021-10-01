package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ReSizeClass {
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
        driver.findElement(By.xpath(" //div[@id='sidebar']/aside[1]/ul//a[@href='https://jqueryui.com/resizable/']")).click();
        driver.switchTo().frame(0);
        JavascriptExecutor jae = (JavascriptExecutor) driver;
        jae.executeScript("window.scrollBy(0,500)");
        //Locate resizable element's bottom-right corner.
        WebElement resizeElement = driver.findElement(By.xpath("//body/div[@id='resizable']/div[1]"));
        Actions resize = new Actions(driver);
        resize.clickAndHold(resizeElement).moveByOffset(250, 195).build().perform();

        }
}
