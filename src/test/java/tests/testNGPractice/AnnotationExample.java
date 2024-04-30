package tests.testNGPractice;

import org.testng.Assert;
import org.testng.annotations.*;

public class AnnotationExample {

    @BeforeSuite
    public static void beforeSuiteMethod(){
        System.out.println("Setting up the suite environment.");
    }

    @BeforeTest
    public static void beforeTestMethod(){
        System.out.println("Configuring test environment");
    }

    @BeforeClass
    public static void beforeClassMethod(){
        System.out.println("Loading class resources.");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Initializing test method setup.");
    }

    @Test
    public void test1(){
        System.out.println("I am test 1");
        Assert.assertTrue(3>2);
    }

    @Test
    public void test2(){
        System.out.println("I am test 2");
        Assert.assertTrue(3==3);
    }

    @Test
    public void test3(){
        System.out.println("I am test 3");
        Assert.assertFalse(3<2);
    }

    @AfterTest
    public void afterMethod(){
        System.out.println("Cleaning up after test method.");
    }

    @AfterTest
    public static void afterClassMethod(){
        System.out.println("Releasing class resources.");
    }

    @AfterTest
    public static void afterTestMethod(){
        System.out.println("Tearing down test environment.");
    }

    @AfterSuite
    public static void afterSuiteMethod(){
        System.out.println("Cleaning up the suite environment.");
    }








}
