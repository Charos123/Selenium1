package com.cybertek.tests.day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathPractice {
    public static void main(String[] args)throws Exception {
        //go to practice login page
       // locate  username box with absolute xpath
       // locate  username box with relative xpath
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/login");
        WebElement usernameboxAbs=driver.findElement(By.xpath("//*[@id=\"login\"]/div[1]/div/input"));
        usernameboxAbs.sendKeys("abc@gmail.com");
        Thread.sleep(3000);

        WebElement usernameboxRel=driver.findElement(By.xpath("//input[@type='text']"));
        usernameboxRel.sendKeys("robot@gmail.com");
        Thread.sleep(2000);

        //  //*[@iad='email']---> it means any tagName



    }
}
