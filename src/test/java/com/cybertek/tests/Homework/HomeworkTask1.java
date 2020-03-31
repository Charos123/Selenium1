package com.cybertek.tests.Homework;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class HomeworkTask1 {
    public static void main(String[] args) throws  Exception {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");
        String actualTitle1 = driver.getTitle();
        Thread.sleep(2000);

        driver.navigate().to("https://etsy.com");
        String actetsyTitle=driver.getTitle();
        Thread.sleep(2000);



        driver.navigate().back();
        String actTitle2 =driver.getTitle();


        if(actualTitle1.equals(actTitle2)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        driver.navigate().forward();

        String actetsyTitle2=driver.getTitle();
        if(actetsyTitle.equals(actetsyTitle2)){
            System.out.println("pass");
        }else{
            System.out.println("fail");
        }
        driver.close();



        }
    }

