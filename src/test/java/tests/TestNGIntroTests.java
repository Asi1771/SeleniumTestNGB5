package tests;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNGIntroTests {
    @BeforeTest
    public static void beforeTestMethod(){
        System.out.println("THIS IS BEFORE TEST IN TESTING INTRO CLASS");
    }

    @AfterTest
    public static void afterTestMethod(){
        System.out.println("THIS IS AFTER TEST IN TESTING INTRO CLASS");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("Before Class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("This is before method");
    }

    @Test
    public void test1(){
        System.out.println("I am test 1");
        Assert.assertTrue(5>2);
    }

    @Test
    public void test2(){
        System.out.println("Test 2");
        Assert.assertFalse(2>5);
    }

    @Test
    public void test3() {
        System.out.println("Test 3");
    }

    @Test
    public void test4() {
        System.out.println("Test 4");
    }


}
