package com.cybertek.tests.day2_Locators;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
    public static void main(String[] args) throws Exception {

        /*
        Test Case1: login successfully
        1.go to VyTrack login page
        2.write username data: storemanager52
        3.write password  UserUser123
        4.click login button

        test cases2: login invalid credential
        1.go to login page
        2.write invalid usr name
        3. write invalid password
        4.click login butn
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://app.vytrack.com/user/login");


        driver.findElement(By.id("prependedInput")).sendKeys("storemanager52");
        Thread. sleep(2000);
        driver.findElement(By.id("prependedInput2")).sendKeys("UserUser123");
        Thread.sleep(2000);
        WebElement loginBtn = driver.findElement(By.id("_submit"));
        Thread.sleep(2000);
        loginBtn.click();

        //login button can be found and clicked directly
        // driver.findElement(By.id("_submit")).click();

        /*
        Verify that you are in the home page
         */
         String expTitle="Dashboard";
         String actualTitle=driver.getTitle();
         if(expTitle.equalsIgnoreCase(actualTitle)){
             System.out.println("pass");
         }else{
             System.out.println("Fail");
         }




    }
}