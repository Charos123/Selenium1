package com.cybertek.tests.day3_locators2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAttributeValue {
    public static void main(String[] args)  throws Exception{
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/login");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        //I want  to get the value of type attribute
        //type="text"--> getAttribute("attribute name");

        //locate username box
        WebElement username=driver.findElement(By.name("username"));
        //<input type="text
        String valueOfType=username.getAttribute("type");
        System.out.println("Value of type is "+valueOfType);

        // <button class="btn btn-primary" type="submit" id="wooden_spoon">Login</button>
        WebElement loginbttn = driver.findElement(By.id("wooden_spoon"));
        //i want to print class attributes velue
        System.out.println(loginbttn.getAttribute("class"));
        //getText vs getAttribute







    }
}
