package com.github.budison.codingbat.logic2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LuckySumTest {

    @Test
    void testLuckySum() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(LuckySum.luckySum(1, 2, 3), 6);
        softAssert.assertEquals(LuckySum.luckySum(1, 13, 13), 1);
        softAssert.assertEquals(LuckySum.luckySum(13, 5, 2), 0);
        softAssert.assertEquals(LuckySum.luckySum(6, 5, 13), 11);

        // Then
        softAssert.assertAll();
    }
}
