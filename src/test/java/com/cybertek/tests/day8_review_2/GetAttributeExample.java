package com.cybertek.tests.day8_review_2;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GetAttributeExample {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("https://ebay.com");

        //get title
        System.out.println(driver.getTitle());

        //get current url
        System.out.println(driver.getCurrentUrl());

        //get page source
        System.out.println(driver.getPageSource());


        WebElement myEbayLink = driver.findElement(By.linkText("My eBay"));

        //get certain values of attributes
        String classValue = myEbayLink.getAttribute("class");
        System.out.println(classValue);
        String href = myEbayLink.getAttribute("href");
        System.out.println(href);

        //get test of web element
        System.out.println(myEbayLink.getText());

        WebElement input = driver.findElement(By.id("gh-ac"));

        input.sendKeys("wooden spoon");
        System.out.println(input.getAttribute("value"));

        // .getAttribute("innterHTML") --> returns text of the element
        System.out.println(myEbayLink.getAttribute("innerHTML"));//inerHtml returns only inside some part of text> My eBay<

        // .getAttribute("outerHTML") --> returns html information of element
        System.out.println(myEbayLink.getAttribute("outerHTML"));//outerHtml returns all information from < tag to closing  </>tag






    }
}
