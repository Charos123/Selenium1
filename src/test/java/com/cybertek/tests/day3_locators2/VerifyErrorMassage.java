package com.cybertek.tests.day3_locators2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyErrorMassage {
    public static void main(String[] args) {
        /*
        go to login page
        2.enter invalid username
        3. enter invalid password
        4. Verify the error massage
         */
        //testers will gather test data in excell sheet
        //1. generate data from dummy data website



        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/login");

        Faker faker= new Faker();
        String username = faker.name().fullName();
        String password = faker.app().author();
        driver.findElement(By.name("username")).sendKeys(username);
        driver.findElement(By.name("password")).sendKeys(password);
        driver.findElement(By.id("wooden_spoon")).click();






    }
}
