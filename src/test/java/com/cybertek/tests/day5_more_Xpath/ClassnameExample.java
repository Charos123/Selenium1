package com.cybertek.tests.day5_more_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class ClassnameExample {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");//http://practice.cybertekschool.com/multiple_buttons
//"http://practice.cybertekschool.com/login

//        WebElement link = driver.findElement(By.className("nav-link"));
//        System.out.println(link.getText());
//
//        //class name does not work if the value of the class attribute has a space
//        WebElement loginBtn =driver.findElement(By.className("btn btn-primary"));
//        loginBtn.click();
//    }
    }
}