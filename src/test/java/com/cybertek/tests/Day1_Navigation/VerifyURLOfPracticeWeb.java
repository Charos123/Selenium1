package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyURLOfPracticeWeb {
    public static void main(String[] args) {
        /*
        1.go to cybertek practice website
        //"http://practice.cybertekschool.com/"
        2.verify the URL
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver =new ChromeDriver();
        driver.get("http://practice.cybertekschool.com/");
        String expectedUrl="http://practice.cybertekschool.com/";
        String  actualUrl=driver.getCurrentUrl();
        if(expectedUrl.equals(actualUrl)){
            System.out.println("pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected result "+expectedUrl);
            System.out.println("Actual result "+ actualUrl);
        }
        driver.close();
    }
}
