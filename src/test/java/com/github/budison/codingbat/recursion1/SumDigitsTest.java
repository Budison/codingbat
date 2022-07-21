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
        softAssert.assertEquals(SumDigits.sumDigits(123), 6);
        softAssert.assertEquals(SumDigits.sumDigits(91), 10);
        softAssert.assertEquals(SumDigits.sumDigits(0), 0);
        softAssert.assertEquals(SumDigits.sumDigits(1001), 2);

        // Then
        softAssert.assertAll();
    }
}
