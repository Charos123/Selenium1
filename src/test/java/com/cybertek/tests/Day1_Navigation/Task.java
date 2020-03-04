package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
    public static void main(String[] args) throws Exception {

        /*
        1.Go to google website
        2.save the title in a string variable
        3. go to Etsy
        4. save the Etsy Title in a String
        5.Navigate back to previous page
        6.Verify the title is same as step 2
        7.Navigate forward to previous page
        8.Verify the title is ame as step 4

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        //1. Go to google webstite
        driver.get("https://www.google.com");
        //full screen
        driver.manage().window().maximize();
        //2.save the title in a string variable
        String gglexpectedTitle = "Google";
        Thread.sleep(3000);
        // 3. go to Etsy
        driver.navigate().to("https://www.etsy.com/");
        //4. save the Etsy Title in a String
        String etsyExpectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        Thread.sleep(3000);
        //5.Navigate back to previous page
        driver.navigate().back();  //google
        //6.Verify the title is same as step 2
        String actualGoogleTile = driver.getTitle();
        if(gglexpectedTitle.equals(actualGoogleTile)){
            System.out.println("pass");
        }else {
            System.out.println("FAIL");
            System.out.println("I expected title " + gglexpectedTitle);
            System.out.println("The actual URL is: " + actualGoogleTile );
        }
        //7.Navigate forward to previous page
        driver.navigate().forward();  //etsy
        //8.Verify the title is ame as step 4
        String etsyActualTitile = driver.getTitle();
        if(etsyExpectedTitle.equals(etsyActualTitile)){
            System.out.println("pass");
        }else {
            System.out.println("FAIL");
            System.out.println("I expected Title" + etsyExpectedTitle);
            System.out.println("The actual URL is: " + etsyActualTitile );
        }

        driver.close();









    }
}
