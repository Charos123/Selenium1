package com.cybertek.tests.day5_more_Xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class XpathDemo {
    public static void main(String[] args) {
        //get chrome
        WebDriver driver= WebDriverFactory.getDriver("chrome");
         //open browser
        driver.get("http://practice.cybertekschool.com/multiple_buttons");
        //represent an element from page
        //where the elementd come from?
        // from the fineElement methods
        //how fineElement finds elements?
        //using locators
        WebElement buttonOne= driver.findElement(By.xpath("//button[@onclick='button1()']"));
        //start interacting with the element
        String txt=buttonOne.getText();
        System.out.println("Button one :"+txt);

        WebElement buttonTwo= driver.findElement(By.xpath("//h3/following-sibling::button[2]"));
        System.out.println("Button two : "+ buttonTwo.getText());

        WebElement buttonthree= driver.findElement(By.xpath("/html/body/div/div[2]/div/div/button[3]"));
        System.out.println("Button three: "+ buttonthree.getText());

        WebElement buttonfour= driver.findElement(By.xpath("//button[4]"));
        System.out.println("Button four: "+buttonfour.getText());

        WebElement buttonfive= driver.findElement(By.xpath("//button[.='Button 5']"));
        System.out.println("button five: "+buttonfive.getText());

        WebElement buttonsix= driver.findElement(By.cssSelector("//button[@id='disappearing_button']"));
        System.out.println("Button six:"+buttonsix.getText());



    }
}
