package org.example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class AlertClass {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oadewusi\\IdeaProjects\\SeleniumIntro\\src\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //maximize window
        driver.manage().window().maximize();
        //navigate to url
        driver.get("https://www.google.com/");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body//form[@role='search']//div[@class='A8SBwf']//div[@class='a4bIc']/input[@role='combobox']")).sendKeys("Testify ltd");
        driver.findElement(By.xpath("/html/body//form[@role='search']//div[@class='A8SBwf']/div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']")).click();
        driver.findElement(By.xpath("/html//div[@id='rso']/div[1]//div[@class='eKjLze']/div[@class='g']/div//a[@href='https://testifyltd.com/']//cite[.='https://testifyltd.com']")).click();
        JavascriptExecutor ja = (JavascriptExecutor) driver;
        ja.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='conv109158']/div[1]/div[4]")).click();
        JavascriptExecutor jae = (JavascriptExecutor) driver;
        jae.executeScript("window.scrollBy(0,2000)");
        Thread.sleep(5000);
        driver.findElement(By.xpath("/html/body/div[@class='body_wrap']/div[@class='page_wrap']/footer/div[1]/div/div[@class='vc_column-inner']/div[@class='wpb_wrapper']/div/div/div[2]/div[4]/div[@class='vc_column-inner']/div[@class='wpb_wrapper']/div[@class='sc_layouts_item']/div/aside[@class='widget widget_socials']//a[@href='https://www.linkedin.com/company/testifyorg']//span[@class='icon-linkedin']")).click();
        // String linked=driver.findElement(By.xpath("/html//main[@id='main']/div[@class='mb3']/section/div[@class='ember-view']//p[@class='org-top-card-summary__tagline t-16 t-black']")).getText();
        // System.out.println(linked);
        //  driver.findElement(By.className("input__input")).sendKeys("aramide2k@yahoo.com");

        String testifyUrl = "Sign In | LinkedIn";
        Set<String> linkedwinq = driver.getWindowHandles();
        for (String windw11 : linkedwinq) {
            driver.switchTo().window(windw11);
            Thread.sleep(5000);
            String value = driver.getTitle();
            System.out.println(value);

           if(testifyUrl.equalsIgnoreCase(value)){
               // hello ma.. so you are actually creating an account instead on signing in
               // so all u need to do is delete this username and password code.. u have to click on the sign in button first
               // then sign in with ur cred before verifying the text on their linkedin profile.
               // Seleh...
               // more grease..lol
           //driver.findElement(By.xpath("authwall-join-form__form-toggle form-toggle")).click();
           driver.findElement(By.xpath(".authwall-join-form__subtitle")).click();
           driver.findElement(By.xpath("/html//input[@id='username']")).sendKeys("aramide2k@yahoo.com");
           driver.findElement(By.xpath("/html//input[@id='password']")).sendKeys("ITS@2016");
           driver.findElement(By.xpath("//div[@id='organic-div']/form[@action='/checkpoint/lg/login-submit']//button[@class='btn__primary--large from__button--floating']")).click();
           String testifyword= driver.findElement(By.xpath("/html//main[@id='main']/div[@class='mb3']/section/div[@class='ember-view']//p[@class='org-top-card-summary__tagline t-16 t-black']")).getText();
               System.out.println(testifyword);
           }


        }
    }
}
