package OfficeHours;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class StatusCodesWithNurullahN2 {

 private WebDriver driver;

@BeforeMethod
public  void setUp(){
    driver= WebDriverFactory.getDriver("chrome");
    driver.get("https://practice-cybertekschool.herokuapp.com");
}
    /*
    DataProvider--> Provides data to test cases
     */

    @DataProvider(name="testData")
    public static Object [] testData(){
        return new Object [] {"404","500", "301", "200"};
    }
    /*
    DataProvider return data in form of single dimensional object array(Object []) or 2 dimensional  object array (Object [] [])
    Object [] --> when you have only 1 parameter
    Object[] []--> When you have 2+ parameters
    cannot carry primitive data(int, byte) but it can carry
    wrapper class objects (Integer,Byte)
     */

    @Test (dataProvider = "testData")
    public void statusCodes(String code) {

        //Step 2
        WebElement statusCodeLink = driver.findElement(By.linkText("Status Codes"));
        statusCodeLink.click();

        //Step 3
        WebElement statusCode = driver.findElement(By.linkText(code));
        statusCode.click();

        //Step 4
        String expectedMessage = "This page returned a "+code+" status code";
        WebElement displayedmessageElement = driver.findElement(By.xpath("//p"));
        String actualMessage = displayedmessageElement.getText();
        //System.out.println(actualMessage);

//        if (actualMessage.contains(expectedMessage)) {
//            System.out.println("Passed");
//        } else {
//            System.out.println("Failed");
//        }

        /*
        The following is a Hard assertion and contains a message that is  displayed only if the assertion fails
        When  a Hard assertion fails the rest of the script is skipped
         */

        Assert.assertTrue(actualMessage.contains(expectedMessage), "The  status code doen't exist");

    }
    @AfterMethod
    public void tearDown(){
        driver.close();

    }

}



