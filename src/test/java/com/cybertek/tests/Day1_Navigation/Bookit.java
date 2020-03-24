package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bookit {
    public static void main(String[] args) {
        /*Task 1:
        1. Go to Bookit login page
        https://cybertek-reservation-qa.herokuapp.com/sign-in
        2. Verify the title of the page
        Task 2:
        1. Go to Bookit login page
        https://cybertek-reservation-qa.herokuapp.com/sign-in
        2. Verify that URL contains “cybertek-reservation

         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");

        driver.manage().window().maximize();
        //expected vs actual

        String expectTitle = "bookit";
        String actualTitle = driver.getTitle();
        if (expectTitle.equalsIgnoreCase(actualTitle)) {
            System.out.println("Test Pass");
        } else {
            System.out.println("Test Fail");
            System.out.println("i expected to see :" + expectTitle);
            System.out.println("The driver get: " + actualTitle);
        }
        driver.close();

       /* Task 2:
        1. Go to Bookit login page
        https://cybertek-reservation-qa.herokuapp.com/sign-in
        2. Verify that URL contains “cybertek-reservation


        */

        WebDriverManager.chromedriver().setup();
        WebDriver driver1 = new ChromeDriver();
        driver.get("https://cybertek-reservation-qa.herokuapp.com/sign-in");
        String expPartialURL="Cybertek-reservation";
        String actualURL=driver.getCurrentUrl();
        //"https://cybertek-reservation-qa.herokuapp.com/sign-in");
        if(actualURL.contains(expPartialURL)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("expectedPartalUrl: "+expPartialURL);
            System.out.println("actual"+actualURL);
        }
        driver1.close();

    }

    public static class VerifyTitle {
        public static void main(String[] args) {
            /*
            1. Go to cybertek  practice web site
            2. verify Title expected tittle: Practice
            Actual Title?-->

            http://practice.cybertekschool.com/
             */
             //connect browser and driver
            // also setup browser
            WebDriverManager.chromedriver().setup();

            WebDriver driver=new ChromeDriver();
             String url= "http://practice.cybertekschool.com/";
            driver.get(url);

            driver.manage().window().maximize();

            String expectedTitle="practice";
            String actualTitle= driver.getTitle();
            if(expectedTitle.equals(actualTitle)){
                System.out.println("Pass");
            }else{
                System.out.println("Fail");
                System.out.println("I expected "+ expectedTitle);
                System.out.println("The actual title is  "+actualTitle);
            }
            driver.close();

        }

    }

    public static class Homework2 {
        public static void main(String[] args) {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();

            driver.get("https://www.cvs.com");
            String title=driver.getTitle();

            System.out.println("title: "+ title);

            String URL= driver.getCurrentUrl();
            System.out.println("URL = " + URL);
            driver.close();
        }

    }
}
