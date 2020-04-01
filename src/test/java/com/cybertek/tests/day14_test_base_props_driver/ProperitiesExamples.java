package com.cybertek.tests.day14_test_base_props_driver;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import java.util.Properties;

public class ProperitiesExamples {

    @Test
    public void test() {


        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.version"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("user.name"));


        // browser url
        //Properties --> class from java that saves key value combinations
        Properties properties = new Properties();
        properties.setProperty("browser", "chrome");
        properties.setProperty("url", "http://practice.cybertekschool.com");

        String browser = properties.getProperty("browser");
        System.out.println("browser name =" + browser);


        //I need the browser/url from properties file

        String pBrowser = ConfigurationReader.getPropery("browser");
        System.out.println("pBrowser=" + pBrowser);

        String purl = ConfigurationReader.getPropery("url");
        System.out.println("pUrl= "+ purl);
    }
     @Test
    public  void  test2(){
         WebDriver driver= WebDriverFactory.getDriver("chrome");

         //get the from props file
         String url =(ConfigurationReader.getPropery("url"));
         driver.get(url);
         driver.close();
         String str = Singleton.getInstance().toUpperCase();
         System.out.println(str);
     }
     @Test
    public void test3(){
        String str = Singleton.getInstance();
         System.out.println(str);
     }
}
