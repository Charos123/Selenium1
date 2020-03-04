package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args)  throws  Exception{
        //OPTION+ENTER MAC comp
        //ALT+ENTER Wind comp
        //binary the driver and browser
        WebDriverManager.chromedriver().setup();// if it shows red
//Web Driver object needs to be created ---> Interface
        //I have a driver
        WebDriver driver = new ChromeDriver();

        // I want to open Google home page

        //how do you launch/ open a web page?
        //by using get()-> url as String
        driver.get("http://www.google.com");

        //Navigations
        //navigate().to()--> open a web page
        driver.navigate().to("http://www.google.com");

        //get() vs navigate().to()
        //get --> wait to load the page
        //to()--> does not wait
      // String url ="http://www.google.com";

        //navigate().back()-->
        //go to google 2.go to cybertek practice website
        driver.get("http://www.google.com");
        Thread.sleep(3000);
        driver. navigate().to("http://practice.cybertekschool.com/");
        Thread.sleep(3000);
        driver.navigate().back();

        // navigate().forward()
        //go to practice--> go to google --> back to practice
        //--> forward to google
        driver.get("http://www.google.com");
        driver.navigate().to("http://practice.cybertekschool.com/");
        Thread.sleep(2000);
        driver.navigate().back();//google
        driver.navigate().forward();//practice
        Thread.sleep(2000);
        driver.navigate().back();//google





    }
}
