package com.cybertek.tests.day8_review_2;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class VytrackShortcut {
    public static void main(String[] args) throws Exception {
        shortcutTest();
    }
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
    private static void shortcutTest() throws InterruptedException {
        WebDriver drive = WebDriverFactory.getDriver("chrome");
        drive.get("https://qa3.vytrack.com/");
        WebElement username = drive.findElement(By.id("prependedInput"));
        username.sendKeys("salesmanager110");
        WebElement password = drive.findElement(By.id("prependedInput2"));
        password.sendKeys("UserUser123");
        password.submit();
        Thread.sleep(3000);
        String expectedTitle = "Dashboard";
        String actualTitle = drive.getTitle();

        if(actualTitle.startsWith(expectedTitle)){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }
        verifyStartsWith(expectedTitle, actualTitle);
        WebElement shortcutIcon = drive.findElement(By.cssSelector("a[title='Shortcuts']"));
        shortcutIcon.click();
        WebElement allLinks = drive.findElement(By.linkText("See full list"));
        allLinks.click();
        Thread.sleep(3000);
        WebElement opportunities = drive.findElement(By.linkText("Opportunities"));
        opportunities.click();
        Thread.sleep(3000);
        expectedTitle = "Open Opportunities";
        actualTitle = drive.getTitle();
        verifyStartsWith(expectedTitle,actualTitle);
        //verifyStartsWith("Open Opportunities", drive.getTitle());   ---> another option
        shortcutIcon.click();
        allLinks.click();
        Thread.sleep(3000);
        WebElement vehicleServiceLogs = drive.findElement(By.linkText("Vehicle Services Logs"));
        vehicleServiceLogs.click();
        Thread.sleep(3000);
        WebElement errorMsg = drive.findElement(By.cssSelector(".message"));
        verifyStartsWith("You do not have permission to perform this action.",errorMsg.getText());
       // verifyStartsWith("Sortcut Action List")
        // System.out.println(errorMsg.getText());
    }
    private static void verifyStartsWith(String expectedTitle, String actualTitle) {
        if (actualTitle.startsWith(expectedTitle)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("expectedTitle = " + expectedTitle);
            System.out.println("actualTitle = " + actualTitle);
        }
    }


}
