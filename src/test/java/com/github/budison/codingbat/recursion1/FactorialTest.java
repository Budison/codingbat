package com.github.budison.codingbat.recursion1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FactorialTest {

    @Test
    void testFactorial() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(Factorial.factorial(1), 1);
        softAssert.assertEquals(Factorial.factorial(2), 2);
        softAssert.assertEquals(Factorial.factorial(3), 6);
        softAssert.assertEquals(Factorial.factorial(4), 24);
        softAssert.assertEquals(Factorial.factorial(5), 120);
        softAssert.assertEquals(Factorial.factorial(6), 720);
        softAssert.assertEquals(Factorial.factorial(7), 5040);
        softAssert.assertEquals(Factorial.factorial(8), 40320);
        softAssert.assertEquals(Factorial.factorial(12), 479001600);

        // Then
        softAssert.assertAll();
    }
}
