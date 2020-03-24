package OfficeHours;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeworkEtsySearch {
    public static void main(String[] args) throws InterruptedException {
        /*
       1.Open browser
       2.Go to https://ebay.com
       3.Search for wooden spoon
       4.Save the total number of results
       5.Click on link All under the categories on the left menu
       6.Verify that number of results is bigger than the number in step 4
       7.Navigate back to previous research results page
       8.Verify that wooden spoon is still displayed in the search box
       9.Navigate back to home page
       10.Verify that search box is blank
        */
        // 1.Open browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");

       // 2.Go to https://ebay.com
        driver.get(" https://ebay.com");

        // 3.Search for wooden spoon
        Thread.sleep(2000);
        WebElement input = driver.findElement(By.id("gh-ac"));
        input.sendKeys("wooden spoon");

        Thread.sleep(1000);
        WebElement searchButton = driver.findElement(By.id("gh-btn"));
        searchButton.click();

        //4.Save the total number of results
        WebElement countEl = driver.findElement(By.cssSelector("h1> span"));
        String count = countEl.getText();
        System.out.println(count);

        int countOne = Integer.parseInt(count.replace(",",""));
        System.out.println(countOne);

        // 5.Click on link All under the categories on the left menu
        WebElement all = driver.findElement(By.linkText("All"));
        all.click();
        Thread.sleep(2000);

       // 6.Verify that number of results is bigger than the number in step 4

        //re initialize  the element that is throwing  state element
        countEl = driver.findElement(By.cssSelector("h1> span"));
         count=countEl.getText();
        System.out.println(count);

        int countTwo =Integer.parseInt(count.replace(",",""));
        System.out.println(countTwo);


        // 6.Verify that number of results is bigger than the number in step 4
        if(countOne<countTwo){
            System.out.println("Pass");
        }else {
            System.out.println("Fail");
            System.out.println("countOne: " + countOne);
            System.out.println("countTwo: " + countTwo);
        }

        //7.Navigate back to previous research results page
            driver.navigate().back();

        // 8.Verify that wooden spoon is still displayed in the search box
        input = driver.findElement(By.id("gh-ac"));
         String woodenSpoon = input.getAttribute("value");
        System.out.println(woodenSpoon);

        if(woodenSpoon.equals("wooden spoon")){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected: ="+ "woodenSpoon");
            System.out.println("Actual: "+woodenSpoon);
        }

        // 9.Navigate back to home page
        driver.navigate().back();
        
        //10.Verify that search box is blank
        input = driver.findElement(By.id("gh-ac"));
        woodenSpoon = input.getAttribute("value");
        System.out.println("woodenSpoon = " + woodenSpoon);
         if(woodenSpoon.isEmpty()){
             System.out.println("Pass");
         }else{
             System.out.println("Fail");
             System.out.println("Expected a blank value");
             System.out.println("Actual:"+ woodenSpoon);
         }
         driver.quit();


    }
         

    }
