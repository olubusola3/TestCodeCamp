package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class YahooNavigate {

        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver","C:\\Users\\oadewusi\\IdeaProjects\\SeleniumIntro\\src\\chromedriver.exe");
            //launch browser
            WebDriver driver = new ChromeDriver();
            //navigate to url
            driver.get("https://www.yahoo.com/");
        }
    }




