package com.github.budison.codingbat.recursion1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FibonacciTest {
    @Test
    void testFibonacci() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(Fibonacci.fibonacci(0), 0);
        softAssert.assertEquals(Fibonacci.fibonacci(1), 1);
        softAssert.assertEquals(Fibonacci.fibonacci(2), 1);
        softAssert.assertEquals(Fibonacci.fibonacci(3), 2);
        softAssert.assertEquals(Fibonacci.fibonacci(4), 3);
        softAssert.assertEquals(Fibonacci.fibonacci(5), 5);
        softAssert.assertEquals(Fibonacci.fibonacci(6), 8);
        softAssert.assertEquals(Fibonacci.fibonacci(7), 13);
        softAssert.assertEquals(Fibonacci.fibonacci(8), 21);

        // Then
        softAssert.assertAll();
    }
}
