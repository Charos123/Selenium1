package com.cybertek.tests.day13_waits_and_synchronization;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class ExplicitWithExamples {

    WebDriver driver;
  //create web object
    WebDriverWait wait;

    @BeforeMethod
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        wait=new WebDriverWait(driver,10);
    }
        @AfterMethod
        public void tearDown(){
        driver.quit();
        }

        @Test
    public void test1TitleTest(){
     driver.get("https://google.com");
            System.out.println(driver.getTitle());
            driver.get("https://store.steampowered.com");

            //wait  for the Title of the  second page
            //create web object
            WebDriverWait wait = new WebDriverWait(driver,10);
            // starts waiting for title contain text
            wait.until((ExpectedConditions.titleContains("Steam")));

            System.out.println(driver.getTitle());

        }
        @Test
         public void test2WaitForVisible(){
         driver.get("http://practice.cybertekschool.com/dynamic_loading/1");


         WebElement button= driver.findElement(By.tagName("button"));
         button.click();

         WebElement username = driver.findElement(By.id("username"));
         WebElement password = driver.findElement(By.id("pwd"));


         //waits for given element to be visible  on page
            wait.until(ExpectedConditions.visibilityOf(username));

            //make sure that username is visible on page
            Assert.assertTrue(username.isDisplayed());
             username.sendKeys("johndoe");
        }
        //This will throw Exception
    @Test
    public void test3WaitForVisible(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        WebElement button= driver.findElement(By.tagName("button"));
        button.click();

        WebElement username = driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("pwd"));

        //give not enough time. change the wait time
        wait.withTimeout(Duration.ofSeconds(2));

        //waits for given element to be visible  on page
        wait.until(ExpectedConditions.visibilityOf(username));

        //make sure that username is visible on page
        Assert.assertTrue(username.isDisplayed());
        username.sendKeys("johndoe");
    }
     @Test
     public void test4WaitForClickable(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/6");

        WebElement username= driver.findElement(By.id("username"));
        WebElement password = driver.findElement(By.id("pwd"));
        WebElement submit = driver.findElement(By.tagName("button"));

        Assert.assertTrue(username.isDisplayed());
        username.sendKeys("tomsmith");
        password.sendKeys("SuperSecretPassword");

        //wait for element to dissappear
        //wait until the overlay element dissappears
         WebElement overlay = driver.findElement(By.className("loadingoverlay"));
         wait.until(ExpectedConditions.invisibilityOf(overlay));

         //waits for given element to be clickable
         wait.until(ExpectedConditions.elementToBeClickable(submit));
         submit.click();
     }
      @Test
    public void test4WaitForVisible(){
         driver.manage().window().maximize();
          driver.get("http://qa3.vytrack.com");
          WebElement username = driver.findElement(By.id("prependedInput"));
          username.sendKeys("salesmanager110");
          WebElement password = driver.findElement(By.id("prependedInput2"));
          password.sendKeys("UserUser123");
          password.submit();

          driver.manage().timeouts().implicitlyWait(1, TimeUnit.SECONDS);

          WebElement myCalendar = driver.findElement(By.linkText("My Calendar"));

          //wait  untiluntil element with class loader - mask is not visible
          wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(".loader-mask")));
          myCalendar.click();

      }
       @Test
     public void test5Fluent(){
           driver.get("http://practice.cybertekschool.com/dynamic_loading/6");

           Wait<WebDriver>fluentWait = new FluentWait<>(driver);
           wait.withTimeout(Duration.ofSeconds(10));
           wait.pollingEvery(Duration.ofSeconds(5));
           wait.ignoring(NoSuchElementException.class);
           wait.ignoring(ElementClickInterceptedException.class);

           WebElement submitBtn=fluentWait.until(driver-> driver.findElement(By.xpath("//button[text()='Submit'")));

           driver.findElement(By.name("username")).sendKeys(("tomsmith"));
           driver.findElement(By.name("password")).sendKeys("SuperSecretPassword");

           submitBtn.click();

       }
    }

