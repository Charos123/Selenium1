package OfficeHours;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeworkShortCuts {
    public static void main(String[] args) throws InterruptedException {
        shortcuts();

       /*
        1. Open browser
        2. Go to Vytrack login page
        3. Login as a sales manager
        4. Verify Dashboard page is open
        5. Click on Shortcuts icon
        6. Click on link See full list
        7. Click on link Opportunities
        8. Verify Open opportunities page is open
        9. Click on Shortcuts icon
        10. Click on link See full list
        11. Click on link Vehicle Service Logs
        12. Verify error message text is You do not have
        permission to perform this action.
        13. Verify Shortcut Actions List page is still open
 */
    }

    private static void shortcuts() throws InterruptedException {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://qa3.vytrack.com");

        WebElement username= driver.findElement(By.id("prependedInput"));
        username.sendKeys("SalesManager110");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        password.submit();

        Thread.sleep(2000);
         String expectedTitle ="Dashboard";
         String actualTitle= driver.getTitle();

        verifyStartsWith(expectedTitle, actualTitle);

        WebElement shortCut =driver.findElement(By.cssSelector("a[title='Shortcuts']"));
        shortCut.click();

        WebElement allLinks=driver.findElement(By.linkText("See full list"));
        allLinks.click();


        Thread.sleep(2000);
        WebElement opportunities = driver.findElement(By.linkText("Opportunities"));
        opportunities.click();

        Thread.sleep(2000);
        expectedTitle= "Open Opportunities";
        actualTitle=driver.getTitle();


        Thread.sleep(2000);
        verifyStartsWith("Open Opportunities",driver.getTitle());

        shortCut.click();
        allLinks.click();

        Thread.sleep(2000);
        WebElement VehicleServiceLogs = driver.findElement(By.linkText("Vehicle Services Logs"));
        VehicleServiceLogs.click();

        Thread.sleep(2000);
        WebElement errorMessage= driver.findElement(By.cssSelector(".message"));
       // System.out.println(errorMessage.getText());

        verifyStartsWith("You do not have permission to perform this action.",errorMessage.getText());


       // driver.close();
        }

    private static void verifyStartsWith(String expectedTitle, String actualTitle) {
        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
            System.out.println("expected " +expectedTitle);
            System.out.println("actual "  +actualTitle);
        }
    }
    //write a method that takes 2 strings, verifies if string 2




    }

