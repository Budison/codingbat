package com.github.budison.codingbat.recursion1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SumDigitsTest {
    @Test
    void testSumDigits() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(SumDigits.sumDigits(126), 9);
        softAssert.assertEquals(SumDigits.sumDigits(49), 13);
        softAssert.assertEquals(SumDigits.sumDigits(12), 3);
        softAssert.assertEquals(SumDigits.sumDigits(10), 1);

        // Then
        softAssert.assertAll();
    }
}
