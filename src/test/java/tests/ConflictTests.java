package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ConflictTests {

    @Test
    public void test1(){
        int a = 100;
        int b = 10;
        int sum = (a + b) * 2;
        System.out.println("Sum: " + sum);
    }

    @Test
    public void test2(){
        String message = "Welcome to USA - the land of opportunities!";
        System.out.println(message);
        Assert.assertEquals("Welcome to USA country!", message);
    }
}
