package com.cybertek.tests.day7_review;

import com.cybertek.utilities.WebDriverFactory;
import com.google.gson.internal.bind.util.ISO8601Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.w3c.dom.ls.LSOutput;

public class AmazonTests {
    // main method to invoke the tests
    public static void main(String[] args) throws Exception{
        nameMatchTest();

    }
    //each test will be a separate method

    /**
     * Test Case:
     * Open browser
     * Go to Amazon
     * Search for any item
     * remember the name of the first resuslt
     * click on the first result
     * verify that product name is same in the product page
     */
    private static void nameMatchTest() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://amazon.com");


        String searchTerm = "disinfectant wipes";
        WebElement searchInput = driver.findElement(By.id("twotabsearchtextbox"));

        // Option 1: enter search and hit Enter button
        //searchInput.sendKeys(searchTerm+ Keys.ENTER);

        //Option 2: Enter search term and click the search button
        searchInput.sendKeys((searchTerm));
        WebElement searchButton = driver.findElement((By.className("nav-input")));
        searchButton.click();

        Thread.sleep(2000);
        //WRITE XPATH THAT CAPTURE  FIRST RESULT
        WebElement firstResult = driver.findElement(By.xpath("(//span[@class='a-size-base-plus a-color-base a-text-normal'])[2]"));
        //it is printing the value
        System.out.println(firstResult.getText());
         Thread.sleep(2000);

        //get the name of the first result
        String expectedName = firstResult.getText();
        //click on the first result
        firstResult.click();
        Thread.sleep(2000);
        //craeting  a new variable
        WebElement productName = driver.findElement((By.id("productTitle")));
        String acttualname=productName.getText();
        System.out.println(acttualname);

        if (expectedName.equals(acttualname)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("expectedName :" +expectedName);
            System.out.println("acttualname :" +acttualname);
        }
        driver.quit();
        }

    }


