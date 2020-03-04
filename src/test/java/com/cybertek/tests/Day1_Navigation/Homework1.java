package com.cybertek.tests.Day1_Navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {
    public static void main(String[] args) throws Exception {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

       driver.get("https://google.com");
       Thread.sleep(2000);



       driver.navigate().to("https://cvs.com");
        //Thread.sleep(2000);
String cvsTitle="CVS - Online Drugstore, Pharmacy, Prescriptions & Health Information";
String expectedTitle= driver.getTitle();

if(cvsTitle.equals(expectedTitle)){
    System.out.println("Pass");
}else{
    System.out.println("Fail");
    System.out.println("CVSTitle "+cvsTitle);
    System.out.println("Expected Title: "+expectedTitle);
}
driver.close();


//       driver.navigate().back();
//        System.out.println(driver.getTitle());
//       Thread.sleep(2000);
//
//       driver.navigate().back();
//       Thread.sleep(2000);
//
//       driver.navigate().refresh();

    }
}
