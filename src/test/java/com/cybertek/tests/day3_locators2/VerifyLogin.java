package com.cybertek.tests.day3_locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyLogin {
    public static void main(String[] args) throws Exception {

        /*
        go to login page
         enter username
         enter password
         click login button
         Verify  welcome message "Welcome to the Secure Area.When you are done.
         */
        //http://practice.cybertekschool.com/login
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");
        Thread.sleep(2000);
        driver.findElement(By.name("username")).sendKeys("tomsmith");
        Thread.sleep(2000);

        driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");
        driver.findElement((By.id("wooden_spoon"))).click();
        Thread.sleep(2000);
        driver.close();

       //locating the welcome message with tagname

        WebElement welcomeMessage = driver.findElement(By.tagName("h4"));

        //  Verify the welcome massage
        //expected vs actual
        String expectedMassage = "Welcome to the Secure Area. When you are done click logout below.";
        // String vs WebElement
        //getText() --> convert webElement to String
        //
        String actualWelcomeMassage = welcomeMessage.getText();
        if (expectedMassage.equalsIgnoreCase(actualWelcomeMassage)){
            System.out.println("PASSS");
        }else {
            System.out.println("Fail");
        }

        driver.close();








    }
}
