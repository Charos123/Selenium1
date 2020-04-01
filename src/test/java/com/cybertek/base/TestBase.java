package com.cybertek.base;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.sql.Driver;

public abstract class  TestBase {
  protected WebDriver driver;

     @BeforeMethod
    public void setupMethod(){
       driver=WebDriverFactory.getDriver("chrome");
     }
      @AfterMethod
    public void tearDownMethod() throws InterruptedException {
         Thread.sleep(5000);
          driver.quit();


      }

}
