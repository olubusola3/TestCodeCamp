package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserNav {
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
        driver.navigate().back();
        Thread.sleep(5000);
        String loginbut = driver.findElement(By.xpath("/html//input[@id='login-button']")).getAttribute("value");
        System.out.println(loginbut);
        driver.navigate().forward();
        Thread.sleep(5000);
       String product= driver.findElement(By.xpath("/html//div[@id='inventory_container']/div/div[@id='inventory_container']/div/div[1]/div[@class='inventory_item_description']/div[@class='inventory_item_label']/a[@href='#']/div[@class='inventory_item_name']")).getText();
       System.out.println(product);
    }
}
