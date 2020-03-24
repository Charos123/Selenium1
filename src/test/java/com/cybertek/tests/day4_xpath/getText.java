package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {
    public static void main(String[] args) throws Exception {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // go to password web page
        //"http://practice.cybertekschool.com/forgot_password");
        //2. enter any email
        //3. click "retrieve password" bttb
        //4.verify the URL is:
        //
        driver.get("http://practice.cybertekschool.com/forgot_password");
        driver.manage().window().maximize();
        Thread. sleep(2000);
        WebElement subbtn = driver.findElement(By.id("form_submit"));

        //enter  any email
        //locate the email box first
        WebElement emailBox= driver.findElement(By.name("email"));
        //enter email---> sendKeys()
        emailBox.sendKeys("abc@gmail.com");
        Thread. sleep(2000);
        //3. click "retrieve password" bttb
        //locate the bttn first
        WebElement bttn = driver.findElement(By.id("form_submit"));
        //click the button
        bttn.submit();
        //verify that the confirmation
        //submit email by clicking the 'retrieve password'
        String expectedText="Your e-mail's been sent!";

        WebElement message =driver.findElement(By.name("confirmation_message"));
        String actualText=message.getText();// converting to String

        if(expectedText.equalsIgnoreCase(actualText)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("expectedText was"+ expectedText);
            System.out.println("actualText was"+actualText);
        }
        driver.close();




        //verify that the comnfirmation text "Your e-mail's been sent!"


    }
}
