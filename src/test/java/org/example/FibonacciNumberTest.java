package org.example;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciNumberTest {

    @Test
    public void fibonacciNumberOf1(){
        Assert.assertEquals(1, FibonacciNumber.fib(1));
    }

    @Test
    public void fibonacciNumberOf10(){
        Assert.assertEquals(55, FibonacciNumber.fib(10));
    }
}