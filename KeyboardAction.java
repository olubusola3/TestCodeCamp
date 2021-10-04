
package org.example;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.chrome.ChromeDriver;
        import org.openqa.selenium.interactions.Actions;

        import javax.swing.*;

public class KeyboardAction {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\oadewusi\\IdeaProjects\\SeleniumIntro\\src\\chromedriver.exe");
        // launch browser
        WebDriver driver = new ChromeDriver();
        // maximize browser
        driver.manage().window().maximize();
        // navigate to browser
        driver.navigate().to("https://www.browserstack.com/");
        WebElement PMenu = driver.findElement(By.xpath("//button[@id='product-menu-toggle']"));
        Actions menu = new Actions(driver);
        menu.moveToElement(PMenu).build().perform();
        Thread.sleep(5000);
       driver.findElement(By.xpath("//div[@id='product-menu-dropdown']/div[@class='col-xs-10']/ul[1]//a[@href='/live']/div[@class='dropdown-link-heading']")).click();
    }
}