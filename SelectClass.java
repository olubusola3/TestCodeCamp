package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class SelectClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oadewusi\\IdeaProjects\\SeleniumIntro\\src\\chromedriver.exe");
        // launch browser
        WebDriver driver = new ChromeDriver();
        // maximize browser
        driver.manage().window().maximize();
        // navigate to browser
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        driver.navigate().to("https://selenium08.blogspot.com/");

        driver.findElement(By.xpath("/html/body//header[@role='banner']//button[@class='flat-button search-expand touch-icon-button']/div[@class='search-expand-text']")).click();
        driver.findElement(By.xpath("//div[@id='BlogSearch1']//form[@action='https://selenium08.blogspot.com/search']//input[@name='q']")).sendKeys("Demo dropdown");

        driver.findElement(By.cssSelector(".search-icon.svg-icon-24")).click();

        driver.findElement(By.xpath("/html//div[@id='Blog1']/div[1]/article[@class='post-outer-container']//h3/a[@href='https://selenium08.blogspot.com/2019/11/dropdown.html']")).click();

        JavascriptExecutor jae = (JavascriptExecutor) driver;
        jae.executeScript("window.scrollBy(0,500)");

       WebElement countrylov = driver.findElement(By.xpath("//select[@name='country']"));
        Select countrylist = new Select(countrylov);
        countrylist.selectByValue("NG");

        WebElement monthlov = driver.findElement(By.cssSelector("select[name='Month']"));
        Select months = new Select(monthlov);
        months.selectByValue("Jan");

        months.selectByValue("Feb");

        months.selectByValue("Ma");
    }
}