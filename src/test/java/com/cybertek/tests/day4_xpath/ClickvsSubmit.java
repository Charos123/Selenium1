package com.cybertek.tests.day4_xpath;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickvsSubmit {
    public static void main(String[] args)  throws Exception{
        /*
        Click()
        submit()
         task:
         go to forgot password web page
        http://practice.cybertekschool.com/forgot_password
        enter my email
         click "retrieve password"bttb

         verify the URLis:
        http://practice.cybertekschool.com/email_sent
         */
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        // go to password web page
         driver.get("http://practice.cybertekschool.com/forgot_password");
          driver.manage().window().maximize();
           Thread. sleep(2000);

           //enter  any email
      WebElement emailBox= driver.findElement(By.name("email"));

      //enter email---> sendKeys()
        emailBox.sendKeys("abc@gmail.com");

        //click "retrieve  password" bttb
        //locate the bttn first
         WebElement submitBtn =driver.findElement(By.id("form_submit"));

         // submit email  by clicking the "retrieve  password"
        submitBtn.submit();

        //Verify --> Expected

        String expectURL= "http://practice.cybertekschool.com/email_sent";
        String actualURL=driver.getCurrentUrl();

        if(expectURL.equalsIgnoreCase(actualURL)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("Expected URL="+expectURL);
            System.out.println("Actual URL="+actualURL);
        }
        driver.close();


    }
}
