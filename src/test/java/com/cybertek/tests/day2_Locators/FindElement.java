package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElement {
    public static void main(String[] args)  throws Exception {

        //Locator 1. ID
        //Task
        //go to cybrtek okta login page
        // write email to the text box

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertekscool.okta.com");

        // write email to the text box
        /*
        1.Find the text box first-->findElement() Web Driver
         */
        Thread.sleep(3000);

         WebElement emailBox= driver.findElement(By.id("okta-signin-username"));//value, returns web element

        emailBox.sendKeys("charos_sharipova@yahoo.com");
        Thread.sleep(2000);

        //write your password to the password text box
        driver.findElement(By.id("okta-signin-password")).sendKeys("cha1235");


    }
}
