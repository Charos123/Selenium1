package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HomeWorkVytruck {
    public static void main(String[] args) throws Exception {
    titleTest();

    }
        /*
    1.Open browser
    2.Go to Vytrack login page
    3.Login as any user
    4.Click on your name on top right
    5.Click on  My Configuration
    6.Verify that page title starts with the same name on top right
     */
         private static void titleTest() throws Exception{
            WebDriver driver= WebDriverFactory.getDriver("chrome");
            driver.get("https://qa3.vytrack.com");

             WebElement username= driver.findElement(By.id("prependedInput"));
             username.sendKeys("SalesManager110");
             Thread.sleep(2000);

             WebElement password = driver.findElement(By.id("prependedInput2"));
             password.sendKeys("UserUser123");
             password.submit();

             Thread.sleep(2000);
             WebElement accountHolder=driver.findElement(By.cssSelector("a[href='javascript: void(0);']"));
             accountHolder.click();

             Thread.sleep(2000);
             WebElement myConfiguration= driver.findElement(By.cssSelector("ul.dropdown-menu>li>a[href='/config/user/profile']"));
             myConfiguration.click();

             Thread.sleep(2000);
             String expected =accountHolder.getText();
             String actual= driver.getTitle();

             if(actual.startsWith(expected)){
                 System.out.println("Pass");
             }else{
                 System.out.println("Fail");
             }
            driver.close();





        }
    }



