package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SumLimitTest {

    @Test
    void testSumLimit() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(SumLimit.sumLimit(2, 3), 5);
        softAssert.assertEquals(SumLimit.sumLimit(8, 3), 8);
        softAssert.assertEquals(SumLimit.sumLimit(123, 1), 124);
        softAssert.assertEquals(SumLimit.sumLimit(23, 80), 23);
        softAssert.assertEquals(SumLimit.sumLimit(9000, 1000), 9000);

        // Then
        softAssert.assertAll();
    }
}
