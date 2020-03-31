package com.cybertek.tests.day13_waits_and_synchronization;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ImplicitWithExamples {

    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public  void test1() {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");

        WebElement message= driver.findElement(By.cssSelector("#finish>h4"));

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        Assert.assertTrue(message.isDisplayed());
        System.out.println(message.getText());

        driver.get("http://practice.cybertekschool.com/dynamic_loading/2");
        WebElement button = driver.findElement(By.tagName("button"));
        button.click();

        message=driver.findElement(By.cssSelector("#finish>h4"));

        Assert.assertTrue(message.isDisplayed());
        System.out.println(message.getText());

    }
    @Test
    public void test2(){
       driver.get("http://practice.cybertekschool.com/dynamic_loading/3");

       WebElement input =driver.findElement(By.tagName("input"));
       input.sendKeys("t shirt");
    }
}

