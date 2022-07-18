package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FizzStringTest {
    @Test
    void testFizzString() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(FizzString.fizzString("fig"), "Fizz");
        softAssert.assertEquals(FizzString.fizzString("Foo"), "Fizz");

        softAssert.assertEquals(FizzString.fizzString("Bib"), "Buzz");
        softAssert.assertEquals(FizzString.fizzString("b"), "Buzz");

        softAssert.assertEquals(FizzString.fizzString("fib"), "FizzBuzz");
        softAssert.assertEquals(FizzString.fizzString("F------b"), "FizzBuzz");


        softAssert.assertEquals(FizzString.fizzString("abc"), "abc");
        softAssert.assertEquals(FizzString.fizzString("cool"), "cool");

        // Then
        softAssert.assertAll();
    }
}
