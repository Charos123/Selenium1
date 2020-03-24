package com.cybertek.tests.day6_css;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CssExample {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        WebElement button= driver.findElement(By.cssSelector("#disappearing_button"));
        System.out.println(button.getText());
          WebElement Whome = driver.findElement(By.cssSelector(".nav-link"));
        System.out.println(Whome.getText());

        WebElement btn= driver.findElement(By.cssSelector("html>body>nav>ul a"));
        System.out.println(btn.getText());

driver.quit();

    }
}
