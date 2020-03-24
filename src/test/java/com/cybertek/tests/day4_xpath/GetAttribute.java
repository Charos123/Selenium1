package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttribute {
    public static void main(String[] args)throws Exception {
        /*
        go to this password page
        type='submit'
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // go to password web page
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");

        driver.manage().window().maximize();
        Thread. sleep(2000);


       // WebElement retrievePasswordBtn= driver.findElement((By.id()))
    }
}
