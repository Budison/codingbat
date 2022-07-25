package com.github.budison.codingbat.logic1;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LastDigitTest {

    @Test
    void testLastDigit() {
        // Given
        SoftAssert softAssert = new SoftAssert();

        // When
        softAssert.assertTrue(LastDigit.lastDigit(0, 1, 0));
        softAssert.assertTrue(LastDigit.lastDigit(11, 1, 0));
        softAssert.assertTrue(LastDigit.lastDigit(105, 15, 3));
        softAssert.assertTrue(LastDigit.lastDigit(10, 1, 200));

        softAssert.assertFalse(LastDigit.lastDigit(0, 1, 23));
        softAssert.assertFalse(LastDigit.lastDigit(1, 2, 3));
        softAssert.assertFalse(LastDigit.lastDigit(521, 23, 600));
        softAssert.assertFalse(LastDigit.lastDigit(4, 43, 432));

        // Then
        softAssert.assertAll();
    }
}
