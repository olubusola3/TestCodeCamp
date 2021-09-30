
package org.example;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;

public class FindElemJumiaTask  {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\oadewusi\\IdeaProjects\\SeleniumIntro\\src\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //navigate to url
        driver.get("https://www.jumia.com.ng/");
       driver.findElement(By.id("fi-q")).sendKeys("female sneakers");
      // Thread.sleep(5000);
     // driver.findElement(By.className("ic")).click();
      Thread.sleep(5000);
        driver.findElement(By.cssSelector(".btn._prim._md.-mls")).click();


    }
}
