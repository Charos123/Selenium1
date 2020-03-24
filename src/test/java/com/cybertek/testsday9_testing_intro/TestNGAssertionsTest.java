package com.cybertek.testsday9_testing_intro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNGAssertionsTest {

    @Test
    public void test1() {
        String expected = "one";
        String actual = "one";

        Assert.assertEquals(actual, expected);
        Assert.assertEquals(1, 1);
        Assert.assertEquals(true, true);

        System.out.println("test 1 complete");
    }

    @Test
    public void test2() {
        String expected = "one";
        String actual = "two";

        System.out.println("starting to compare");

        Assert.assertEquals(actual, expected);

        System.out.println("test 2 complete");

    }

    @Test
    public void test3() {
        String expected = "one";
        String actual = "two";
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void test4() {
        String expected = "one";
        String actual = "not one ";

        Assert.assertTrue(expected.equals(actual));
        int e = 100;
        int a= 200;
        Assert.assertTrue(a>e);
    }
    @Test
    public void test5() {

        String expected ="https://www.google.com/";
        String actual="https://www.google.com/";
        Assert.assertEquals(expected,actual);

        //veryfy that title starts with java
       // String exp1= "java";
        String actual1= "java -Google Search";


    }
}