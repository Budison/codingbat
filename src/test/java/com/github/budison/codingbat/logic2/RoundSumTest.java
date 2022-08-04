package com.github.budison.codingbat.logic2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RoundSumTest {

    @Test
    void testRoundSum() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(RoundSum.roundSum(16, 17, 18), 60);
        softAssert.assertEquals(RoundSum.roundSum(12, 13, 14), 30);
        softAssert.assertEquals(RoundSum.roundSum(0, 0, 1), 0);
        softAssert.assertEquals(RoundSum.roundSum(23, 11, 26), 60);
        softAssert.assertEquals(RoundSum.roundSum(12, 10, 24), 40);

        // Then
        softAssert.assertAll();
    }
}
