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

public class ThreadSleepExample {
    WebDriver driver;

    @BeforeMethod
    public void setUp() throws InterruptedException {
        driver= WebDriverFactory.getDriver("chrome");
        driver.get("some website");
        Thread.sleep(10000);
    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
    @Test
    public  void test1() throws InterruptedException {
        driver.get("http://practice.cybertekschool.com/dynamic_loading/4");
        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);


       WebElement message= driver.findElement(By.cssSelector("#finish>h4"));

        Assert.assertTrue(message.isDisplayed());
        System.out.println(message.getText());
    }
}
