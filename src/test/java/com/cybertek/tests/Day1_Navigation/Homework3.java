package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework3 {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
    /*
    Task:
    Go to amazon  https://www.amazon.com/
     Go to Ebay   https://www.ebay.com/
    Enter a search term
    Click on search button
    Verify title contains search term
    */

     //locators --> ID,name,classname
        driver.get("https://www.amazon.com/");
        Thread.sleep(2000);

        driver.navigate().to("https://www.ebay.com/");
        Thread.sleep(2000);

         WebElement searchBox=driver.findElement(By.id("gh-ac"));
         searchBox.sendKeys("book"+ Keys.ENTER);
        Thread.sleep(2000);

      //WebElement searchBtn=driver.findElement(By.id("gh-btn"));
       //searchBox.click();
        // Verify title contains search term
        //expected vs actual

        Thread.sleep(2000);

        String expTitle = "book";
        String actTitle = driver.getTitle();
        if (actTitle.contains(expTitle)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        Thread.sleep(2000);
        driver.close();

    }
}






