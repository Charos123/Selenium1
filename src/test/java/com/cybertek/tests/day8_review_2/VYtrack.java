package com.cybertek.tests.day8_review_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VYtrack {
    public static void main(String[] args)throws  Exception {
        titleTest();

    }
    /*
    1.Open browser
    2.Go to Vytrack login page
    3.Login as any user
    4.Click on your name on top right
    5.Click on  My Configuration
    6.Verify that page title starts with the same name on top rightW
     */
    private static void titleTest() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com");
        WebElement userName = driver.findElement(By.id("prependedInput"));
        userName.sendKeys("SalesManager110");
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
       password.submit();

        WebElement profileName = driver.findElement(By.cssSelector("a[href='javascript: void(0);']"));
        Thread.sleep(3000);
     profileName.click();

        Thread.sleep(2000);
        WebElement myConfiguration = driver.findElement(By.cssSelector("ul.dropdown-menu>li>a[href='/config/user/profile']"));
       myConfiguration.click();
        Thread.sleep(2000);
        String expected = profileName.getText();

       String actual = driver.getTitle();

        if (actual.startsWith(expected)) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
            System.out.println("expected  = " + expected);
            System.out.println("actual =" + actual);
        }
        driver.close();




        }






    }

