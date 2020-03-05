package com.cybertek.tests.day3_locators2;

import com.github.javafaker.Faker;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FakerPractice {
    public static void main(String[] args)  throws Exception{
        //create Faker object
        Faker fakeData= new Faker();

        //I need firstName

        String name = fakeData.name().firstName();
        System.out.println(name);
         /*
        go to login page //http://practice.cybertekschool.com/login
        2.enter invalid username
        3. enter invalid password
        4. Verify the error massage
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");
        Thread.sleep(2000);

        WebElement invalidUserName= driver.findElement(By.name("username"));
        invalidUserName.sendKeys("baraban");
        Thread.sleep(2000);

        WebElement invalidPassword= driver.findElement(By.name("password"));
        invalidPassword.sendKeys("chemodan");
        Thread.sleep(2000);

        WebElement click=driver.findElement(By.id("wooden_spoon"));
        click.click();


    }
}
