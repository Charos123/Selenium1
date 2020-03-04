package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class EtsyTitle {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        //go to etsy-->data URL:"http://etsy.com"
        driver.get("http://etsy.com");
        //verify title
        //expected vs actual

        String expectedTitle="Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";
        String actualTitle=driver.getTitle();
        if(expectedTitle.equalsIgnoreCase(actualTitle)){
            System.out.println(" The test is Pass");
        }else{
            System.out.println(" The test is Failed");
            System.out.println("I expectedTitle "+expectedTitle);
            System.out.println("actualTitle "+actualTitle);

        }
        driver.close();
    }
}
