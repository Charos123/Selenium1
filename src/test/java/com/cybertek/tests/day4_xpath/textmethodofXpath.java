package com.cybertek.tests.day4_xpath;

import com.cybertek.utilities.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class textmethodofXpath {
    public static void main(String[] args) {
        /*
         go to "http://practice.cybertekschool.com/context_menu"
          verify context menu is on the page

          //tagName[text()='exact Text']
         */


        WebDriver driver= WebDriverFactory.getDriver("chrome");
        //locate the element Context Menu
        driver.get("http://practice.cybertekschool.com/context_menu");

        WebElement text=driver.findElement(By.xpath("//h3[text()='Context Menu']"));

        //Verify -->expect vs actual
        String  exptText= "Context Menu";
        String actualText=text.getText();
        if(exptText.equalsIgnoreCase(actualText)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        driver.close();

    }
}
