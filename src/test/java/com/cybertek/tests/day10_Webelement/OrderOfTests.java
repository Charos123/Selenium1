package com.cybertek.tests.day10_Webelement;

import org.testng.Assert;
import org.testng.annotations.Test;

public class OrderOfTests {

    String title;
    @Test(priority = 1)
     public void login(){
        System.out.println("open the browser");
        System.out.println("capturing title");
        title="cbt";

    }
     @Test(priority =0)
    public void assertTitle(){
         System.out.println("verifying the title");
         Assert.assertEquals(title,"cbt");

     }
      @Test(priority =55)
    public void verifyOtherThings(){
          System.out.println("verify sth else");

      }
}
