package OfficeHours;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class StatusCodesWithNurullah {

    @Test(priority = 0, description = "Verify that following message is displayed: 'This page returned a 500 status code'")
    public void testCase12() {
        // Test case #12
        /*
        Step 1. Go to "https://practice-cybertekschool.herokuapp.com"
        Step 2. And click on "Status Codes"
        Step 3.Then click on "500".Step
        Step 4.Verify that following message is displayed: "This page returned a 500 status code"

         */
        //Step 1.
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://practice-cybertekschool.herokuapp.com");

        //Step 2.
        /*
        xpath:
        //a[text()="Status Codes"]
        //a[contains(text(),'Status Codes')]
        //ul/li[46]
        //a[@href="/status_codes"]

        linkText:
        linkText("Status Codes")

         partialLinkText:
         partialLinktext("Status Codes")
         partialLinktext("Status")
         partialLinktext("Codes")

         CssSelector
         [href="/status_codes"]

         */
        WebElement statusCodeLink = driver.findElement(By.linkText("Status Codes"));
        statusCodeLink.click();

        //Step 3.

        WebElement statusCode = driver.findElement(By.xpath("//a[@href=\"status_codes/500\"]"));
        statusCode.click();

        //Step 4.
        String expectedMessage = "This page returned a 500 status code";

        WebElement displayedmessageElement = driver.findElement(By.xpath("//p"));
        String actualMessage = displayedmessageElement.getText();
        //System.out.println(actualMessage);

        if (actualMessage.contains(expectedMessage)) {
            System.out.println("Passed");
        } else {
            System.out.println("Failed");
        }
        driver.close();
    }

        /*
        Test Case # 11
        Step 1. Go to "https://practice-cybertekschool.herokuapp.com"
        Step 2. And click on "Status Codes"
        Step 3.Then click on "404".
        Step 4.Verify that following message is displayed: "This page returned a 404 status code"

         */
        @Test(priority = 1, description = "Verify that following message is displayed: 'This page returned a 404 status code'")
        public void testCase11 () throws InterruptedException {
            //Step 1
            WebDriver driver = WebDriverFactory.getDriver("chrome");
            driver.get("https://practice-cybertekschool.herokuapp.com");

            //Step 2
            WebElement statusCodeLink = driver.findElement(By.linkText("Status Codes"));
            statusCodeLink.click();

            //Step 3
            WebElement statusCode = driver.findElement(By.linkText("404"));
            statusCode.click();

            //Step 4
            Thread.sleep(3000);
            String expectedMessage = "This page returned a 404 status code";
            WebElement displayedmessageElement = driver.findElement(By.xpath("//p"));
            String actualMessage = displayedmessageElement.getText();
            //System.out.println(actualMessage);

            if (actualMessage.contains(expectedMessage)) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
            driver.close();


        }


    }



