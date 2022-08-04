package com.github.budison.codingbat.logic2;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class NoTeenSumTest {

    @Test
    void testNoTeenSum() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(NoTeenSum.noTeenSum(1, 2, 3), 6);
        softAssert.assertEquals(NoTeenSum.noTeenSum(2, 13, 1), 3);
        softAssert.assertEquals(NoTeenSum.noTeenSum(2, 1, 14), 3);
        softAssert.assertEquals(NoTeenSum.noTeenSum(17, 19, 18), 0);
        softAssert.assertEquals(NoTeenSum.noTeenSum(17, 18, 16), 16);

        // Then
        softAssert.assertAll();
    }
}
