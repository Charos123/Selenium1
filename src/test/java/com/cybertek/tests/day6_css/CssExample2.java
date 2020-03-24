package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssExample2 {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        String url=("http://practice.cybertekschool.com/multiple_buttons");
        driver.get(url);
        driver.manage().window().maximize();

        //Using # to find by ID:
        WebElement button= driver.findElement(By.cssSelector("#disappearing_button"));
        System.out.println(button.getText());

        //Using dot when a class name

        WebElement homeLink=driver.findElement(By.cssSelector(".class=\"nav-link"));
        System.out.println(homeLink.getText());


        //Using dot when a class name contains space(s)-> in different order:

       // WebElement result2= driver.findElement(By.cssSelector(""))
    }
}
