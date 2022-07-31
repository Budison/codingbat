package com.github.budison.codingbat.logic2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoneSumTest {

    @Test
    void testLoneSum() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(LoneSum.loneSum(1, 2, 3), 6);
        softAssert.assertEquals(LoneSum.loneSum(3, 2, 3), 2);
        softAssert.assertEquals(LoneSum.loneSum(3, 3, 3), 0);
        softAssert.assertEquals(LoneSum.loneSum(2, 2, 9), 9);
        softAssert.assertEquals(LoneSum.loneSum(4, 2, 3), 9);
        softAssert.assertEquals(LoneSum.loneSum(1, 3, 1), 3);

        // Then
        softAssert.assertAll();
    }
}
