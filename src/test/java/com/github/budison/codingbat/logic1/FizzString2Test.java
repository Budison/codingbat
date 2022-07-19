package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FizzString2Test {
    @Test
    void testFizzString2() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(FizzString2.fizzString2(1), "1!");
        softAssert.assertEquals(FizzString2.fizzString2(2), "2!");
        softAssert.assertEquals(FizzString2.fizzString2(4), "4!");

        softAssert.assertEquals(FizzString2.fizzString2(3), "Fizz!");
        softAssert.assertEquals(FizzString2.fizzString2(6), "Fizz!");
        softAssert.assertEquals(FizzString2.fizzString2(21), "Fizz!");

        softAssert.assertEquals(FizzString2.fizzString2(5), "Buzz!");
        softAssert.assertEquals(FizzString2.fizzString2(100), "Buzz!");

        softAssert.assertEquals(FizzString2.fizzString2(15), "FizzBuzz!");
        softAssert.assertEquals(FizzString2.fizzString2(45), "FizzBuzz!");

        // Then
        softAssert.assertAll();
    }
}
