package org.example;

        import org.openqa.selenium.By;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.chrome.ChromeDriver;


public class CssLocator {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\oadewusi\\IdeaProjects\\SeleniumIntro\\src\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //navigate to url
        driver.get("https://www.saucedemo.com/");
        driver.findElement(By.cssSelector("input#user-name")).sendKeys("performance_glitch_user");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("input#password")).sendKeys("secret_sauce");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("[name='login-button']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("[name='add-to-cart-sauce-labs-bike-light']")).click();
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("div#shopping_cart_container > .shopping_cart_link")).click();
        Thread.sleep(5000);
       driver.findElement(By.cssSelector("[name='checkout']")).click();

    }
}