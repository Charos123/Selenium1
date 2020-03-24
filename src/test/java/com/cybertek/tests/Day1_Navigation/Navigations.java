package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigations {

    public static void main(String[] args)  throws Exception{
        /*
       Navigation:
       driver.navigate().to("URL")
       driver.navigate().back()
       driver.navigate().forward()
       driver.navigate().refresh()
         */
        // go to practice --> go to google--> back to practice
       // --> foward to google

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        String practiceWebUrl= "http://practice.cybertekschool.com/";

        //I want to see the full window
       // driver.manage().window().fullscreen();
        driver.manage().window().maximize();

        //go to practice
        driver.get(practiceWebUrl);//go to practice
        Thread.sleep(3000);

        //go to google
        String gglUrl="http://www.google.com";// go to google
        driver.navigate().to(gglUrl);
        Thread.sleep(3000);

        // back to practice
        driver.navigate().back();// we don't need to write url

        // forward method
       driver.navigate().forward();

       // navigate
       driver.navigate().refresh();

       //close driver//close the current web browser Only
        driver.close();

        //close  down all the  windows in  web browser
        driver.close();

    }
}
