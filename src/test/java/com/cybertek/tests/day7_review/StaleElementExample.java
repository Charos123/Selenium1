package com.cybertek.tests.day7_review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class StaleElementExample {

    public static void main(String[] args) throws Exception {
        //nameMatchTest();
         secondNameMatchTest();
    }
    //each test will be a separate method

    /**
     * Test Case:
     * Open browser
     * Go to Amazon
     * Search for any item
     * remember the name of the second resuslt
     * click on the first result
     * verify that product name is same in the product page
     */
    private static void secondNameMatchTest() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://amazon.com");


        String searchTerm = "disinfectant wipes";
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));
        searchInput.sendKeys((searchTerm));


        WebElement searchButton = driver.findElement((By.className("nav-input")));
        searchButton.click();
        Thread.sleep(2000);

//Find the second result
        WebElement secondResult = driver.findElement(By.xpath("//span[@class='a-size-base-plus a-color-base a-text-normal']"));
        System.out.println(secondResult.getText());

//Click on the second result
        String expectedName = secondResult.getText();
        secondResult.click();//product page opens
        Thread.sleep(2000);

//Get the text of the  first result
        WebElement productName = driver.findElement(By.id("productTitle"));
        String actualName = productName.getText();
        //trying to interact with element from previous page
        Thread.sleep(2000);

        System.out.println(actualName);


      if(expectedName.equals(actualName)){
          System.out.println("Pass");
      }else{
          System.out.println("Fail");
          System.out.println("expectedName = "+expectedName);
          System.out.println("actualName = "+actualName);
      }
            driver.quit();
        }

    }




