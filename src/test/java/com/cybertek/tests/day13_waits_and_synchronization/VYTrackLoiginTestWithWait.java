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

public class VYTrackLoiginTestWithWait {

    WebDriver driver;

   @BeforeMethod
    public void setUp(){
       driver= WebDriverFactory.getDriver("chrome");
      // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   }
   @AfterMethod
   public void rearDown(){
       driver.quit();
   }




    @Test
    public void test(){
        driver.get("http://qa3.vytrack.com");
       WebElement username = driver.findElement(By.id("prependedInput"));
        username.sendKeys("salesmanager110");
        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        password.submit();

    WebElement pagename= driver.findElement(By.cssSelector(".oro-subtitle"));
    Assert.assertEquals(pagename.getText(),"Dashboard");

    Assert.assertEquals(driver.getTitle(),"Dashboard");

    }

}


