package com.cybertek.tests.day10_Webelement;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DisableAndDisplayedTests {
    WebDriver driver;

    @BeforeMethod
    public void beforeMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/radio_buttons");
    }

    @AfterMethod
    public void afterTest() {
        driver.quit();
}
/*
go to http://practice.cybertekschool.com/radio_buttons
 verify green is disable
 verify black is enable
 */
@Test
public void disableTest() throws InterruptedException{
    Thread.sleep(2000);
    WebElement green = driver.findElement(By.id("green"));
    WebElement black = driver.findElement(By.id("black"));

    //isEnable --> return true if the eelement is enabled, active
    System.out.println("Is green enabled: "+green.isEnabled());
    System.out.println("Is black enabled: "+ black.isEnabled());
    Assert.assertFalse(green.isEnabled());
    Assert.assertTrue(black.isEnabled());



}
@Test
    public void disableTestWithAttribute() throws InterruptedException {
    Thread.sleep(2000);
    WebElement green = driver.findElement(By.id("green"));
    WebElement black = driver.findElement(By.id("black"));

    System.out.println("black: " + black.getAttribute("disabled"));
    System.out.println("green: " + green.getAttribute("disabled"));

    //verify that certain value is equal to null

    Assert.assertEquals(black.getAttribute("disable"), null);
    //verify that value of black.get Attribute ("disabled") is Null
    Assert.assertNull(black.getAttribute("disable"));

    //verify that certain value is equal to True, verify element is Disabled
    Assert.assertEquals(green.getAttribute("disabled"),"true");
    Assert.assertTrue(Boolean.parseBoolean(green.getAttribute("disabled")));
}
@Test
    public  void testElementVisible()throws Exception {
     driver.get("https://practice.cybertekschool.com/dynamic_loading/1");
      WebElement username= driver.findElement(By.id("username"));
      WebElement start = driver.findElement(By.tagName("button"));

      //verify that username is not visible
    //isDisplayed--> returns true element we found  in HTML is visible on page
          System.out.println("Username is visible "+ username.isDisplayed());

           System.out.println("Click on start");
           start.click();

         Thread.sleep(5000);
           System.out.println("Username is visible "+ username.isDisplayed());
            Assert.assertTrue(username.isDisplayed());

}
}
