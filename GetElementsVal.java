package org.example;

         import org.openqa.selenium.By;
         import org.openqa.selenium.WebDriver;
         import org.openqa.selenium.chrome.ChromeDriver;


public class GetElementsVal {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\oadewusi\\IdeaProjects\\SeleniumIntro\\src\\chromedriver.exe");
        //launch browser
        WebDriver driver = new ChromeDriver();
        //navigate to url
        driver.get("https://worldweather.wmo.int/en/home.html");
       // String autocom =
        driver.findElement(By.cssSelector("input#q_search")).sendKeys("Lagos");
        Thread.sleep(5000);
        driver.findElement(By.cssSelector(".top_searchbox_submit")).click();
        String city = driver.findElement(By.xpath("//div[@class='col-7 city_right_side']")).getText();
        //driver.findElement(By.xpath("/html//div[@class='wrapper']/div[6]")).click();
        System.out.println(city);

    }
}