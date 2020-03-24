package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getattribute2 {
    public static void main(String[] args) {
        /*
        http://practice.cybertekschool.com/dynamic_loading
locate Example1:
Example 1: Element on page that is hidden and become visible after trigger


         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/dynamic_loading");

        //locate Example 1
        WebElement  example1 =driver.findElement(By.linkText("Example 1: Element on page that is hidden and become visible after trigger"));
        System.out.println(example1.getAttribute("href"));


    }
}
