package com.testifyproj;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TestProjKonga {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oadewusi\\IdeaProjects\\SeleniumIntro\\src\\chromedriver.exe");
        //launch the browser
        WebDriver driver = new ChromeDriver();
        //maximize the window
        driver.manage().window().maximize();
        // Navigate to Konga website
        driver.get("https://www.konga.com/");
        //Click on the login button
        driver.findElement(By.xpath("/html//section[@id='app-content-wrapper']/div[@class='e5dc4_DR8xw']/nav//a[@href='/account/login?return_url=/']")).click();
        // input Email Address or Phone Number
        driver.findElement(By.xpath("/html//input[@id='username']")).sendKeys("aramide2k@yahoo.com");
        //input password
      driver.findElement(By.xpath("/html//input[@id='password']")).sendKeys("Password@123");
      //click on login button
      driver.findElement(By.xpath("/html//section[@id='app-content-wrapper']//section[@class='_0863a_3x99A']/section//form[@action='/account/login']//button[@class='_0a08a_3czMG _988cf_1aDdJ']")).click();
  // driver.findElement(By.xpath("/html//section[@id='app-content-wrapper']/div[@class='e5dc4_DR8xw']/nav//a[@href='/category/accessories-computing-5227']")).click();
       //moving tho the Computer  and accessories

        WebElement ca = driver.findElement(By.xpath("/html//section[@id='app-content-wrapper']/div[@class='e5dc4_DR8xw']/nav//a[@href='/category/accessories-computing-5227']"));
        // Scroll down page and Click on the Laptop Category/Apple Macbook
       JavascriptExecutor jw = (JavascriptExecutor) driver;
       jw.executeScript("window.scrollBy(0,300)");
        Actions mouse = new Actions(driver);
        mouse.moveToElement(ca).build().perform();
        Thread.sleep(5000);
       // Selects the macbook
      String kongatest=    driver.findElement(By.xpath("//a[contains(text(),'Notebooks')]")).getText();
      System.out.println(kongatest);
      driver.findElement(By.xpath("//a[contains(text(),'Notebooks')]")).click();
     // JavascriptExecutor ja = (JavascriptExecutor) driver;
    //  ja.executeScript("window.scrollBy(0,500)");
       // adding item to cart
        Thread.sleep(5000);
        JavascriptExecutor ja = (JavascriptExecutor) driver;
          ja.executeScript("window.scrollBy(0,500)");
     String carttext = driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/section[1]/div[3]/section[1]/main[1]/section[2]/section[1]/section[1]/section[1]/section[1]/ul[1]/li[1]/div[1]/div[1]/div[2]/form[1]/div[4]/button[1]")).getText();
        System.out.println(carttext);
  //  driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/section[1]/div[3]/section[1]/main[1]/section[2]/section[1]/section[1]/section[1]/section[1]/ul[1]/li[1]/div[1]/div[1]/div[2]/form[1]/div[4]/button[1]")).click();
//driver.findElement(By.xpath("//main[@id='mainContent']/section[@class='_8d917_1ixfS']/section[@class='_58fc0_2UVzP']/section[@class='_1c288_3uRBY']/section[@class='_588b5_3MtNs']/section/ul/li[4]/div/div[@class='a2cf5_2S5q5 cf5dc_3HhOq']/div[@class='_4941f_1HCZm']/form[@action='/cart/overview']//button[@class='_0a08a_3czMG']")).click();
driver.findElement(By.xpath("//main[@id='mainContent']/section[@class='_8d917_1ixfS']/section[@class='_58fc0_2UVzP']/section[@class='_1c288_3uRBY']/section[@class='_588b5_3MtNs']/section/ul/li[5]/div/div[@class='a2cf5_2S5q5 cf5dc_3HhOq']/div[@class='_4941f_1HCZm']/form[@action='/cart/overview']//button[@class='_0a08a_3czMG']")).click();
//clicking on cart
        driver.findElement(By.xpath("//body/div[@id='__next']/div[1]/section[1]/div[2]/nav[1]/div[2]/div[1]/div[1]/a[2]/span[2]")).click();
        //checkout
        driver.findElement(By.xpath("//button[contains(text(),'Checkout')]")).click();
        //Delivery / Pickup Options
        Thread.sleep(3000);
      // driver.findElement(By.cssSelector("//a[contains(text(),'Select Delivery Address')]")).click();
        driver.findElement(By.cssSelector("div.ais-InstantSearch__root section.d6575_J-kZm div.c6dfe_HidJc:nth-child(3) section._0863a_3x99A main._050ef_K0hT7 div._96b91_2q7ra div._87434_2IY8P section._4b230_19Wk8._651d7_qAjL2:nth-child(1) div.c8825_2KE_b div._5814d_DD8oH div._654ae_5UVhe div._6c84a_1KnfX div._01d0c_nHyiN.a8406_30FgC:nth-child(1) form:nth-child(1) div._9b2ff_c036B:nth-child(4) div._2aac2_3bwnD._549f7_zvZ8u._6530d_2NZhJ > a._0a08a_3czMG._7e22a_3zNWE")).click();
        //Address form
        driver.findElement(By.xpath("/html//input[@id='firstname']")).sendKeys("olubusola");
        driver.findElement(By.xpath("/html//input[@id='lastname']")).sendKeys("ade");
        driver.findElement(By.xpath("/html//input[@id='telephone']")).sendKeys("08056565656");
        driver.findElement(By.xpath("/html//input[@id='street']")).sendKeys("olubusola street");
        driver.findElement(By.xpath("/html//input[@id='city']")).sendKeys("ikeja");
        //selecting from the LOv
        WebElement state = driver.findElement(By.xpath("/html//section[@id='app-content-wrapper']/div[@class='c6dfe_HidJc']/section[@class='_0863a_3x99A']/section//form[@method='POST']//select[@name='regionId']"));
        Select statelist = new Select(state);
        statelist.selectByValue("1061493610");
        //for lga
        Thread.sleep(3000);
        WebElement lga = driver.findElement(By.cssSelector("[name='areaId']"));
        Select lgalist = new Select(lga);
        lgalist.selectByValue("757");
        driver.findElement(By.xpath("/html//section[@id='app-content-wrapper']/div[@class='c6dfe_HidJc']/section[@class='_0863a_3x99A']/section//form[@method='POST']//button[@name='saveDeliveryAddress']")).click();








    }
}
