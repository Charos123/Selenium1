package com.cybertek.tests.day15_webtables;

import com.cybertek.base.TestBase;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class WebTablesTests extends TestBase {


    @BeforeMethod
    public void setUp(){
        String url = ConfigurationReader.getPropery("url");
        driver.get(url);
        driver.findElement(By.linkText("Sortable Data Tables")).click();
    }

    //GeT WHOLE TABLE
    @Test
    public void printTable(){

        WebElement myTable =driver.findElement(By.id("table1"));
        System.out.println(myTable.getText());

    }

    //Get ALL HEADERS
    @Test
    public void getHeaders(){

        //get all headers in a list
        List<WebElement>headers= (List<WebElement>) driver.findElement(By.xpath("//table[@id=table1']//th"));
        System.out.println(headers.size());


        for(WebElement header : headers){
            System.out.println(header.getText());
        }
       List<String>headerStr= BrowserUtils.getElementsText(headers);
        //use BrowserUtils to get the list of headers as text and print
        System.out.println(BrowserUtils.getElementsText(headers));
    }
//Get table size
    @Test
    public void getTableSize(){
        //get number of cols
        List<WebElement>headers= (List<WebElement>) driver.findElement(By.xpath("//table[@id='table1']//th"));
        System.out.println("Number columns :"+headers.size());

        //get number of rows including header
        List<WebElement>rowsWithHeader=driver.findElements(By.xpath("//table[@id='table1']//tr"));
        System.out.println("Number of row with header: "+ rowsWithHeader.size());

        //get number of rows without header
         List<WebElement> rowsWithoutHeader= (List<WebElement>) driver.findElement(By.xpath("//table[@id='table1']/tbody/tr"));
        System.out.println("Number of row without header: "+ rowsWithoutHeader.size());

    }
    //Get Single Row By Index
    @Test
     public void getSingleRowByIndex(){
        //get the first row (in the body)
        WebElement row = driver.findElement(By.xpath("//table[@id='table1']//tr[1]"));
        System.out.println(row.getText());

        //get the first row (in the body) dynamic xpath
        String xpath= getTableRowXpath(2);
        System.out.println(row);
    }
    //getTableRowXpath based on index
public static String getTableRowXpath(int index){
        String xpath="//table[@id='table1']//tbody/tr["+index+"]";
        return xpath;
}

//GET SINGLE CELL BASED ON INDEX
    @Test
    public void getSingleBasedByIndex(){
        WebElement cell=driver.findElement(By.xpath("//table[@id='table1']/tbody/tr[1]/td[1]"));
        System.out.println(cell.getText());
    }
    // public static String getcellXpathbyIndex(int row, int column){
     //   String xpath=
     }



