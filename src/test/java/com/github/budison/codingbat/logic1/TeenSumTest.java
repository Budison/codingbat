package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TeenSumTest {

    @Test
    void testTeenSum() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertEquals(TeenSum.teenSum(3, 4), 7);
        softAssert.assertEquals(TeenSum.teenSum(10, 13), 19);
        softAssert.assertEquals(TeenSum.teenSum(13, 2), 19);
        softAssert.assertEquals(TeenSum.teenSum(3, 19), 19);
        softAssert.assertEquals(TeenSum.teenSum(13, 13), 19);
        softAssert.assertEquals(TeenSum.teenSum(10, 10), 20);
        softAssert.assertEquals(TeenSum.teenSum(6, 14), 19);
        softAssert.assertEquals(TeenSum.teenSum(19, 20), 19);
        softAssert.assertEquals(TeenSum.teenSum(6, 7), 13);

        // Then
        softAssert.assertAll();

    }
}
