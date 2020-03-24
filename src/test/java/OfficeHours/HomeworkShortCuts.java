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
       // 1. Open browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");

       // 2. Go to Vytrack login page
        driver.get("https://qa3.vytrack.com");

        //3. Login as a sales manager
        WebElement username= driver.findElement(By.id("prependedInput"));
        username.sendKeys("SalesManager110");
        Thread.sleep(2000);

        WebElement password = driver.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        password.submit();

        // 4. Verify Dashboard page is open
        Thread.sleep(2000);
         String expectedTitle ="Dashboard";
         String actualTitle= driver.getTitle();

        // 4. Verify Dashboard page is open
        verifyStartsWith(expectedTitle, actualTitle);

       // 5. Click on Shortcuts icon
        WebElement shortCut =driver.findElement(By.cssSelector("a[title='Shortcuts']"));
        shortCut.click();

       // 6. Click on link See full list
        WebElement allLinks=driver.findElement(By.linkText("See full list"));
        allLinks.click();

        //   7. Click on link Opportunities
        Thread.sleep(2000);
        WebElement opportunities = driver.findElement(By.linkText("Opportunities"));
        opportunities.click();

        Thread.sleep(2000);
        expectedTitle= "Open Opportunities";
        actualTitle=driver.getTitle();

    //    8. Verify Open opportunities page is open
        Thread.sleep(2000);
        verifyStartsWith("Open Opportunities",driver.getTitle());

        //   9. Click on Shortcuts icon
        shortCut.click();

       // 10. Click on link See full list
        allLinks.click();

        //  11. Click on link Vehicle Service Logs
        Thread.sleep(2000);
        WebElement VehicleServiceLogs = driver.findElement(By.linkText("Vehicle Services Logs"));
        VehicleServiceLogs.click();

        Thread.sleep(2000);
        WebElement errorMessage= driver.findElement(By.cssSelector(".message"));
       // System.out.println(errorMessage.getText());


        // 12. Verify error message text is You do not have
        //        permission to perform this action.
        verifyStartsWith("You do not have permission to perform this action.",errorMessage.getText());

        // 13. Verify Shortcut Actions List page is still open
        verifyStartsWith("Shortcut Actions List",driver.getTitle());
        driver.quit();


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




    }

