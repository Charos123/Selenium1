package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {
    public static void main(String[] args) {

    }
    //write a  static return method which returns WebDribver
    //name: getDriver
    //it takes  a Strring as a parameter--> browser type
    //returns ChromeDriver and FirefoxDriver
    public static WebDriver getDriver(String browserType){
        //local variable
        WebDriver driver=null;
        switch(browserType.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver=new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
        }
        return driver;
    }
        }

